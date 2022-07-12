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
    
    fun reverseList(head: ListNode?): ListNode? {
        var currentReversed: ListNode? = null
        var currentNode: ListNode? = head
        while (currentNode!=null){
            val nextNode = currentNode.next
            currentNode.next = currentReversed
            currentReversed = currentNode
            currentNode = nextNode
        }
        return  currentReversed
    }
}