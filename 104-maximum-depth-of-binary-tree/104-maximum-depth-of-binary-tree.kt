import kotlin.math.max

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
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = ArrayDeque<TreeNode>();
        queue.addLast(root)
        var depth = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0..size - 1) {
                val current = queue.removeFirst()
                if (current.left != null) queue.addLast(current.left!!)
                if (current.right != null) queue.addLast(current.right!!)
            }
            depth++
        }
        return depth
    }
}