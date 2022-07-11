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
    fun hasCycle(head: ListNode?): Boolean {
        val visitedNodes = hashMapOf<ListNode, Int>()
        var currentNode = head
        while (currentNode != null) {
            if (visitedNodes.containsKey(currentNode)) {
                return true
            } else {
                visitedNodes[currentNode] = 1
            }
            currentNode = currentNode.next
        }
        return false
    }
}