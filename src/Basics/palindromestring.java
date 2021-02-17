package Basics;

public class palindromestring {

    public static void main(String[] args) {

        String a = "madam";
        String b = "";

        for (int i = a.length() - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);



        }
        System.out.println("after reversing string " + b);


        if(a==b)
        {
            System.out.println("Its a palindrome");
        }
        else
        {
            System.out.println("its not");
        }



    }

}
