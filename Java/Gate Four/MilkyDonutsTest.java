import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;

public class MilkyDonutsTest {

    @Test
    public void testcountEvens() {

        int[] numbers ={2, 5, 8, 11, 14, 7};
        int expected = 3;
        int actual = CountEvens(numbers);

        assertEquals(expected, actual);
    }

     @Test
    public void testSquares() {
        int[] expected = {1, 4, 9, 16, 25};
        int[] actual = Squares(5);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearch() {
        int[] numbers = {4, 7, 9, 2, 5};
        int expected = 2;
        int actual = LinearSearch(numbers, 9);

        assertEquals(expected, actual);
    }
}
