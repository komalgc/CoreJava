package Basics;

public class childabstractclass extends abstractclassexample{  // extend word is used to inherit the parent class


    public static void main (String[] args){
        childabstractclass cc = new childabstractclass();

        cc.greensignal();
        cc.redsignal();
        cc.yellowsignal(); //access to parent class method


    }

    public void redsignal(){

        System.out.println("This is a red signal ");
    }

    @Override
    public void greensignal() { //you have the choice to implement the parent abstract class
        System.out.println("this is greensignal");

    }
}
