class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        if (nums.size == k || nums.isEmpty()) return
        var newK = k%nums.size
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
        left = 0
        right = newK-1
        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }

        left = newK
        right = nums.lastIndex
        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
    }
    
    fun rotateSlow(nums: IntArray, k: Int): Unit {
        if (nums.size == k || nums.isEmpty()) return
        for (i in 0 until k) {
            for (j in nums.lastIndex downTo 1) {
                val current = nums[j]
                nums[j] = nums[j - 1]
                nums[j - 1] = current
            }
        }
    }
}

