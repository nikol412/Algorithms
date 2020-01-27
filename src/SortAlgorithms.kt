class SortAlgorithms {
    val array = intArrayOf(7,6,3,4,5,2,1)

    fun bubbleSort(arr: IntArray) :IntArray{
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
}