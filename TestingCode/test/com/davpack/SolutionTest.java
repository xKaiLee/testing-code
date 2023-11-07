package com.davpack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest{

    Solution sol = new Solution();
    autoComplete ac = new autoComplete();
    List<Integer> l2;

    @Test
    void ListContainsExtremeAndRandomElement() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1000000);
        assertEquals(1, sol.solution(l1));
    }
    @Test
    void ListContainsTheNumberOfPositiveElements() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(25); l1.add(250); l1.add(1); l1.add(2); l1.add(24); l1.add(3);
        assertEquals(4, sol.solution(l1));
    }
    @Test
    void ListContainsTheNumberOfNegativeElements() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(-25); l1.add(-250); l1.add(-1); l1.add(-2); l1.add(-24); l1.add(-3);
        assertEquals(1, sol.solution(l1));
    }
    @Test
    void ListContainsTheNumberOfElements() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(-25); l1.add(250); l1.add(-1); l1.add(2); l1.add(-24); l1.add(3); l1.add(1); l1.add(1); l1.add(-25);
        assertEquals(4, sol.solution(l1));
    }

    @Test
    void ListContainsTenZeros() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(-25); l1.add(250); l1.add(-1); l1.add(2); l1.add(-24); l1.add(3); l1.add(1); l1.add(1); l1.add(-25);
        for(int i=0; i<10; i++) l1.add(0);
        assertEquals(4, sol.solution(l1));
    }

    @Test()
    void ListContainsNumberFrom0To10000_ListIsTooLarge() throws InvalidSizeException {

        List<Integer> l1 = new ArrayList<>();
        assertThrows(InvalidSizeException.class, () -> {
            for(int i=0; i < 10000; i++){
            l1.add(i);}
            sol.solution(l1);
        });
    }

    @Test()
    void ListIsEmpty() throws InvalidSizeException {
        List<Integer> l1 = new ArrayList<>();
        assertThrows(InvalidSizeException.class, () -> sol.solution(l1));
    }

    @Test()
    void ListIsNotInitialized() throws Exception {
        assertThrows(NotInitializedException.class, () -> sol.solution(l2));
    }
}