class Solution {
   
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Frequencies = hashMapOf<Int, Int>()
        val nums2Frequencies = hashMapOf<Int, Int>()
        val solution = mutableListOf<Int>()
        for (i in 0..nums1.lastIndex) {
            if (nums1Frequencies.containsKey(nums1[i])) {
                nums1Frequencies[nums1[i]] = nums1Frequencies[nums1[i]]!! + 1
            } else {
                nums1Frequencies[nums1[i]] = 1
            }
        }
        for (i in 0..nums2.lastIndex) {
            if (nums2Frequencies.containsKey(nums2[i])) {
                nums2Frequencies[nums2[i]] = nums2Frequencies[nums2[i]]!! + 1
            } else {
                nums2Frequencies[nums2[i]] = 1
            }
        }
        if (nums2Frequencies.size > nums1Frequencies.size) {
            nums2Frequencies.forEach { key, value ->
                if (nums1Frequencies.containsKey(key)) {
                    if (nums1Frequencies[key]!! < value) {
                        for (i in 0 until nums1Frequencies[key]!!) {
                            solution.add(key)
                        }
                    } else {
                        for (i in 0 until value) {
                            solution.add(key)
                        }
                    }
                }
            }
        } else {
            nums1Frequencies.forEach { key, value ->
                if (nums2Frequencies.containsKey(key)) {
                    if (nums2Frequencies[key]!! < value) {
                        for (i in 0 until  nums2Frequencies[key]!!) {
                            solution.add(key)
                        }
                    } else {
                        for (i in 0 until value) {
                            solution.add(key)
                        }
                    }
                }
            }
        }

        return solution.toIntArray()
    }

}