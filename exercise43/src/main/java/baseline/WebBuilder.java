package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class WebBuilder {
    // method to makes the directory path based on user input
    private String makePath(String siteName) {
        String currentPath = System.getProperty("user.dir");
        currentPath += "\\" + siteName;
        return currentPath;

    }
    // method to generate website
    public void makeSite(String siteName, String author, String js, String css) throws IOException {
        File website = new File(makePath(siteName));
        boolean siteCreated = website.mkdir();
        String str = "Created";
        if(siteCreated) {
            System.out.println(str + makePath(siteName));
            FileWriter writer = new FileWriter(new File(makePath(siteName) + "\\index.html"));
            try (writer){
                writer.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                writer.write("\t<meta author=\""+author+"\">\n");
                writer.write("\t<title>"+siteName+"</title>\n");
                writer.write("</head>\n<body>\n\n</body>\n</html>");
                System.out.println("Created" + makePath(siteName) + "\\index.html");
                if(Objects.equals(js, "y") || Objects.equals(js, "Y")) {
                    File jsFolder = new File(makePath(siteName) + "\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated) {
                        System.out.println(str + jsFolder + "\\");
                    }
                    else {
                        System.out.println("Js folder not created");
                    }
                }
                if(Objects.equals(css, "y") || Objects.equals(css, "Y")) {
                    File cssFolder = new File(makePath(siteName) + "\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated) {
                        System.out.println(str + cssFolder + "\\");
                    }
                    else {
                        System.out.println("CSS folder not created");
                    }
                }

            }
            catch(IOException e) {
                System.out.println("Index.html not created");
            }
        }
        else {
            System.out.println("website folder not created");
        }
    }

}
