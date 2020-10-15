public class Staticclassexample {

    String name = ""; //Instance Variable , this is at object level
    String address = "";
    static String city = "Bangalore"; //Static Variable , this is at class level
   static  int i =0;


    public Staticclassexample(String name, String address){

        this.name = name; // constructor variables are called local variables
        this.address = address;
        i++;
        System.out.println(i);

    }

    public void getaddress(){

        System.out.println(address +" " + city);
    }

    public static  void getcity(){ //Static method uses only static variables

        System.out.println(city);
    }

    public static void main(String[] args) {

        Staticclassexample obj = new Staticclassexample("Bob", "Jayanagar");

        obj.getaddress();
        Staticclassexample.getcity();
        Staticclassexample.i = 4; //can assign value at runtime to static variables





    }

}
