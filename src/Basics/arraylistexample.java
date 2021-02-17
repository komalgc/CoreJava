package Basics;

import java.util.ArrayList;

public class arraylistexample {

    //Arraylist , LinkedList and Vector class implement List interfaces
    //Array and ArrayList difference , Arraylist is dynamic Arraylist we can insert values anywhere and
    //Remove from anywhere
    //Arraylist accepts duplicate values



    public static void main(String[] args) {

        ArrayList<String> aa = new ArrayList<String>();

        aa.add("Rahul");
        aa.add("Kaira");
        aa.add("Komal");

        aa.add(1,"Lokurte");
        System.out.println(aa);
        System.out.println(aa.contains("java"));
        System.out.println(aa.get(3));
        System.out.println(aa.indexOf("Rahul"));
        aa.ensureCapacity(30);
        aa.size();




    }
}
