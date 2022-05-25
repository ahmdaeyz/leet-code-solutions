class Solution {
   fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val sorted = IntArray(m + n)
    var index = 0
    var left = 0
    var right = 0
    if (n == 0)
        return
    if (m == 0 && n > 0)
        nums1.forEachIndexed { index, i ->
            nums1[index] = i
        }
    while (index < sorted.size) {
        if (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                sorted[index] = nums1[left]
                left++
            } else {
                sorted[index] = nums2[right]
                right++
            }
        } else if (right < n) {
            sorted[index] = nums2[right]
            right++
        } else {
            sorted[index] = nums1[left]
            left++
        }
        index++
    }
    sorted.forEachIndexed { ind, i ->
        nums1[ind] = i
    }
}
}