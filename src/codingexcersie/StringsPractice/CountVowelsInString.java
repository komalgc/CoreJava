package codingexcersie.StringsPractice;

public class CountVowelsInString {

    public static void main(String[] args) {

        String original = "kioaeiojusnpoyop";
        String vowels = "aeiouy";
        int vowelscount = 0;
        int consonantscount = 0;

        String normalised = original.toLowerCase();
        char[] chars = normalised.toCharArray();
        for (char c : chars) {
            if (vowels.indexOf(c) != -1) {
                vowelscount++ ;
            }
           else if(c != ' '){
               consonantscount++;


            }
        }
    }
}

