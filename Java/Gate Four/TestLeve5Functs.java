import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;


public class ReplaceNonPerfectSquaresTest {

    @Test
    public void testReplaceNonSquares() {

        List<Integer> input = Arrays.asList(4, 7, 9, 10, 49, 6);
        List<Integer> expected = Arrays.asList(4, -1, 9, -1, 49, -1);

        List<Integer> actual = ReplaceNonPerfectSquares.replaceNonSquares(input);

        assertEquals(expected, actual);
    }
}
