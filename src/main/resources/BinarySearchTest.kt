import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {

        @Test
        fun binarysearchOnemptyarray() {
            val a = IntArray(0)
            for (i in 0..2) {
                val res = binarySearch(a, 0, -1, 0)
                assertEquals(-1, res)
            }
        }

        @Test
        fun binarySearchOnOneElementArray() {
            val a = IntArray(1)
            assertEquals(0, binarySearch(a, 0, 0, 0))
        }

        @Test
        fun binarySearchAllPresent() {
            val a = intArrayOf(1, 2, 3, 4, 5)
            for (d in 1 until a.size) {
                assertEquals(d - 1, binarySearch(a, 0, a.size - 1, d))
            }
        }

        @Test
        fun binarySearchNonePresent() {
            val a = intArrayOf(2, 4, 6, 8, 10)
            for (d in 1 until a.size) {
                assertEquals(-1, binarySearch(a, 0, a.size - 1, 2 * d + 1))
            }

    }
}