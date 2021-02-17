package codingexcersie.Basics;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = 123;
        int pop;
        int reversed = 0;

        while (x != 0) {
            pop = x % 10;
            x /= 10;
            reversed = (reversed * 10) + pop;
        }

        System.out.println(reversed);
    }

}
