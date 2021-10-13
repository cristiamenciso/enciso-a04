package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListAppTest {

    @Test
    void readInput() throws FileNotFoundException {
        ListApp test = new ListApp();
        List<String> testList = test.readInput("data/input.txt");
        String expected = "[Ling, Mai, Johnson, Jim, Zarnecki, Sabrina, Jones, Chris, Jones, Aaron, Swift, Geoffrey, Xiong, Fong]";
        assertEquals(expected, testList.toString());
    }

    @Test
    void sortList() throws FileNotFoundException {
        ListApp test = new ListApp();
        List<String> testList = test.readInput("data/input.txt");
        List<String> actual = test.sortList(testList);
        String expected = "[Johnson, Jim, Jones, Aaron, Jones, Chris, Ling, Mai, Swift, Geoffrey, Xiong, Fong, Zarnecki, Sabrina]";
        assertEquals(expected, actual.toString());
    }

    @Test
    void printList() throws IOException {
        ListApp test = new ListApp();
        List<String> testList = test.readInput("data/input.txt");
        test.printList(testList, "data/output.txt");
        List<String> actual = test.readInput("data/outputTest.txt");
        String expected = "[Total of 7 names, -----------------, Ling, Mai, Johnson, Jim, Zarnecki, Sabrina, Jones, Chris, Jones, Aaron, Swift, Geoffrey, Xiong, Fong]";
        assertEquals(expected, actual.toString());
    }
}