package oop.abstraction;

public abstract class UseAbstractClass {
    // use of abstract keyword to define it is an abstract class


    // it is possible to have variables with or withoat instance
    int a;
    int b=100;

    // both abstract and regular/concrete methods can be implemented

    /**
     * This is a regular method inside the abstract class
      * @param a is an input
     * @param b is an input
     */
    public void newRegularMethod(int a, int b){
        System.out.println("value a : "+ a + " Value b :"+b);
    }

    /**
     * This is an abstract method
     * This will be implemented where the abstract class is extended
     *
     */
    public abstract void newAbstractMethod();
}
