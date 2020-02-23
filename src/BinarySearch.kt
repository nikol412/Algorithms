class BinarySearch {
    fun findIndexOfIntValue(intArray: IntArray, target: Int): Int {
        return binaryS(intArray, 0, intArray.lastIndex, target)

    }

    private fun binaryS(intArray: IntArray, min: Int, max: Int, target: Int): Int {
        val average = (min + max) / 2
        //println(average)
        return when {
            intArray[average] == target -> average
            target < intArray[average] -> {
                val newMax = average - 1
                binaryS(intArray, min, newMax, target)
            }
            else -> {
                val newMin = average + 1
                binaryS(intArray, newMin, max, target)
            }
        }
    }
}