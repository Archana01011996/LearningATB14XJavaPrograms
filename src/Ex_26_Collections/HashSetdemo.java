package Ex_26_Collections;

import java.util.*;

public class HashSetdemo {
    public static void main(String[] args) {


        HashSet myset=new HashSet();
        //Set myset=new HashSet();
       // HashSet <String>myset=new HashSet<String>();

        //adding elements to HashSet
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //Printing hashset
        System.out.println(myset);  //[null, A, 100, 10.5, welcome, true]
        //removing element
        myset.remove(100);
        System.out.println("After removing data" + myset);  //[null, A, 10.5, welcome, true]

        //Inserting element-not possible coz no index

        //Access specific element-->not possible  -coz no index
        //workaround for accessing element
        //Convert Hashset-->ArrayList

        ArrayList a1=new ArrayList(myset);
        System.out.println(a1); //[null, A, 10.5, welcome, true]
        System.out.println(a1.get(2));

        //Read all elements using for each loop cz no index

        for(Object x:myset)
        {
            System.out.println(x);
        }

        //using iterator
        Iterator it=myset.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //size of hashset
        myset.size();

        //clearing elements
        myset.clear();
        //checking hashset is empty
        myset.isEmpty();

        //Linked Hashset

        Set lhs=new LinkedHashSet();
        //LinkedList mechanism to store element
        //order will maintain,no duplicates

        lhs.add("Apple");
        lhs.add("mango");
        lhs.add("pineapple");
        lhs.add("orange");
        lhs.add("orange");
        lhs.add(null);

        System.out.println(lhs);

        Set ts=new TreeSet();
        //Black and Red Tree mechanism to store the element
        //order will maintain,natural sorting based on alphbets

        ts.add("Apple");
        ts.add("mango");
        ts.add("pineapple");
        ts.add("orange");
        ts.add("banana");
        ts.add("orange");
//        ts.add(123);  //class cast exception
//        ts.add(null); //nullpointerexception
//

        System.out.println(ts);

    }
}
