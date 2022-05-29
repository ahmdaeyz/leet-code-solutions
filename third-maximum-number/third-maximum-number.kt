class Solution {
    fun thirdMax(nums: IntArray): Int {
        val firstMax = findMax(nums) { _ -> true }
        val secondMax = findMax(nums) { num -> num != firstMax }
        val thirdMax = findMax(nums) { num -> num != secondMax && num != firstMax }

        return (thirdMax ?: firstMax)!!
    }

    fun findMax(nums: IntArray, predicate: (num: Int) -> Boolean): Int? {
        var maxValue = Long.MIN_VALUE
        for (i in 0..nums.lastIndex) {
            if (nums[i] > maxValue && predicate(nums[i])) {
                maxValue = nums[i].toLong()
            }
        }
        return if (maxValue == Long.MIN_VALUE) null else maxValue.toInt()
    }
}