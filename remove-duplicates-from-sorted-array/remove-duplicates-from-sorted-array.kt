class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for(i in 0 until  nums.size){
            if(i+1< nums.size){
                if(nums[i] == nums[i+1]){
                    nums[i] = -101
                    count++
                }
            }
        }
        var lastIndexOfNumber = 0

        for(i in 0 until nums.size){
            if(nums[i] != -101){
                if(lastIndexOfNumber< nums.size){
                    nums[lastIndexOfNumber] = nums[i]
                }
                lastIndexOfNumber++
            }
        }
        return nums.size - count;
    }

}