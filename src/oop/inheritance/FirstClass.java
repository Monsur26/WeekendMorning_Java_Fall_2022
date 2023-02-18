package oop.inheritance;

public class FirstClass {

    int age;
    String name;
   // final String str; // using Final keyword, the variable must have a value

    /**
     * This is non static  public method which can be inherited by other classes
     * @param age
     * @param name
     */
    public  void nameAndAge(int age, String name){
        System.out.println("Name "+ name +" Age "+age );
    }

    /**
     * This is a static method, will not be overridden
     */
    public static void staticMethod(){
        System.out.println("This is static method");
    }

    /**
     * This is a private method, can not be inherited
     * @return
     */

    private String nameofSuperClass(){

        System.out.println("This is a private method returning name variable from class");
        return name;
    }


    /**
     * This is a final method, it can not be inherited
     */
    public final void finalMethod(){
        System.out.println("final method");
    }

}
