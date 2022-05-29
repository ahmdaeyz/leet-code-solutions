class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var left = 0
        var right = nums.lastIndex
        while (right > left) {
            if (nums[left] % 2 != 0 && nums[right] % 2 != 0) {
                right--
            } else if (nums[left] % 2 != 0) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
                right--
            } else {
                left++
            }
        }
        return nums
    }
}