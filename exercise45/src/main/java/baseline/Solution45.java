package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        // prompt user for output file name
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the output file: ");
        String output = in.nextLine();
        // read file
        ReadFile readFile = new ReadFile();
        readFile.readFromFile();
        List<String> list = readFile.getList();
        // write to file
        WriteFile writer = new WriteFile(output, list);
        writer.writeToFile();

    }
}
