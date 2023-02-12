package exceptionanderror;

public class ExceptionTwo {
    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int result = num1 / num2;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args){
        divide(1,0);

        int num1=1;
        int num2=0;

        int result = num1 / num2;

        System.out.println(result);
    }

}
