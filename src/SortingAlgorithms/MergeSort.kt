package SortingAlgorithms

class MergeSort {
    fun mergeSort(arr: IntArray): IntArray {
        if (arr.size <= 1) {
            return arr
        }

        val middle = arr.size / 2
        val left = arr.copyOfRange(0, middle)
        val right = arr.copyOfRange(middle, arr.size)

        return merge(mergeSort(left), mergeSort(right))
    }

    private fun merge(left: IntArray, right: IntArray): IntArray {
        var indexLeft = 0
        var indexRight = 0
        val newArray = mutableListOf<Int>()
        while (indexLeft < left.count() && indexRight < right.count()) {
            if (left[indexLeft] <= right[indexRight]) {
                newArray.add(left[indexLeft])
                indexLeft++
            } else {
                newArray.add(right[indexRight])
                indexRight++
            }
        }
        while (indexLeft < left.size) {
            newArray.add(left[indexLeft])
            indexLeft++
        }
        while (indexRight < right.size) {
            newArray.add(right[indexRight])
            indexRight++
        }
        return newArray.toIntArray()
    }
}