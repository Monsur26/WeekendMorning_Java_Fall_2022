package collectionframework;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList(); // this will hold different data type

        ArrayList<Integer> integerArrayList=new ArrayList<Integer>(); // Integer type of value

        arrayList.add("This is String");
        arrayList.add(9.09);
        arrayList.add(35426);
        arrayList.add('A');
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size()); // gives the number of elements present in the list

        arrayList.add(1,"New Element"); //ading index 1 with new value
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());

        //replace a value with a new value
        arrayList.set(2, "Changed 9.09 from index 2");

        // these are all integer type of elements
        integerArrayList.add(9);
        integerArrayList.add(10);
        integerArrayList.add(20);

        System.out.println(integerArrayList.contains(10));
        System.out.println("Before removing :" + integerArrayList.indexOf(10));

        integerArrayList.remove(0); // removing element(s) in specified index or element

       // System.out.println(arrayList.toArray());

        // To iterate through the list and get the values

        System.out.println("**********************************************");

        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // iterate through the list to get all the values using for each loop
        System.out.println("\nInteger array List: \n");
        for (Object a:integerArrayList
             ) {
            System.out.println(a);
        }

        System.out.println("After removing :"+ integerArrayList.indexOf(10));


    }
}
