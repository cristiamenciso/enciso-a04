package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.FileNotFoundException;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws FileNotFoundException {
        WorkerList work = new WorkerList();
        // read the input from file
        List<String> list = work.readInput("data/exercise42_input.txt");
        // parse information
        List<Worker> parsedList = work.parseList(list);
        // print output in tabular format
        work.printTable(parsedList);
    }
}
