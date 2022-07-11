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

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null) return list2
        if(list2 == null) return list1
        var sortedList: ListNode? = null
        var currentSortedListNode = sortedList
        var currentList1Node = list1
        var currentList2Node = list2
        while (currentList1Node!=null && currentList2Node!=null){
            if(currentList1Node.`val` > currentList2Node.`val`){
                if(sortedList == null){
                    sortedList = ListNode(currentList2Node.`val`)
                    currentSortedListNode = sortedList
                }else{
                    currentSortedListNode?.next = ListNode(currentList2Node.`val`)
                    currentSortedListNode = currentSortedListNode?.next
                }
                currentList2Node = currentList2Node.next
            }else{
                if(sortedList == null){
                    sortedList = ListNode(currentList1Node.`val`)
                    currentSortedListNode = sortedList
                }else{
                    currentSortedListNode?.next = ListNode(currentList1Node.`val`)
                    currentSortedListNode = currentSortedListNode?.next
                }
                currentList1Node = currentList1Node.next
            }
        }

        while (currentList1Node!=null){
            currentSortedListNode?.next = ListNode(currentList1Node.`val`)
            currentList1Node = currentList1Node.next
            currentSortedListNode = currentSortedListNode?.next
        }

        while (currentList2Node!=null){
            currentSortedListNode?.next = ListNode(currentList2Node.`val`)
            currentList2Node = currentList2Node.next
            currentSortedListNode = currentSortedListNode?.next
        }

        return  sortedList
    }
}