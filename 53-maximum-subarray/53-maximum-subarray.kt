class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var largestSum = Int.MIN_VALUE;
        var largestSumEndingHere = 0
        for(i in 0 .. nums.lastIndex){
            largestSumEndingHere += nums[i]
            if(largestSum < largestSumEndingHere){
                largestSum=largestSumEndingHere
            }
            if(largestSumEndingHere<0){
                largestSumEndingHere = 0
            }
        }
        return  largestSum
    }
}