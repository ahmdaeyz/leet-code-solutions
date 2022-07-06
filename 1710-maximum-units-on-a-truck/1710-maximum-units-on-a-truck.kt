class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int):Int{
        boxTypes.sortByDescending { it-> it.last() }
        var maxUnits = 0
        var remainingNumberOfUnits = truckSize
        for(i in 0..boxTypes.lastIndex){
            val currentRemaining = remainingNumberOfUnits - boxTypes[i].first()
            if(currentRemaining<0){
                maxUnits += remainingNumberOfUnits*boxTypes[i].last()
                remainingNumberOfUnits = 0
                break
            }else{
                maxUnits += boxTypes[i].first()*boxTypes[i].last()
                remainingNumberOfUnits-=boxTypes[i].first()
            }
        }
        return  maxUnits
    }
}