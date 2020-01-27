import kotlin.test.assertEquals
import org.junit.Test as test

class Sort {
    @test
    fun bubble() {
        val array = SortAlgorithms().array
        val actual = SortAlgorithms().bubbleSort(array)
        val expect = intArrayOf(1,2,3,4,5,6,7)
        assertEquals(expect.asList(), actual.asList())
    }
}