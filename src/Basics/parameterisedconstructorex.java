package Basics;

public class parameterisedconstructorex {

    /*public Basics.parameterisedconstructorex (){

        System.out.println(" this is constructor ");


    }*/

    public parameterisedconstructorex(int g, int h) {

        System.out.println(" this is parameterised constuctor");

    }

    public static void main(String[] args) {

      //  Basics.parameterisedconstructorex dd = new Basics.parameterisedconstructorex();
        parameterisedconstructorex ff = new parameterisedconstructorex(4, 5);




    }

    public void getdata (){

        System.out.println(" this is method");
    }

}
