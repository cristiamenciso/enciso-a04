package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCalculatorTest {

    @Test
    void readFile() throws FileNotFoundException {
        FrequencyCalculator test = new FrequencyCalculator();
        Map<String, Integer> actual = test.readFile();
        String expected = "{snake=1, mushroom=2, badger=7}";
        assertEquals(expected, actual.toString());


    }

    @Test
    void computeFrequency() throws FileNotFoundException {
        FrequencyCalculator test = new FrequencyCalculator();
        Map<String, Integer> map = test.readFile();
        int expected = 7;
        int actual = map.get("badger");
        assertEquals(expected, actual);
    }
    @Test
    void sortMap() throws FileNotFoundException {
        FrequencyCalculator test = new FrequencyCalculator();
        Map<String, Integer> map = test.readFile();
        Map<String, Integer> actual = test.sortMap(map);
        String expected = "{badger=7, mushroom=2, snake=1}";
        assertEquals(expected, actual.toString());

    }
}