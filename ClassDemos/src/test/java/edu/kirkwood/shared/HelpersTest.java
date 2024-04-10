package edu.kirkwood.shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpersTest {

    @Test
    void isValidDate() {
        assertTrue(Helpers.isValidDate("4/2/2024"));
        assertTrue(Helpers.isValidDate("04/02/2024"));
        assertFalse(Helpers.isValidDate("pizza"));
        assertFalse(Helpers.isValidDate("02/30/2024"));
        assertFalse(Helpers.isValidDate("April 2, 2024"));
    }

    @Test
    void diceRoll() {
        int min = 1;
        int max = 6;
        for(int i = 0; i < 100; i++) {
            int rand = Helpers.randint(min, max);
            if(rand < min || rand > max) {
                fail(rand + " is out of range");
            }
        }
    }

    @Test
    void randNegatives() {
        int min = -100;
        int max = -1;
        for(int i = 0; i < 1000; i++) {
            int rand = Helpers.randint(min, max);
            if(rand < min || rand > max) {
                fail(rand + " is out of range");
            }
        }
    }

    @Test
    void round() {
        String expected = "3.14";
        String actual = Helpers.round(3.14159, 2);
        assertEquals(expected, actual);

        expected = "3.142";
        actual = Helpers.round(3.14159, 3);
        assertEquals(expected, actual);
    }

    @Test
    void roundUp() {
        // 1 decimal place
        String expected = "3.1";
        String actual = Helpers.round(3.12, 1);
        assertEquals(expected, actual);

        // 2 decimal places
        expected = "3.11";
        actual = Helpers.round(3.112, 2);
        assertEquals(expected, actual);
    }

    @Test
    void roundDown() {
        // 1 decimal place
        String expected = "3.2";
        String actual = Helpers.round(3.19, 1);
        assertEquals(expected, actual);

        // 2 decimal places
        expected = "3.12";
        actual = Helpers.round(3.119, 2);
        assertEquals(expected, actual);
    }

}