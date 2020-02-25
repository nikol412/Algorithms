package SortingAlgorithms

class SelectSort {
    fun sortMax(intArray: IntArray): IntArray {
        println("Default array: \n${intArray.asList()}")
        println("Next iterations:")
        return selectMax(intArray, intArray.size - 1)
    }
    fun sortMin(intArray: IntArray):IntArray{
        println("Default array: \n${intArray.asList()}")
        println("Next iterations:")
        return selectMin(intArray, 0)
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

    fun selectMin(intArray: IntArray, pos:Int):IntArray{
        if(pos <= intArray.size-2) {
            var minElement: Int = intArray[pos]
            var indexOfMin = pos
            for (index in pos + 1 until intArray.size) {
                if (minElement > intArray[index]) {
                    minElement = intArray[index]
                    indexOfMin = index
                }
            }
            val temp = intArray[indexOfMin]
            intArray[indexOfMin] = intArray[pos]
            intArray[pos] = temp

            println(intArray.asList())

            selectMin(intArray, pos + 1)
        }
        return intArray
    }
}