package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import com.google.gson.JsonArray;

import java.io.IOException;

public class Solution44 {
    public static void main(String[] args) throws IOException {
        Reader read = new Reader();
        // prompt user for input
        // call method to read from json file and search
        // print out results of search
        String input = read.askInput();
        JsonArray array = read.readFile();
        read.searchFile(input, array);
    }
}
