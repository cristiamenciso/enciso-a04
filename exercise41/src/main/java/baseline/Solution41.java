package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.IOException;
import java.util.List;

public class Solution41 {
    public static void main(String[] args) throws IOException {
        ListApp test = new ListApp();
        // Call to read input from input file
        List<String> list = test.readInput("data/input.txt");
        // sort list
        List<String> sortedList = test.sortList(list);
        // write to output file
        test.printList(sortedList, "data/output.txt");
}
    }



