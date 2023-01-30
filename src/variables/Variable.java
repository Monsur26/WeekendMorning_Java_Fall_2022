package variables;

public class Variable {
    // Instance Variable
    int instanceVariable=90; // this is instance of class

    //static variable or Global variable
    static  int staticVariable=43;

    public static void main(String[] args) {
        // local variable stays inside a block of code or function
        int fed=98; //local variable
        System.out.println(fed);
        //System.out.println(instanceVariable);
        System.out.println(staticVariable);

        /*
        Syntax of an Object
        ClassName ObjectName = new Constructors;   Constructor == ClassName();
        */

        Variable vr1= new Variable();
        System.out.println(vr1.instanceVariable);

        int a=9;
        int b=a;

        int test= vr1.instanceVariable; //90
        test=78;

        System.out.println(test);

    }

}
