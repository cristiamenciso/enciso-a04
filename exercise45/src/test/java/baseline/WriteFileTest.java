package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void WriteFile() throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readFromFile();
        List<String> list = readFile.getList();
        WriteFile test = new WriteFile("output_test.txt", list);
        File file = new File("data/output_test.txt");
        assertTrue(file.exists());
    }
    @Test
    void writeToFile() throws IOException {
        List<String> test = new ArrayList<>();
        ReadFile readFile = new ReadFile();
        readFile.readFromFile();
        List<String> list = readFile.getList();
        WriteFile writer = new WriteFile("output_test2.txt", list);
        writer.writeToFile();
        File file = new File("data/output_test2.txt");
        Scanner in = new Scanner(file);
        while(in.hasNext()) {
            String data = in.nextLine();
            test.add(data);
        }
        String expected = "[One should never use the word \"use\" in writing. Use \"use\" instead., For example, \"She uses an IDE to write her Java programs\" instead of \"She, uses an IDE to write her Java programs\".]";
        String actual = test.toString();
        assertEquals(expected, actual);



    }
}