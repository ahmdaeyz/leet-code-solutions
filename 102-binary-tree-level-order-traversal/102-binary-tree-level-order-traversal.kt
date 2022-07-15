import kotlin.math.log2

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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return listOf()
        val queue = ArrayDeque<TreeNode>();
        queue.addLast(root)
        val solution = mutableListOf<MutableList<Int>>()
        while (queue.isNotEmpty()) {
            val size = queue.size
            solution.add(mutableListOf())
            for (i in 0..size - 1) {
                val current = queue.removeFirst()
                solution.last().add(current.`val`)
                if (current.left != null) queue.addLast(current.left!!)
                if (current.right != null) queue.addLast(current.right!!)
            }
        }
        return solution
    }
}