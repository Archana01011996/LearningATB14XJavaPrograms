package Ex_26_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Arraylistdemo {
    public static void main(String[] args) {

        List fruits= List.of("orange","apple","mango","pomogranate","banana");
        List marks=new ArrayList();
        marks.add(89);
        marks.add(95);
        marks.add(91);
        marks.add(67);
        //sort
        Collections.sort(marks);
        System.out.println(marks);  //[67, 89, 91, 95]
        //reverse sort
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);    //[95, 91, 89, 67]
        System.out.println(fruits);

        //Declaration
        ArrayList mylist=new ArrayList();
        //List myList=new ArrayList();  /storing child object in parent type reference variable
        //if we want to store homegenous data
        //ArrayList <Integer> mylist=new ArrayList<Integer>();
        //CAN STORE DUPLICATES,DIFFERENT DATA(HETEROGENOUS),CAN STORE NULL VALUES AND INDEX STARTS FROM 0
        mylist.add(100);
        mylist.add(100);
        mylist.add("Archana");
        mylist.add(30.5);
        mylist.add(true);
        mylist.add('A');
        mylist.add(null);
        mylist.add(null);

        //Size of ArrayList
        System.out.println("Size of an arraylist " +  mylist.size());

        //printing arraylist
        System.out.println("printing data from arraylist : " + mylist);

        //First and last index
        System.out.println(mylist.indexOf(null));   //6
        System.out.println(mylist.lastIndexOf(null));    //7

        //list contains
        System.out.println("List contains 'A' " + mylist.contains('A'));  //TRUE

        //remove element from arraylist
        System.out.println(mylist.remove(1));
        System.out.println("After removing the :" +mylist);

        //insert element in the arraylist
        mylist.add(1,100);
        System.out.println(mylist);

        //modify element
        mylist.set(1,"Java");
        System.out.println(mylist);
        //Access specific element from arraylist
        System.out.println( mylist.get(3));

        //Reading all the elements from arraylist
        //using normal forloop

        for(int i=0;i<mylist.size();i++)
        {
            System.out.print(mylist.get(i) + " ");
        }
        //using for each
        for(Object o:mylist)
        {
            System.out.println(o);
        }

        //Using iterator


        Iterator it=mylist.iterator();
        //Iterator <String> it=mylist.iterator<String>();
       // System.out.println(it.next());  --returns only 1st index (100 here) and doesnt print rest other
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //checking arraylist is empty or not
        System.out.println( mylist.isEmpty());

        //create separate arraylist
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);
        mylist2.add("Archana");

        //remove all data from arraylist
        mylist.removeAll(mylist2);
        //after removing arraylist
        System.out.println(mylist);

        //remove all the elements/clear
        mylist.clear();
        System.out.println(mylist.isEmpty());
    }
}
