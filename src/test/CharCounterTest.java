//Syed Airaj Hussain 100789134 

import org.junit.Test;
import static org.junit.Assert.*;

public class CharCounterTest {

    // Test for node coverage: tests if countingChars method correctly counts occurrences of 'c' in the array.
    @Test
    public void nodeCoverage(){
        char [] cArray = {'a', 'c', 'c', 'e', 'p', 't'};
        char current = 'c';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(2, output);
    }

    // Test for edge coverage: tests when the array is empty, expected output is 0.
    @Test
    public void edgeCoverage(){
        char [] cArray = {};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(0, output);
    }

    // Test for edge coverage: tests when the array has only one element and it matches the character.
    @Test
    public void edgeCoverage2(){
        char [] cArray = {'a'};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for edge coverage: tests when the array has multiple elements with one matching character.
    @Test
    public void edgeCoverage3(){
        char [] cArray = {'a', 'c', 'c'};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for edge-pair coverage: tests when the array has only one element and it matches the character.
    @Test
    public void edgePair1(){
        char [] cArray = {'a'};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for edge-pair coverage: tests when the array has two elements and the character is the first one.
    @Test
    public void edgePair2(){
        char [] cArray = {'c', 'e'};
        char current = 'c';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for edge-pair coverage: tests when the array has two elements and the character is the second one.
    @Test
    public void edgePair3(){
        char [] cArray = {'e', 'c'};
        char current = 'c';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for edge-pair coverage: tests when the array is empty, expected output is 0.
    @Test
    public void edgePair4(){
        char [] cArray = {};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(0, output);
    }

    // Test for prime paths: tests when the array is empty, expected output is 0.
    @Test
    public void prime1(){
        char [] cArray = {};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(0, output);
    }

    // Test for prime paths: tests when the array has multiple elements and character 'c' appears twice.
    @Test
    public void prime2(){
        char [] cArray = {'a', 'c', 'c', 'e', 'p', 't'};
        char current = 'c';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(2, output);
    }

    // Test for prime paths: tests when the array has multiple elements and character 'a' appears once.
    @Test
    public void prime3(){
        char [] cArray = {'a', 'c', 'c', 'e', 'p', 't'};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }

    // Test for prime paths: tests when the array has multiple elements but character 'a' doesn't appear.
    @Test
    public void prime4(){
        char [] cArray = {'e', 'e', 'e'};
        char current = 'a';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(0, output);
    }

    // Test for prime paths: tests when the array has one element and it matches the character.
    @Test
    public void prime5(){
        char [] cArray = {'c'};
        char current = 'c';
        int output = CharCounter.countingChars(cArray, current);
        assertEquals(1, output);
    }
}
