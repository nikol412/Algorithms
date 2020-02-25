import SortingAlgorithms.*
import kotlin.test.assertEquals
import org.junit.Test as test

class SortingTests {
    @test
    fun bubble() {
        val array = SortAlgorithms().array
        val actual = BubbleSort().bubbleSort(array)
        val expect = intArrayOf(0,1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }

    @test
    fun merge(){
        val array = SortAlgorithms().array
        val actual = MergeSort().mergeSort(array)
        val expect = intArrayOf(0,1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }

    @test
    fun insertionSortTest(){
        val array = SortAlgorithms().array
        val actual = InsertionSort().sort(array)
        val expect = intArrayOf(0,1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }

    @test
    fun selectSortMax(){
        val array = SortAlgorithms().array
        val actual = SelectSort().sortMax(array)
        val expect = intArrayOf(0,1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }

    @test
    fun selectSortMin(){
        val array = SortAlgorithms().array
        val actual = SelectSort().sortMin(array)
        val expect = intArrayOf(0,1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }

//    @test
//    fun quickSort(){
//        val array = SortAlgorithms().array
//        val actual = QuickSort().sort(array)
//        val expect = intArrayOf(0,1,2,3,4,5,6,7)
//        assertEquals(expect.asList(), actual.asList())
//    }
}
