class SortAlgorithms {
    val array = intArrayOf(7, 6, 5, 4, 3, 2, 1, 0)

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