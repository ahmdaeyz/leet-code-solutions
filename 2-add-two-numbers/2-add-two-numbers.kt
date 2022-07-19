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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var newHead: ListNode? = null
        var l1Current = l1
        var l2Current = l2
        var additionCurrent: ListNode? = newHead
        var carry = 0
        while (l1Current != null || l2Current != null) {
            val addition = (l1Current?.`val` ?: 0) + (l2Current?.`val` ?: 0) + carry
            var digit = addition
            carry = 0
            if (addition > 9) {
                carry = 1
                digit = addition - 10
            }
            if (newHead == null) {
                newHead = ListNode(digit)
                additionCurrent = newHead
            } else {
                additionCurrent?.next = ListNode(digit)
                additionCurrent = additionCurrent?.next
            }
            l1Current = l1Current?.next
            l2Current = l2Current?.next
        }

        if (carry != 0) {
            additionCurrent?.next = ListNode(carry)
        }

        return newHead
    }
}