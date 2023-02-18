package oop.abstraction;

public class RunnerSecond implements UseInterface{
    public static void main(String[] args) {
        RunnerSecond obj2=new RunnerSecond();
        obj2.myInterfaceMethod();
        obj2.myInterfaceMethod2(5,6);
        obj2.myInterfaceMethod3();
    }

    @Override
    public void myInterfaceMethod() {
        System.out.println("First Method");
    }

    @Override
    public void myInterfaceMethod2(int a, int b) {
        int sum=a+b;
        System.out.println("Sum : "+ sum
        );
    }

    @Override
    public String myInterfaceMethod3() {
        String myname="Name";
        System.out.println(myname);
        return myname;
    }
}
