class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val area = mat.size*mat.first().size
        if(r*c!=area){
            return mat
        }
        val solution = Array(r){
            IntArray(c)
        }
        val linearMatrix = IntArray(r*c)
        var linearIndex = 0
        for(i in 0..mat.lastIndex){
            for(j in 0..mat.first().lastIndex){
                linearMatrix[linearIndex] = mat[i][j]
                linearIndex++
            }
        }
        linearIndex = 0
        for(i in 0 until  r){
            for( j in 0 until c){
                solution[i][j] = linearMatrix[linearIndex]
                linearIndex++
            }
        }
        return  solution
    }
}