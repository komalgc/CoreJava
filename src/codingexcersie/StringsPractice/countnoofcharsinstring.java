package codingexcersie.StringsPractice;

public class countnoofcharsinstring {
    public static void main(String[] args) {

        String input = " This is the charcter string ";
        printNumberOfCharacters(input);

    }

    private static void printNumberOfCharacters(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(" The number of characters are " + count);
    }
}
