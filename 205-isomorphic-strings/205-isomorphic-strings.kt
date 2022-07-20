

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hashTable = hashMapOf<Char, Char>()
        val ascii = IntArray(128)
        for (i in 0..s.lastIndex) {
            if (hashTable.containsKey(s[i])) {
                if (hashTable[s[i]] != t[i]) {
                    return false
                }
            } else {
                if (ascii[t[i].toInt()] != 0) {
                    return false
                } else {
                    hashTable[s[i]] = t[i]
                    ascii[t[i].toInt()] = 1
                }
            }
        }
        return true
    }
}