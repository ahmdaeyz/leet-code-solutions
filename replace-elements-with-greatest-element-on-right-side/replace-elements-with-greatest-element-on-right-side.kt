class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxSoFar = arr[arr.lastIndex]
        for (i in arr.lastIndex downTo  0) {
            if (i == arr.lastIndex) {
                arr[i] = -1
            }else{
                val tempMax = maxSoFar
                if(arr[i]> maxSoFar){
                    maxSoFar = arr[i]
                }
                arr[i] = tempMax
            }
        }
        return arr
    }
}