package Basics;

public class trycatchexample {

    //try block is used to let the code be tried and if any exceptions that needs to catched in
    //catch block
    //every try block should be followed by a catch block
    //one try block can have multiple catch blocks
    //finally block used to execute the code irrespective of any exception occured (used in automation
    //frameworks where we need to delet the cookies or close the browser


    public static void main(String[] args) {

        int a= 5;
        int b = 0;
        int c ;
        try{

           // System.out.println(a/b);

            int aa[] = {1,2,4,6};

            System.out.println(aa[7]);


        }
        catch(ArithmeticException art){
            System.out.println(" I catched the exception ");
        }
        catch(ArrayIndexOutOfBoundsException hh){
            System.out.println("I catched aaray exception");
        }
        finally {
            System.out.println("Delete all cookies");
        }
    }

}
