package codingexcersie.Basics;

public class palindrome {
    public static void main(String[] args) {


        String palindrome = "teacher";
        String normalised = palindrome.toLowerCase();


        StringBuilder reversed = new StringBuilder();
        int i;
        for (i = normalised.length() - 1; i >=0; i--) {
            reversed.append(normalised.charAt(i));
        }

        if (normalised.equals(reversed.toString()))
        {
            System.out.println(palindrome + " is palindrome");
        }
        else{
            System.out.println(palindrome + " is not palindrome");
        }

    }
}
