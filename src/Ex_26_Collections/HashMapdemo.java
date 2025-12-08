package Ex_26_Collections;


import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class HashMapdemo {
    public static void main(String[] args) {

   //     HashMap hm=new HashMap();
   //     Map hm=new HashMap();
        HashMap <Integer,String>hm=new HashMap<Integer,String>();
               //adding pairs
        hm.put(101,"John");
        hm.put(102,"Scott");
        hm.put(103,"mary");
        hm.put(104,"Scott");
        hm.put(102,"David");   //replaced 102 ,latest value

        System.out.println(hm);//{101=John, 102=David, 103=mary, 104=Scott}

        //size of hashmap
        System.out.println(hm.size());
        //remove pair
        System.out.println(hm.remove(103));  //using key
      //  System.out.println(hm.remove(103 ,"mary"));  //using key and value //mary
        System.out.println(hm);

        //access value of the key
        System.out.println(hm.get(102));  //david

        //get all keys from hashmap
        System.out.println(hm.keySet());   //[101, 102, 104]
        System.out.println(hm.values());   //[John, David, Scott]
        System.out.println(hm.entrySet());   //[101=John, 102=David, 104=Scott]

        //read the data

        for(int k:hm.keySet())
        {
            System.out.println(k + " " +hm.get(k));
        }

        //using iterator

    Iterator<Map.Entry<Integer, String>> it= hm.entrySet().iterator();
        while(it.hasNext())
        {
           Map.Entry<Integer,String> entry= it.next();
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

        System.out.println();
        //clear
         hm.clear();

        //is empty
        System.out.println(hm.isEmpty());



    }
}
