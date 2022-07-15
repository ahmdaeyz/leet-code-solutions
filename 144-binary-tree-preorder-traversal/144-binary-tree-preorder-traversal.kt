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
    // fun preorderTraversal(root: TreeNode?): List<Int> {
    //     if (root == null) return listOf()
    //     return listOf(root.`val`) + preorderTraversal(root.left) + preorderTraversal(root.right)
    // }
    
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return listOf()
        val solution = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        stack.push(root)
        while (stack.isNotEmpty()) {
            val current = stack.pop()
            solution.add(current.`val`)
            if (current.right != null) stack.push(current.right)
            if (current.left != null) stack.push(current.left)
        }
        return solution
    }

}