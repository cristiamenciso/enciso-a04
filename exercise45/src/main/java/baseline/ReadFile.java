package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// constructor
public class ReadFile {
    private List<String> list;
    private Scanner in;

    // class to read from file
    public ReadFile() throws FileNotFoundException {
        list = new ArrayList<>();
        File file = new File("data/exercise45_input.txt");
        in = new Scanner(file);
    }
    public void readFromFile() {
        try {
            int i =0;
            while(in.hasNext()) {
                String fileData = in.nextLine();
                list.add(fileData);
            }
        }
        finally {
            in.close();
        }
    }

    public List<String> getList() {
        return list;
    }

}

