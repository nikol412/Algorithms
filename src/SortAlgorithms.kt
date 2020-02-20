class SortAlgorithms {
    val array = intArrayOf(7, 6, 3, 4, 5, 2, 1)

    fun bubbleSort(arr: IntArray): IntArray {
        val n = arr.size
        var temp = 0
        for (i in 0 until n) {
            for (j in 1 until n - i) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1]
                    arr[j - 1] = arr[j]
                    arr[j] = temp
                }

            }
        }
        return arr
    }

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

    fun insertionSort(intArray: IntArray): IntArray {
        for (pos in 1 until intArray.size) {
            insert(intArray, pos, intArray[pos])
        }
        return intArray
    }

    private fun insert(intArray: IntArray, pos: Int, value: Int): IntArray {
        var i = pos - 1
        while (i >= 0 && intArray[i] > value) {
            intArray[i + 1] = intArray[i]
            i--
        }
        intArray[i + 1] = value
        //println(intArray.toList())
        return intArray
    }
}