package methods;

public class Methods {

    static int a=5;
    static int b=9;
    int c=21;

    //Static Method
    public static void staticMethod(){
        int c=8;
        int sum=a+b+c;
        System.out.println("THe Sum of three numbers by static method with no parameter : " + sum);
    }

    //Non static Method
    public void nonStaticMethod(){
        int c=8;
        int sum= a+b+c;
        System.out.println("THe Sum of three numbers by non static method with no parameter : "+sum);
    }
    //static method with patameter
    public static void staticMethodWithParameter(int d, int e){
        int c=8;
        int sum=d+e+c;
        System.out.println("THe Sum of three numbers by static method with parameter : " + sum);
    }
    //Non static Method with parameter
    public void nonStaticMethodWithParameter(int d, int e ){
        int c=8;
        int sum= d+e+c;
        System.out.println("THe Sum of three numbers by non static method with parameter : "+sum);
    }
    // Return type method static
    public static int returnMethod(){
        int returnVariableInt= 12;
        double returnVariableDouble= 12.99;
        System.out.println("I have two variables, one is  "+ returnVariableInt +"and the other one is :"+returnVariableDouble);
        return returnVariableInt;
    }

    // Return Type Method Non-Static

    public int subtractionOfTwoNumber(){
        int firstNum=6;
        int secondNum=8;
        int subtraction=firstNum-secondNum;
        System.out.println("This function returns the subtraction of two predefined numbers :"+ subtraction);

        return subtraction;
    }

    //Return type static method with parameter
    public static String nameOfStudents(String name){

        System.out.println("Hello There, my name is  :"+name);
        return name;
    }
    public  String fullnameOfStudents(String firstname, String lastname){

        String fullname=firstname+" "+lastname;
        System.out.println("Hello There, my name is  :"+fullname);
        return fullname;
    }


    public static void main(String[] args) {
        staticMethod();// static Method can be called without creating an instance of a class
        staticMethodWithParameter(1,2);

        //new Methods().nonStaticMethod();// this is calling a non static method through object

        // This is also calling a non static method through object by declaring an object
        Methods obb1=new Methods();
        obb1.nonStaticMethod();

        obb1.nonStaticMethodWithParameter(a,b); // taking values from the global static variables
        obb1.nonStaticMethodWithParameter(21,90); // assigning values
        obb1.nonStaticMethodWithParameter(a, obb1.c); // taking values from global variables one static, one non static

        returnMethod();
        obb1.subtractionOfTwoNumber();
        nameOfStudents("Monsur");
        obb1.fullnameOfStudents(" Monsur","Ahmed");

    }
}
