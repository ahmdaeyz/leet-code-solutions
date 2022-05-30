class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits[digits.lastIndex] == 9) {
            var addedOne = false
            var index = digits.lastIndex
            while (!addedOne && index >= 0) {
                if (digits[index] == 9) {
                    digits[index--] = 0
                } else {
                    digits[index] += 1
                    addedOne = true
                }
            }
            if (!addedOne) {
                return intArrayOf(1, *digits)
            }
        } else {
            digits[digits.lastIndex] += 1
        }
        return digits
    }
}