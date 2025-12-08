package Ex_26_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {
    public static void main(String[] args) {

        List mylist=new LinkedList();
        //Linkedlist doesnt care about duplciates
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        System.out.println(mylist); // [1, 2, 3, 4, 4]


        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }
            //for each
        for(Object num:mylist)
        {
            System.out.println(num);
        }

        //iterator
        Iterator it=mylist.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

}
