class Solution {
      fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if(magazine.length<ransomNote.length){
            return false
        }
        val magazineCharFrequencies = hashMapOf<Char, Int>()
        val ransomNoteCharFrequencies = hashMapOf<Char, Int>()

        for(i in 0..magazine.lastIndex){
            if(magazineCharFrequencies.containsKey(magazine[i])){
                magazineCharFrequencies[magazine[i]] = magazineCharFrequencies[magazine[i]]!!+1
            }else{
                magazineCharFrequencies[magazine[i]] = 1
            }
        }

        for(i in 0..ransomNote.lastIndex){
            if(ransomNoteCharFrequencies.containsKey(ransomNote[i])){
                ransomNoteCharFrequencies[ransomNote[i]] = ransomNoteCharFrequencies[ransomNote[i]]!!+1
            }else{
                ransomNoteCharFrequencies[ransomNote[i]] = 1
            }
        }

        for (entry in ransomNoteCharFrequencies.entries){
            if((magazineCharFrequencies[entry.key]?:0) <entry.value){
                return false
            }
        }
        return true
    }
}