class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var indexOfMax = 0
        for (i in 0..nums.lastIndex) {
            if (nums[i] > nums[indexOfMax]) {
                indexOfMax = i
            }
        }
        for (i in 0..nums.lastIndex) {
            if ((nums[i] * 2 <= nums[indexOfMax]) || nums[i] == nums[indexOfMax]) {
                continue
            } else {
                return -1
            }
        }
        return indexOfMax
    }
}