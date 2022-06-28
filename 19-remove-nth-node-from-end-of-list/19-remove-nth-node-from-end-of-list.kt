import kotlin.math.sign

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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val table = hashMapOf<Int, ListNode?>()
        var newHead = head
        var node = head
        var count = 0
        while (node != null) {
            table[count] = node
            count++
            node = node.next
        }
        val nthInTable = table.size - n
        if (nthInTable.sign == -1) {
            return newHead
        }
        val target: ListNode? = table[nthInTable]
        val nthMinusOne = table[nthInTable - 1]
        if (nthMinusOne != null) {
            nthMinusOne.next = target?.next
        } else {
            newHead = target?.next
        }

        return newHead
    }
}