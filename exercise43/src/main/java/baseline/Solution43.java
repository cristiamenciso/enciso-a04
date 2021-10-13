package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.IOException;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        Input in = new Input();
        WebBuilder web = new WebBuilder();
        // get user input
        in.getInput();
        // call method to format website
        // Print notice that website was build
        web.makeSite(in.getSiteName(), in.getAuthor(), in.getJS(), in.getCSS());
    }
}
