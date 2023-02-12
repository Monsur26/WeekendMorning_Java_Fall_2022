package exceptionanderror;

public class ExceptionThree {
    public static void main(String[] args) throws NullPointerException{
        int num1=10;
        int num2=0;

        try{
            int divisionResult=num1/num2;
            System.out.println("Division Result : "+ divisionResult);


        } catch (Exception e){
            System.out.println("Dividing by Zero Exception ");
        } finally {
            int productResult=num1*num2;
            System.out.println("Product result : "+ productResult);
        }
        stringLength();
    }


    public static void stringLength(){
        String name=null;

        try {
            int a=name.length();
            System.out.println("Length of the String is :"+ a);


        } catch (NullPointerException e) {
            System.out.println("The Exception is "+ e.getMessage());
        } finally {

            name= "This class is not fun :(";

            System.out.println(name + "Length of the new String is : "+ name.length());

        }
    }
}
