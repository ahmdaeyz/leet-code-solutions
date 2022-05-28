class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastIndexOfNumber = 0
        var zerosCount = 0

        for (i in 0 until nums.size) {
            if (nums[i] == 0) {
                zerosCount++
            }
        }

        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                if (lastIndexOfNumber < nums.size) {
                    nums[lastIndexOfNumber] = nums[i]
                }
                lastIndexOfNumber++
            }
        }

        for (i in nums.lastIndex downTo nums.size - zerosCount) {
            nums[i] = 0
        }

    }
}