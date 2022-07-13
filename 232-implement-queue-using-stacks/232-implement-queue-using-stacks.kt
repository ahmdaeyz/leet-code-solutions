class MyQueue() {
    private val frontStack = ArrayDeque<Int>()
    private val backStack = ArrayDeque<Int>()

    fun push(x: Int) {
        if (frontStack.isEmpty()) {
            if (backStack.isNotEmpty()) {
                while (backStack.isNotEmpty()) {
                    val current = backStack.removeLast()
                    frontStack.addLast(current)
                }
                frontStack.addLast(x)
            } else {
                frontStack.addLast(x)
            }
        } else {
            frontStack.addLast(x)
        }
    }

    fun pop(): Int {
        while (frontStack.isNotEmpty()) {
            val current = frontStack.removeLast()
            backStack.addLast(current)
        }
        return backStack.removeLast()
    }

    fun peek(): Int {
        while (frontStack.isNotEmpty()) {
            val current = frontStack.removeLast()
            backStack.addLast(current)
        }
        return backStack.last()
    }

    fun empty(): Boolean {
        return backStack.isEmpty() && frontStack.isEmpty()
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */