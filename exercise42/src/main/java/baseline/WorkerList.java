package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerList {
    // class to manage the workers in list

    // method to read list from file
    public List<String> readInput(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileName));
        List<String> list = new ArrayList<>();
        while(in.hasNext()) {
            list.add((in.nextLine()));
        }
        in.close();
        return list;
    }

    // method to parse list
    public List<Worker> parseList(List<String> list) {
        List<Worker> workList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Worker emp = new Worker();
            emp.setLastName(list.get(i).split(",")[0]);
            emp.setFirstName(list.get(i).split(",")[1]);
            emp.setSalary(list.get(i).split(",")[2]);
            workList.add(emp);
        }
        return workList;


    }

    // method to print table
    public void printTable(List<Worker> list) {
        System.out.print("Last\t\tFirst\t\tSalary\n---------------------------------\n");
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%-8s\t%-8s\t%-8s\n", list.get(i).getLastName(), list.get(i).getFirstName(), list.get(i).getSalary());
        }


    }

}
