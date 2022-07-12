/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
   
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var lastNonDuplicateNode = head
        var currentVal = -101
        var duplicationCounter = 0
        var currentNode = head
        while (currentNode != null) {
            if (currentVal != currentNode.`val`) {
                if (duplicationCounter > 0) {
                    lastNonDuplicateNode?.next = currentNode
                    duplicationCounter = 0
                }
                lastNonDuplicateNode = currentNode
                currentVal = currentNode.`val`
            } else {
                duplicationCounter++
            }
            currentNode = currentNode.next
        }
        if (duplicationCounter > 0) {
            lastNonDuplicateNode?.next = null
        }
        return head
    }
}