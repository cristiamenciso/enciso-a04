package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void getList() throws FileNotFoundException {
        ReadFile test = new ReadFile();
        List<String> actual = test.getList();
        String expected = "[]";
        assertEquals(expected, actual.toString());
    }
    @Test
    void readFile() throws FileNotFoundException {
        ReadFile test = new ReadFile();
        List<String> actual = test.getList();
        String expected = "[]";
        assertEquals(expected, actual.toString());
    }
    @Test
    void readFromFile() throws FileNotFoundException {
        ReadFile test = new ReadFile();
        test.readFromFile();
        List<String> actual = test.getList();
        String expected = "[One should never utilize the word \"utilize\" in writing. Use \"use\" instead., For example, \"She uses an IDE to write her Java programs\" instead of \"She, utilizes an IDE to write her Java programs\".]";
        assertEquals(expected, actual.toString());
    }

}