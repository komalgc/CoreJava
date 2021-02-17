package codingexcersie.ArraysPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateinArray {
    public static void main(String[] args) {

        int[] numbers = {11, 2, 11, 99, 2,7,9};
        printduplicatesinArray(numbers);
    }

    private static void printduplicatesinArray(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<numbers.length; i++){
            if(map.containsKey(numbers[i])){
                map.put(numbers[i], map.get(numbers[i]) +1 );
            }
            else{
                map.put(numbers[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " is present " + entry.getValue() + " times ");




        }
    }

}

