class Solution {
   fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0;
    var count = 0;
    while (index < nums.size) {
        if (nums[index] == `val`) {
            nums[index] = -1
            count++
        }
        index++
    }
    var left = 0
    var right = nums.size - 1
    while (right > nums.size - count - 1) {
        if (nums[right] == -1) {
            right--
        } else if (nums[right] != -1 && nums[left] == -1) {
            val temp = nums[right]
            nums[left] = temp
            nums[right] = -1
            right--
            left++
        } else {
            left++
        }
    }

    return nums.size - count;
}
}