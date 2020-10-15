public class functionoverload {

    public void getdata(){
        System.out.println(" this is getdata");

    }
    // Same function but diff argument, or diff no of arguments, in same class is called functionoverload

    public void getdata(int i){


        System.out.println(" this is parameterised ");
    }

    public static void main(String[] args) {

        functionoverload obj = new functionoverload();
        obj.getdata(7);
        obj.getdata();


    }

}
