import kotlin.test.assertEquals
import org.junit.Test as test

class SearchTest {
    @test
    fun binarySearch(){
        val array = 1..2000000
        val actual = BinarySearch().findIndexOfIntValue(array.toMutableList().toIntArray(), target = 52)
        val expected = 51
        assertEquals(expected, actual)
    }
}