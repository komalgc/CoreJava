package Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(2, "Rauhl");
        hm.put(3,"Kiara");
        hm.put(66,"Lokurte");
        hm.put(4,"Komal");

        System.out.println(hm);
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("Rahul"));
        System.out.println(hm.entrySet()); // is used to retrieve all the key-value pairs called Map.Entries and stores internally into a set.

        //Interview Question: You have some key value pairs, how do u push that to set collection
        //Create a Hashtable and pass the table to set collection and print the key n values separately using the
        //Iterator

        Set sn = hm.entrySet();

        Iterator ii = sn.iterator();

        while(ii.hasNext()){

            Map.Entry mp = (Map.Entry)ii.next(); //casting map entry to set
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }



    }

}
