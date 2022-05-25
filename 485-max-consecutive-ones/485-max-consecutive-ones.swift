class Solution {
    func findMaxConsecutiveOnes(_ nums: [Int]) -> Int {
    var consecutivesCount: [Int] = []
        for number in nums{
            if(number == 0){
                consecutivesCount.append(0)
            }else{
                if(consecutivesCount.isEmpty){
                    consecutivesCount.append(0)
                }
                let lastIndex = consecutivesCount.endIndex-1
                consecutivesCount[lastIndex] += 1
            }
        }
    let sortedArray = consecutivesCount.sorted()
    let lastElement = sortedArray.last ?? 0
    return lastElement
}
}