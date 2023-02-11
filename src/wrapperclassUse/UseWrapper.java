package wrapperclassUse;

public class UseWrapper {
    public static void main(String[] args) {
        int a=50;

        Integer IWrapper=Integer.valueOf(a);

        System.out.println("The value is : "+ IWrapper.intValue());

        double d=40.50;

        Double IDouble=Double.valueOf(d);

        System.out.println("The Value of double is : "+ IDouble.doubleValue());
    }
}
