class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex
        while (low <= high) {                     
            val mid = low + (high - low) / 2
            if (nums[mid] == target) {
                return mid
            } else if (target < nums[mid]) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return low
    }
}