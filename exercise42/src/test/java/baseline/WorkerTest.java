package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void setFirstName() {
        Worker test = new Worker();
        test.setFirstName("Cristiam");
        String actual = test.getFirstName();
        String expected = "Cristiam";
        assertEquals(expected, actual);
    }

    @Test
    void getFirstName() {
        Worker test = new Worker();
        String actual = test.getFirstName();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        Worker test = new Worker();
        test.setLastName("Enciso");
        String actual = test.getLastName();
        String expected = "Enciso";
        assertEquals(expected, actual);

    }

    @Test
    void getLastName() {
        Worker test = new Worker();
        String actual = test.getLastName();
        String expected = null;
        assertEquals(expected, actual);

    }

    @Test
    void setSalary() {
        Worker test = new Worker();
        test.setSalary("100000");
        String actual = test.getSalary();
        String expected = "100000";
        assertEquals(expected, actual);

    }

    @Test
    void getSalary() {
        Worker test = new Worker();
        String actual = test.getSalary();
        String expected = null;
        assertEquals(expected, actual);
    }
}