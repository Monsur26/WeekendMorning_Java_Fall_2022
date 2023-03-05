package garbageollector;

public class Garbage {
    String name="My name is Garbage";
    public static void main(String[] args) {
        Garbage obj1= new Garbage();
        Garbage obj2= new Garbage();
        Garbage obj3= new Garbage();

        System.out.println(obj1.name);

        System.gc();

       // Runtime.getRuntime().gc();
    }
}
