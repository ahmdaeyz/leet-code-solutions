import kotlin.math.sign

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean{
    for(i in 0..matrix.lastIndex){
        if(target >= matrix[i].first() && target<= matrix[i].last()){
           val index= matrix[i].binarySearch(target)
            return index.sign != -1
        }
    }
    return false
}
}