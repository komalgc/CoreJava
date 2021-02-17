package Basics;

public class interfacseclassex implements Interfacexample {

    public static void main(String[] args){



    Interfacexample ii = new interfacseclassex();
    ii.greensignal();
    ii.regsignal();
    ii.yellowsignal();

    }

    @Override
    public void greensignal() {
        System.out.println("green signal implenmented");


    }

    @Override
    public void regsignal() {
        System.out.println("red signal implemented");

    }

    @Override
    public void yellowsignal() {
        System.out.println("yellow signal implemented ");

    }
}

