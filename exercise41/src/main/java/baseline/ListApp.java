package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListApp {

    // method to read list
    public List<String> readInput(String fileName) throws FileNotFoundException {
        // read from file using scanner
        Scanner in = new Scanner(new File(fileName));
        // place input into arrayList
        List<String> list = new ArrayList<>();
        while(in.hasNextLine()) {
            list.add(in.nextLine());
        }
        in.close();
        // return arrayList
        return list;
    }

    // method to sort list
    public List<String> sortList(List<String> list) {
     // sort arrayList
        Collections.sort(list);
        return list;
    }

    // method to print out list
    public void printList(List<String> list, String fileName) throws IOException {
        // print out list
        FileWriter writer= new FileWriter(fileName);
        try (writer) {
            writer.write("Total of " + list.size() + " names\n-----------------\n");
            for (String str : list) {
                writer.write(str + System.lineSeparator());
            }
        }
    }
}
