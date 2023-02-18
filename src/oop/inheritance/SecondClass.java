package oop.inheritance;

public class SecondClass extends FirstClass { //Single inheritance

    public void secondClassMethod1(){
        System.out.println("First Method");
    }
    private void secondClassMethod2(){

    }

    @Override
    public void nameAndAge(int age, String name) {
        super.nameAndAge(age, name);
       // System.out.println("This is implemented in the second class for name :"+name + "age : "+ age);
    }

    public void MathOperations(int a, int b){
        int product=a*b;
        System.out.println(product);
    }
}
