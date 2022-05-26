class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
    for (i in 0 until arr.size) {
        for (j in i until arr.size) {
            if ((arr[i] * 2 == arr[j] || arr[i] == arr[j] * 2) && i != j) {
                return true
            }
        }
    }
    return false
}
}