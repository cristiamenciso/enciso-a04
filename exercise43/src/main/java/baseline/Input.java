package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class Input {
    // make private variables
    private String siteName;
    private String author;
    private String js;
    private String css;
    private String path;

    // make get and set methods


    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setJS(String js) {
        this.js = js;
    }

    public String getJS() {
        return js;
    }

    public void setCSS(String css) {
        this.css = css;
    }

    public String getCSS() {
        return css;
    }

    // method to get input
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Site name: ");
        setSiteName(in.nextLine());
        System.out.print("Author: ");
        setAuthor(in.nextLine());
        System.out.print("Do you want a folder for JavaScript? ");
        setJS(in.nextLine());
        System.out.print("Do you want a folder for CSS? ");
        setCSS(in.nextLine());

    }

}
