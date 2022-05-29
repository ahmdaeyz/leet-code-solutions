class Solution {
    fun heightChecker(heights: IntArray): Int {
        var count = 0
        val currentOrder = heights.toList()
        for (i in 0..heights.lastIndex) {
            var minIndex = i
            for (j in i..heights.lastIndex) {
                if (heights[j] < heights[minIndex]) {
                    minIndex = j
                }
            }
            val temp = heights[i]
            heights[i] = heights[minIndex]
            heights[minIndex] = temp
            if (currentOrder[i] != heights[i]) {
                count++
            }
        }
        return count
    }
}