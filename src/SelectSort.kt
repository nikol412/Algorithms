import kotlin.math.max

class SelectSort {
    fun sort(intArray: IntArray): IntArray {
        println("Default array: \n${intArray.asList()}")
        println("Next iterations:")
        return selectMax(intArray, intArray.size - 1)
    }

    fun selectMax(intArray: IntArray, pos: Int): IntArray {
        if (pos >= 1) {
            var maxElement: Int = intArray[0]
            var indexOfMax = 0
            for (index in 0 until pos + 1) {
                if (maxElement < intArray[index]) {
                    maxElement = intArray[index]
                    indexOfMax = index
                }
            }
            val biggestNumber = intArray[indexOfMax]
            intArray[indexOfMax] = intArray[pos]
            intArray[pos] = biggestNumber

            println("${intArray.asList()}")

            selectMax(intArray, pos - 1)
        }
        return intArray
    }
}