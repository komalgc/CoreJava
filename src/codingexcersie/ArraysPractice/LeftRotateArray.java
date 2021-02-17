package codingexcersie.ArraysPractice;

import java.util.Arrays;

public class LeftRotateArray {


        public static void main(String[] args) {

            int[] arr = {1,2,3,4,5,6,7};
            int r =3;

            leftrotate(arr, r);

            System.out.println(Arrays.toString(arr));

        }

    private static void leftrotate(int[] arr, int r) {

            //reverse first 'r' elements

        reverse(arr,0,r-1);

        //reverse remaining 'numbers -r' in array

        reverse(arr,r,arr.length -1);

        //reverse entire array
        reverse(arr, 0, arr.length -1);


    }

    private static void reverse(int[] arr, int i, int j) {
            //exchange the data between i and j
        for(int a=i,b = j; a<b; a++, b--){
            swap(arr, a, b);
        }


    }

    private static void swap(int[] arr, int a, int b) {

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

    }

}
