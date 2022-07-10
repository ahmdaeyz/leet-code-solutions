class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        var areAnagrams = true
        if (s.length != goal.length){ 
            return false
        }
        val sMap = IntArray(26)
        val goalMap = IntArray(26)
        for (i in 0..s.lastIndex) {
            sMap[s[i] - 'a'] = sMap[s[i] - 'a'] + 1
            goalMap[goal[i] - 'a'] = goalMap[goal[i] - 'a'] + 1
        }
        for (i in 0..sMap.lastIndex) {
            if (sMap[i] != goalMap[i]) {
                areAnagrams =  false
            }
        }
        
        if(areAnagrams){
            if(s == goal){
                for(i in 0..sMap.lastIndex){
                    if(sMap[i] > 1){
                        return true
                    }
                }
            }else{
                val difference = mutableListOf<Char>()
                for(i in 0..s.lastIndex){
                    if(s[i]!=goal[i]){
                        difference.add(s[i])
                    }
                }
                if(difference.size == 2) return true
            }
        }
        return false
    }
}