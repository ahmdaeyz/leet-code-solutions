class Solution {
   
fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) {
        return false;
    }
    val periods = mutableListOf<Boolean>()
    periods.add(arr[0] < arr[1])
    var increasing = arr[0] < arr[1]
    var decreasing = arr[0] > arr[1]
    var periodsCount = 0
    for (i in 0 until arr.size) {
        if (i + 1 < arr.size) {
            if (arr[i] == arr[i + 1]) {
                return false
            }
            if (arr[i] < arr[i + 1]) {
                if (decreasing) {
                    periodsCount++
                    decreasing = false
                    increasing = true
                    periods.add(true)
                }
            } else {
                if (increasing) {
                    periodsCount++
                    decreasing = true
                    increasing = false
                    periods.add(false)
                }
            }
        }
    }
    periods.forEach {
        println(it.toString())
    }
    return periods.size == 2 && periods.first() && !periods.last();
}
}