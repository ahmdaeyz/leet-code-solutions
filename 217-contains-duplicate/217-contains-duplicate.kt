class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashMap = hashMapOf<Int, Int>();
        for (i in 0..nums.lastIndex) {
            hashMap[nums[i]] = (hashMap[nums[i]] ?: 0) + 1
            if (hashMap[nums[i]]!! > 1) {
                return true
            }
        }
        return false
    }
}