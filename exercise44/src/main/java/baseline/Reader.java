package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import com.google.gson.*;


import java.io.*;
import java.util.Iterator;


public class Reader {

    private String input;


    // method to get input from user
    public String askInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is the product name? ");
        return bufferedReader.readLine();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    // method to read from json file
    public JsonArray readFile() throws FileNotFoundException {
        Object obj = JsonParser.parseReader(new FileReader("data/exercise44_input.json"));
        JsonObject jsonObj = (JsonObject) obj;
        return (JsonArray)jsonObj.get("products");
    }

    public JsonObject searchFile(String str, JsonArray array) throws IOException {
        String input = str;
        Iterator<JsonElement> iterator = array.iterator();
        JsonObject temp = new JsonObject();
        String replace = array.toString().toLowerCase().replace("\"", "");
        if(!replace.contains(input.toLowerCase())) {
            do {
                System.out.println("Sorry, that product was not found in our directory.");
                setInput(askInput());
            }while(!replace.contains(getInput()));

        }
        else {
            while (iterator.hasNext()) {
                setInput(str);
                JsonObject json = (JsonObject) iterator.next();
                String name = json.get("name").toString();
                if (input.equalsIgnoreCase(name.replace("\"", "")) || getInput().equalsIgnoreCase(name.replace("\"", ""))) {
                    printResult(json);
                    return json;
                }
            }
        }
        
        return temp;
    }
    private void printResult(JsonObject json) {
        System.out.println("Name: "+ json.get("name"));
        System.out.println("Price: "+json.get("price"));
        System.out.println("Quantity: "+json.get("quantity"));

    }
}

