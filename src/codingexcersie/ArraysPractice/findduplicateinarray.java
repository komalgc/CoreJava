package codingexcersie.ArraysPractice;

import java.util.ArrayList;

public class findduplicateinarray {

    public static void main(String[] args) {


        int arr[] = {4, 4, 5, 6, 5, 7, 6, 4, 5, 7};

        //find the no of duplicates in the array
        //4 is present 3 times
        //5 is present 3 times
        //6 is present 2 times
        //7 is present 2 times

        ArrayList<Integer> ab = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int k = 0;

            if (!ab.contains(arr[i])) {
                ab.add(arr[i]);
                k++;

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        k++;

                    }
                }
                System.out.println("This is the number " + arr[i] + "repeated " + k);
            }
        }


    }

}
