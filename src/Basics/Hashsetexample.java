package Basics;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

    //Hashset, treeset , LinkedHashset classes implement Set interface
    //Hashset does not accept duplicate values
    //No gaurantee about the sequence of the data stored
    //everthing is stored in random order

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Rahul");
        hs.add("Komal");
        hs.add("Kaira");
        hs.add("Lokurte");
        hs.add("Komal");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains("Rahul"));
        System.out.println(hs.isEmpty());

        Iterator<String> ii = hs.iterator();

        while(ii.hasNext()){

            System.out.println(ii.next());
        }

    }

}
