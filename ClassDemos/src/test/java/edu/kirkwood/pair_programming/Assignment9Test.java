package edu.kirkwood.pair_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment9Test {

    @Test
    void sum() {
        assertEquals(3, Assignment9.sum(1, 2));
        assertEquals(3.3, Assignment9.sum(1.1, 2.2), 1); // Delta is the number of decimal places to test
    }

}