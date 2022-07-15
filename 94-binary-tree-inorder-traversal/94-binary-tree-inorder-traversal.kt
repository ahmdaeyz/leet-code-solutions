/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    // fun inorderTraversal(root: TreeNode?): List<Int> {
    //     if(root==null) return listOf()
    //     return inorderTraversal(root.left) + root.`val` + inorderTraversal(root.right)
    // }
    
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return listOf()
        val stack = Stack<TreeNode>()
        val solution = mutableListOf<Int>()
        var currentNode = root
        while (currentNode != null || stack.isNotEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode)
                currentNode = currentNode.left
            }
            currentNode = stack.pop()
            solution.add(currentNode.`val`)
            currentNode = currentNode.right
        }
        return solution
    }
}