class Solution {
   fun duplicateZeros(arr: IntArray): Unit {
    var index = 0
    while (index<arr.size){
        if(arr[index]==0) {
            var internalIndex = index + 1
            if (internalIndex < arr.size) {
                var previousVal = arr[internalIndex]
                while (internalIndex < arr.size) {
                    if (internalIndex == index + 1) {
                        arr[internalIndex] = 0
                    } else {
                        val currentVal = arr[internalIndex]
                        arr[internalIndex] = previousVal
                        previousVal = currentVal
                    }
                    internalIndex++
                }
            }
            index++
        }
        index++
    }
}
}