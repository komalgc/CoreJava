package Basics;

public class constructorexample {

    //will not have any return type
    //will have the same name as class name
    //will be invoked whenver the object of the class is invoked

    public constructorexample(){

        System.out.println("I am in constructore");


    }

    public static void main(String[] args) {
        constructorexample cc = new constructorexample();
        cc.getdata();

    }

    public void getdata (){

        System.out.println("This is a class method name ");
    }
}
