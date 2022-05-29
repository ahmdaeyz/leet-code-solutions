import kotlin.math.sign
import kotlin.math.abs

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var lastNegativeIndex = 0
        var list = mutableListOf<Int>()
        for (i in 0..nums.lastIndex) {
            if (nums[i].sign == -1) {
                lastNegativeIndex++
            }
        }

        var indexOfPositive = lastNegativeIndex
        lastNegativeIndex--
        while (lastNegativeIndex >= 0 && indexOfPositive <= nums.lastIndex) {
            if (abs(nums[lastNegativeIndex]) < nums[indexOfPositive]) {
                list.add(nums[lastNegativeIndex] * nums[lastNegativeIndex])
                lastNegativeIndex--
            } else {
                list.add(nums[indexOfPositive] * nums[indexOfPositive])
                indexOfPositive++
            }
        }
        for (i in indexOfPositive..nums.lastIndex) {
            list.add(nums[i] * nums[i])
        }
        for (i in lastNegativeIndex downTo 0) {
            list.add(nums[i] * nums[i])
        }
        return list.toIntArray()
    }

}