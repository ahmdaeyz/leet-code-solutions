class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
    var left = 0
    var right = nums.size-1
    var index = nums.size-1
    val solution = IntArray(nums.size)
    while (left<=right){
        if(Math.abs(nums[left]) < Math.abs(nums[right])){
            solution[index] = nums[right]*nums[right]
            right--
            index--
        }else{
            solution[index] = nums[left]*nums[left]
            left++
            index--
        }
    }
    return  solution
}
}