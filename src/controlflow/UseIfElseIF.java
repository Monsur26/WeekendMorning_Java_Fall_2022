package controlflow;

import java.util.Scanner;

public class UseIfElseIF {
    public static void main(String[] args) {
        int marksObtained = 50;

        if (marksObtained >= 60 && marksObtained < 70) {
            System.out.println("Grade Obtained is:  C ");
        } else if (marksObtained >= 70 && marksObtained < 80){
            System.out.println("Grade Obtained is : B");
        } else if (marksObtained >= 80 && marksObtained < 100){
            System.out.println("Grade Obtained is : A");
        } else {
            System.out.println("No Valid Grade points");
        }

        logicalOperation(5,11); // static method- called without an object

        UseIfElseIF obj1=new UseIfElseIF();
        Scanner sc= new Scanner(System.in);
        System.out.println(" Please input a number of day");
        int numofDay=sc.nextInt();
        obj1.whichDay(numofDay); // non static method- called by creating an object

        dayofClass(4);
    }

    public static void logicalOperation(int num1, int num2){

        if ((num1 >= 5 && num1 <=10) && (num2>=11 && num2 <=20 ) ) {
            int sum= num1+num2;
            System.out.println("The sum of num is :" +sum);
        } else if ((num1 >= 21 && num1 <=30) && (num2>=31 && num2 <=40) ){
            int product=num1*num2;
            System.out.println("The product of two number is :"+ product);
        } else {
            System.out.println("No condition matched!!");
        }
    }

    public void whichDay(int daynum){
        if(daynum == 1){
            System.out.println("It's Monday");
        } else if (daynum == 2){
            System.out.println("Its Tuesday");
        } else if (daynum == 3){
            System.out.println("Its Wednesday");
        } else if (daynum == 4){
            System.out.println("Its Thursday");
        } else if (daynum == 5){
            System.out.println("Its Friday");
        } else if (daynum == 6){
            System.out.println("Its Saturday");
        } else if (daynum == 7){
            System.out.println("Its Sunday");
        } else {
            System.out.println("Not a valid number! ");
        }
    }

    public static int dayofClass(int classNum){
        if (classNum == 1){
            System.out.println("Its Saturday");
        } else if (classNum == 2){
            System.out.println("Its Sunday");
        } else {
            System.out.println("Not a valid day");
        }
        return classNum;
    }
}
