class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // validate for the first rule
        var hashTable = hashMapOf<Char, Int>()
        for (i in 0..board.lastIndex) {
            hashTable.clear();
            for (j in 0..board[i].lastIndex) {
                if (board[i][j] != '.') {
                    if (hashTable.containsKey(board[i][j])) {
                        return false
                    } else {
                        hashTable[board[i][j]] = 1
                    }
                }
            }
        }
        hashTable.clear();
        // validate for the second rule
        var horizontal = 0
        var vertical = 0
        while (horizontal < 9) {
            if (board[vertical][horizontal] != '.') {
                if (hashTable.containsKey(board[vertical][horizontal])) {
                    return false
                } else {
                    hashTable[board[vertical][horizontal]] = 1
                }
            }
            vertical++
            if (vertical == 9) {
                vertical = 0
                horizontal++
                hashTable.clear();
            }
        }
        hashTable.clear();
        var horizontalSubBox = 0
        var verticalSubBox = 0
        while (horizontalSubBox < 3 && verticalSubBox < 3) {
            var subBoxHorizontal = horizontalSubBox * 3
            var subBoxVertical = verticalSubBox * 3
            hashTable.clear()
            while (subBoxVertical < verticalSubBox * 3 + 3 && subBoxHorizontal<horizontalSubBox*3+3) {
                if (board[subBoxVertical][subBoxHorizontal] != '.') {
                    if (hashTable.containsKey(board[subBoxVertical][subBoxHorizontal])) {
                        return false
                    } else {
                        hashTable[board[subBoxVertical][subBoxHorizontal]] = 1
                    }
                }
                subBoxHorizontal++
                if (subBoxHorizontal == horizontalSubBox * 3 + 3) {
                    subBoxHorizontal = horizontalSubBox * 3
                    subBoxVertical++
                }
            }
            horizontalSubBox++
            if (horizontalSubBox == 3) {
                horizontalSubBox = 0
                verticalSubBox++
            }
        }
        return true
    }
}