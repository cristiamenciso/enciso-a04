package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {


    @Test
    void readFile() throws FileNotFoundException {
        Reader test = new Reader();
        JsonArray actual = test.readFile();
        String expected = "[{\"name\":\"Widget\",\"price\":25.00,\"quantity\":5},{\"name\":\"Thing\",\"price\":15.00,\"quantity\":5},{\"name\":\"Doodad\",\"price\":5.00,\"quantity\":10}]";
        assertEquals(expected, actual.toString());
    }

    @Test
    void testReadFile() throws IOException {
        Reader test = new Reader();
        JsonArray array = test.readFile();
        test.searchFile("Thing", array);

    }


    @Test
    void setInput() {
        Reader test = new Reader();
        test.setInput("hello");
        String actual = test.getInput();
        String expected = "hello";
        assertEquals(expected, actual);

    }

    @Test
    void getInput() {
        Reader test = new Reader();
        String actual = test.getInput();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void searchFile() throws IOException {
        Reader test = new Reader();
        JsonArray array = test.readFile();
        JsonObject object = test.searchFile("widget", array);
        String expected = "Widget";
        String actual = object.get("name").toString().replace("\"", "");
        assertEquals(expected, actual);



    }
}