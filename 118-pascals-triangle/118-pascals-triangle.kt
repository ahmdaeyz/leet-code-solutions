class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val solution = List(numRows){top->
            MutableList<Int>(top+1){inner->
                if(inner==0|| inner==top) 1 else 0
            }
        }
        for(i in 0..solution.lastIndex){
            for(j in 0..solution[i].lastIndex){
                if(solution[i][j] == 0){
                    solution[i][j] = solution[i-1][j] + solution[i-1][j-1]
                }
            }
        }
        return  solution
    }
}