package codingexcersie.StringsPractice;

import org.w3c.dom.ls.LSOutput;

public class Selectonlynumbersfromstring {

    public static void main(String[] args) {

    String abc = " This is scooter is priced at $128";

    String xyz = abc.replaceAll("[^0-9]", "");

        System.out.println(xyz);

    }
}
