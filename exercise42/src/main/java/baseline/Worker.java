package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

public class Worker {
    // class to hold parsed information
    private String firstName;
    private String LastName;
    private String Salary;

    // make get and set methods

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getSalary() {
        return Salary;
    }
}
