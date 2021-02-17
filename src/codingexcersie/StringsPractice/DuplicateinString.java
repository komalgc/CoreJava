package codingexcersie.StringsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateinString {

    public static void main(String[] args) {

        String text = "This this is is the Saket Saket";
        printAllDuplicates(text);
    }

    private static void printAllDuplicates(String text) {
        String input = text.toLowerCase();
        String[] split = input.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<split.length; i++){
            if(map.containsKey(split[i])){
                map.put(split[i], map.get(split[i]) + 1);
            }
            else{
                map.put(split[i], 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " is present  " + entry.getValue() + " times");
        }
    }
}
