package Basics;

public class callingmethod {

    public void getdata(){

        System.out.println("I am in method");

    }

    public static void main (String[] args){

        /* create a object for that class, and then we can access all the methods from that class*/

        callingmethod cm = new callingmethod();
        cm.getdata();

        System.out.println("I am in main class");

        /* println here prints the output in next line */



    }
}
