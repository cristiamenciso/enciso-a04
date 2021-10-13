package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkerListTest {

    @Test
    void readInput() throws FileNotFoundException {
        WorkerList test = new WorkerList();
        List<String> actual = test.readInput("data/exercise42_input.txt");
        String expected = "[Ling,Mai,55900, Johnson,Jim,56500, Jones,Aaron,46000, Jones,Chris,34500, Swift,Geoffrey,14200, Xiong,Fong,65000, Zarnecki,Sabrina,51500]";
        assertEquals(expected, actual.toString());
    }

    @Test
    void parseList() throws FileNotFoundException {
        WorkerList test = new WorkerList();
        List<String> list = test.readInput("data/exercise42_input.txt");
        List<Worker> actual = test.parseList(list);
        String expected  = "Mai Ling 55900";
        assertEquals(expected, actual.get(0).getFirstName() + " " + actual.get(0).getLastName() + " " + actual.get(0).getSalary());

    }
}