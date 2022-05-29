class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val map = hashMapOf<Int, Int>()
        val disappeared = mutableListOf<Int>()
        for (i in 0..nums.lastIndex) {
            map[nums[i]] = i
        }
        for (i in 1..nums.size) {
            if (map[i] == null) {
                disappeared.add(i)
            }
        }

        return disappeared
    } 
}