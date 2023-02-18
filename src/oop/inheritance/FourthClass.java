package oop.inheritance;

public class FourthClass extends SecondClass {
    @Override
    public void MathOperations(int a, int b) {
        //super.MathOperations(a, b);
        try{
            int division= a/b;
            System.out.println(division);

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
