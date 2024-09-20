import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testIsAscending() {
        assertTrue(Main.isAscending("abc"));
        assertTrue(Main.isAscending("aaa"));
        assertTrue(Main.isAscending("xyz"));
        assertTrue(Main.isAscending("абв"));

        assertFalse(Main.isAscending("cba"));
        assertFalse(Main.isAscending("baa"));
        assertFalse(Main.isAscending("acb"));
        assertFalse(Main.isAscending("ваб"));
        assertFalse(Main.isAscending(""));
    }

    @Test
    public void testGetAscendingWords() {
        String input = "abc  edf fed ghi   kln prs";
        String[] expected = {"abc", "ghi", "kln", "prs"};
        assertArrayEquals(expected, Main.getAscendingWords(input));

        String input2 = "xyz";
        String[] expected2 = {"xyz"};
        assertArrayEquals(expected2, Main.getAscendingWords(input2));

        String input3 = "";
        String[] expected3 = {};
        assertArrayEquals(expected3, Main.getAscendingWords(input3));

        String input4 = "cba fed   zyx";
        String[] expected4 = {};
        assertArrayEquals(expected4, Main.getAscendingWords(input4));

        String input5 = "abc  ghi   x mnp";
        String[] expected5 = {"abc", "ghi", "x", "mnp"};
        assertArrayEquals(expected5, Main.getAscendingWords(input5));
    }
}
