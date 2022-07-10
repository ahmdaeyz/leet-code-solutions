class Solution {
    fun firstUniqChar(s: String): Int {
        val hashTable = hashMapOf<Char, Int>()
        for (i in 0..s.lastIndex) {
            if (hashTable.containsKey(s[i])) {
                hashTable[s[i]] = hashTable[s[i]]!! + 1
            } else {
                hashTable[s[i]] = 1
            }
        }

        for (i in 0..s.lastIndex) {
            if (hashTable[s[i]] == 1) {
                return i
            }
        }
        return -1
    }

}
