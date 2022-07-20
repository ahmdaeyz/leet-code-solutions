import kotlin.math.ceil

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val hashTable = hashMapOf<Int, Int>()
        for (i in 0..nums.lastIndex) {
            hashTable[nums[i]] = (hashTable[nums[i]] ?:0) + 1
            if (hashTable[nums[i]]!! > (nums.size / 2)) {
                return nums[i]
            }
        }
        return nums.first()
    }
}