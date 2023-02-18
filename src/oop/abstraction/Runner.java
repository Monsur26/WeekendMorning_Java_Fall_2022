package oop.abstraction;

public class Runner extends UseAbstractClass {

    public static void main(String[] args) {
        Runner obj1= new Runner();
        obj1.newAbstractMethod();
        obj1.newRegularMethod(4,6);
    }


public void newAbstractMethod(){
    System.out.println("I am using abstract class");
}
}
