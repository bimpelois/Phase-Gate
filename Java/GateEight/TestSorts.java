import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;

public class SortsTest {

    @Test
    public void testduplicate() {
        int[] numbersArray = {9,2,3,2,1};
        int expected = {9,3,1};
        int actual  numbersArray = {9,2,3,2,1};

        assertEquals(expected, actual);
    }
