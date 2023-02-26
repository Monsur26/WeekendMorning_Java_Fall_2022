package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class UseHashSet {
    public static void main(String[] args) {

        HashSet set1 =new HashSet(); //  No defined object tpe

        HashSet<String> set2= new HashSet(); // Defined object


        // Adding elements in Set

        //  it is only holding unique values (once) no matter how many times it is inserted
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(2);
        set1.add("Monkey");

        System.out.println(set1);

        set2.add("Nusrat");
        set2.add("Munna");
        set2.add("Ruslan");
        set2.add("Alvi");
        set2.add("Rebecca");
        set2.add("Malek");
        set2.add("Lama");


        // traversing set
         Iterator iterator=set2.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

        System.out.println("***************************************");

         // traversing with foreach
        for (String a:set2
             ) {
            System.out.println(a);
        }

        /*Tree set has same implementation
        * only difference is Tree set maintains Ascending Order
        * and Tree Set does not hold NULL values*/
    }
}
