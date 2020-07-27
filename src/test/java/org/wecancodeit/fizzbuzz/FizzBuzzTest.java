package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @Test
    public void createFizzBuzzClass() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSay1() {
//        arrangement
        FizzBuzz underTest = new FizzBuzz();
//        action
        String result = underTest.say(1);
//        assertion
        assertEquals("1", result);
    }
    @Test
    public void twoShouldSay2(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(2);
        assertEquals("2", result);

    }

}

