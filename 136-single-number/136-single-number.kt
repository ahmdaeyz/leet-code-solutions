class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce{last, current->
            last xor current
        }
    }
}