package controlflow;

import java.sql.SQLOutput;

public class UseRecurssion {

    public static long recurssionOfSeries(long n){
        if (n == 0) {
            return 1;
        }
        return n * recurssionOfSeries(n-1) ;
    }

    public static  void countingWithForLoop(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }

    public static void countWithRecurssion(int count) {
        count++;

        if (count <= 10) {
            System.out.println(count);
            countWithRecurssion(count);
        }

    }

    public static void main(String[] args) {
        System.out.println(recurssionOfSeries(6));
        countingWithForLoop(10);
        System.out.println("****** ******** ******");
        countWithRecurssion(0);
    }
}
