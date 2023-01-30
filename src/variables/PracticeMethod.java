package variables;

public class PracticeMethod {

    // static Method
    public static void staticMethod(){
        System.out.println("*******");
    }


    //Non Static Method
    public void nonStaticMethod() {
        System.out.println("This is not so much fun!!");
    }

    public static void main(String[] args) {
        staticMethod();
        PracticeMethod obj1= new PracticeMethod();
        obj1.nonStaticMethod();

    }
}
