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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if(head == null) return null
        var theHead = if(head.`val` == `val`){
            head.next
        }else{
            head
        }
        var currentNode = theHead
        var previousNode: ListNode? = null
        while (currentNode!=null){
            if(currentNode.`val` == `val`){
                if(previousNode!=null){
                    previousNode?.next = currentNode.next
                    currentNode = previousNode?.next
                }else{
                    theHead = currentNode.next
                    currentNode = currentNode.next
                }
            }else{
                previousNode = currentNode
                currentNode = currentNode.next
            }
        }
        return theHead
    }
}