class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (char in s) {
            if (char == '(' || char == '{' || char == '[') {
                stack.addLast(char)
            } else {
                var currentOnStack = '.'
                if (stack.isNotEmpty()) {
                    currentOnStack = stack.last()
                }
                stack.addLast(char)
                if (stack.isNotEmpty()) {
                    if (currentOnStack == '(' && char == ')' || currentOnStack == '{' && char == '}' || currentOnStack == '[' && char == ']') {
                        stack.removeLast()
                        stack.removeLast()
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}