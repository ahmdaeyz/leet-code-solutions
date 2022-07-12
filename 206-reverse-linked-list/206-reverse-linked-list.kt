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
        val list = mutableListOf<ListNode?>()
        var currentNode = head
        while (currentNode != null) {
            list.add(currentNode)
            currentNode = currentNode.next
        }
        for (i in list.lastIndex downTo 1) {
            list[i]?.next = list[i - 1]
        }
        if(list.isNotEmpty()){
            list.first()?.next = null
        }
        return if (list.isEmpty()) null else list.last()
    }
}