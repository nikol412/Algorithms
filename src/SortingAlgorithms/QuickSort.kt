package SortingAlgorithms

class QuickSort {
    fun sort(intArray: IntArray): IntArray {
        print("Quick sort \ndef array: ${intArray.asList()} \n")
        println("iterations:\n")
        return qsort(intArray, 0, intArray.size - 1)
    }


    private fun qsort(intArray: IntArray, low: Int, high: Int): IntArray {
        if (intArray.isEmpty() || low >= high) return intArray

        var middleIndex: Int = low + high / 2
        var middleVal = intArray[middleIndex]

        var left = low
        var right = high

        while (left <= right) {
            while (intArray[left] < middleVal) {
                left++
            }
            while (intArray[right] > middleVal) {
                right--
            }

            if (left <= right) {
                val temp = intArray[right]
                intArray[right] = intArray[left]
                intArray[left] = temp
                left++
                right--
            }
            //println(intArray.asList())
        }

        if (low < right) {
            qsort(intArray, low, right)
        }

        if (high > left) {
            qsort(intArray, left, high)
        }
        return intArray
    }


}