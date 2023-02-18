package oop.inheritance;

public class ThirdClass extends SecondClass { //Multi level inheritance
    @Override
    public void nameAndAge(int age, String name) {
        super.nameAndAge(age, name);
    }

    @Override
    public void MathOperations(int a, int b) {
        //super.MathOperations(a, b);
        int sum=a+b;
        System.out.println(sum);
    }
}
