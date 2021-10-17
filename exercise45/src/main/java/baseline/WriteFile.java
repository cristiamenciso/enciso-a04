package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private FileWriter writer;
    private List<String> list;

    // constructor
    public WriteFile(String name, List<String> list) throws IOException {
        ReadFile readFile= new ReadFile();
        writer = new FileWriter("data/" + name);
        this.list = list;
    }

    // method to write to a file
    public void writeToFile() throws IOException {
        for(int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            String str = "utilize";
            int index = 0;
            while(true) {
                index =temp.indexOf(str, index);
                if(index != -1) {
                    index += str.length();
                }
                else {
                    break;
                }
            }
            temp = temp.replace("utilize", "use");
            writer.write(temp +"\n");
        }
        writer.close();
    }
}
