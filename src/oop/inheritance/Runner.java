package oop.inheritance;

public class Runner {
    public static void main(String[] args) {
        FirstClass obj1= new FirstClass();
        SecondClass obj2=new SecondClass();
        ThirdClass obj3=new ThirdClass();
        FourthClass obj4=new FourthClass();

        // Same implementation of inheritaed property
        obj1.nameAndAge(5,"first");
        obj2.nameAndAge(76,"Second");
        obj3.nameAndAge(21,"Third");


        // Different implementation of inherited property
        obj2.MathOperations(5,10); // Multiplication
        obj3.MathOperations(5,10); //Addition
        obj4.MathOperations(5,10); //division
    }
}
