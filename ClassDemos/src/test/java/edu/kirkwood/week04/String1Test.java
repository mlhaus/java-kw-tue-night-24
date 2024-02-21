package edu.kirkwood.week04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {
    private String1 string1;

    @BeforeEach
    void setUp() {
        string1 = new String1();
    }

    @Test
    void helloName() {
        String expected = "Hello Bob!";
        String actual = string1.helloName("Bob");
        assertEquals(expected, actual);
        expected = "Hello Hello!";
        actual = string1.helloName("Hello");
        assertEquals(expected, actual);
    }

    @Test
    void makeOutWord() {
        assertEquals("<<Yay>>", string1.makeOutWord("<<>>", "Yay"));
        assertEquals("HHHellooo", string1.makeOutWord("HHoo", "Hello"));
    }

    @Test
    void firstHalf() {
        assertEquals("Woo", string1.firstHalf("WooHoo"));
        assertEquals("", string1.firstHalf(""));
    }

    @Test
    void nonStart() {
        assertEquals("ellohere", string1.nonStart("Hello", "There"));
        assertEquals("by", string1.nonStart("ab", "xy"));
    }

    @Test
    void theEnd() {
        assertEquals("H", string1.theEnd("Hello", true));
        assertEquals("o", string1.theEnd("Hello", false));
    }

    @Test
    void endsLy() {
        assertEquals(true, string1.endsLy("oddly") );
        assertEquals(false, string1.endsLy("oddy") );
        assertEquals(false, string1.endsLy("y") );
    }

    @Test
    void middleThree() {
        assertEquals("and", string1.middleThree("Candy"));
    }


}