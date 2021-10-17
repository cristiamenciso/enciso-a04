package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.FileNotFoundException;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        // read in file
        FrequencyCalculator calc = new FrequencyCalculator();
        // call method to set up hashmap
        // call method to count frequency
        Map<String, Integer> map = calc.readFile();
        // call method to sort
        Map<String, Integer> sortedMap = calc.sortMap(map);
        // print out histogram
        calc.printGraph(sortedMap);
    }

}
