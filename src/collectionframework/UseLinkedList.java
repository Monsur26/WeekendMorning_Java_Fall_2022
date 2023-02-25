package collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        LinkedList<String> list2=new LinkedList<String>();

        list1.add(100);
        list1.add(22);
        list1.add(30);
        list1.add(45);
        list1.add(2);
        list1.add(97);


        list2.add("String1");
        list2.add("String2");
        list2.add("String3");
        list2.add("String4");

        System.out.println("list 2 elements : "+ list2);

        Iterator iterator=list2.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Printing all the values of list 1: "+ list1);
        Collections.sort(list1);
        System.out.println("Printing all the values of list 1 after sorting: "+ list1);

        System.out.println("First element"+ list1.getFirst());// gets the first element of the list (Linked List)
        System.out.println("Last elemnet: "+ list1.getLast());

        System.out.println(list1.size());

        list1.remove(2);

        System.out.println(list1.size());
        System.out.println(list1);


    }
}
