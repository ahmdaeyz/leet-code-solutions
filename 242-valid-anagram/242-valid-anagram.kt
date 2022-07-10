class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val sMap = IntArray(26)
        val tMap = IntArray(26)
        for (i in 0..s.lastIndex) {
            sMap[s[i] - 'a'] = sMap[s[i] - 'a'] + 1
            tMap[t[i] - 'a'] = tMap[t[i] - 'a'] + 1
        }
        for (i in 0..sMap.lastIndex) {
            if (sMap[i] != tMap[i]) {
                return false
            }
        }
        return true
    }
}