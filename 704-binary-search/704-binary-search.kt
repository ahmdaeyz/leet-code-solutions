import kotlin.math.sign

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return internalSearch(nums, target, 0, nums.lastIndex)
    }

    fun internalSearch(nums: IntArray, target: Int, from: Int, to: Int): Int {
        val midIndex = to + from / 2
        if (midIndex<0||midIndex>nums.lastIndex) return -1
        return if (target == nums[midIndex]) {
            return midIndex
        } else if (target > nums[midIndex]) {
            internalSearch(nums, target, midIndex + 1, nums.size)
        } else {
            internalSearch(nums, target, 0, midIndex - 1)
        }
    }

}