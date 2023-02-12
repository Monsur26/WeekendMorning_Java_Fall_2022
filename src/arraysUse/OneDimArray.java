package arraysUse;

import java.util.Arrays;

public class OneDimArray {
    public static void main(String[] args) {
        //Primitive data declaration

        int num=2;

        //One Dimensional Array

        // Declaration of Array
        int num1[]= {2,3,4,7,8};

        int [] num2={2,3,4,7,8};

        String [] name={"Taseen", "Mehnaz", "Munna", "Nusrat"};

        // Another way of Array Declaration

        int [] num3=new int[3]; // created a variable with the length of 3

        num3[0]=3;
        num3[1]=13;
        num3[2]=23;

        int a= num1.length;
        int lastIndex=a-1;

        // Getting all the elements using for loop
        for (int i = 0; i <=lastIndex ; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();

        //Getting all the values using for each loop

        for (String n :name
             ) {
            System.out.print(n + ",");
        }

        // specific value of an index
       System.out.println("\nThe array values of num2 at index 3 is :"+ num2[3]);
       System.out.println("The values for array num2 are :"+ Arrays.toString(num2)); // Getting all the values of an array
      // Comparing two different arrays to figure out if they equal in terms of elements
        System.out.println("Comparing two arrays if they are equal : "+ Arrays.equals(num1, num2));

        // creating a copy of an existing array
        int []num4= num1.clone();
        System.out.println("num4 array is : "+ Arrays.toString(num4));

        //fill the values of an array with specific value
        Arrays.fill(num4, 0);
        System.out.println("Array is filled with value 0 for num4 "+ Arrays.toString(num4));

        //chnaging a specific value at an index
        num1[4]=56;
        System.out.println(Arrays.toString(num1));

        // creating an array from another array using specific length ie elements
        int num5[]=Arrays.copyOf(num1, 3);
        System.out.println("New array from using specific length of num1 is : "+ Arrays.toString(num5));

        // Sorting an array in ascending order
        int [] num6={4,400, 87, 65, 98, 20, 2000,450};
        Arrays.sort(num6);
        System.out.println(Arrays.toString(num6));

        System.out.println(num6[2]);

        // Searching for a specific value and getting the index
        System.out.println("Finding out if 2000 exists in num6 arrays : "+ Arrays.binarySearch(num6 ,2000) );

        //Exception
        System.out.println("Finding out array at index where no value exists"+ num6[10]);

    }
}
