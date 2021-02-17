package Basics;

public class Stringconcept {


    public static void main (String[] args){

        /* Two ways to define string
        1. String literal
        2. String class
         */

        String a = "hello"; //String literal backend creates a class too during compliation
         String b = "hello"; // backend goes check if hello string is present in string pool, if yes it point string b to a , no new memory allocation is happened and
        //we can manulipate on string b



        String ab = new String("hello"); // String class, new memory allocation for ab





    }

}
