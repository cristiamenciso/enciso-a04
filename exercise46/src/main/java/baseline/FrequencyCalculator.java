package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class FrequencyCalculator {

    // method to read from file
    public Map<String, Integer> readFile() throws FileNotFoundException {
        FrequencyCalculator calc = new FrequencyCalculator();
        FileInputStream in = new FileInputStream("data/exercise46_input.txt");
        Scanner sc = new Scanner(in);
        Map<String, Integer> map = new HashMap<>();
        while(sc.hasNextLine()) {
            calc.computeFrequency(sc.nextLine(), map);
        }
        sc.close();
        return map;
    }


    // method to calculate frequency
    public void computeFrequency(String line, Map<String, Integer> map) {
        for(String key : line.split("\\s")) {
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }
        }


    }
    // method to print out histogram
    public Map<String, Integer> sortMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    public void printGraph(Map<String, Integer> map) {
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>((e1, e2) -> (e2.getValue() - e1.getValue()));
        q.addAll(map.entrySet());
        while(!q.isEmpty()) {
            Map.Entry<String, Integer> entry = q.poll();
            System.out.println(entry.getKey()+"   " + "*".repeat(entry.getValue()));

        }

    }


}
