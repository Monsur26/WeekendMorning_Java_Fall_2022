package exceptionanderror;

public class ExceptionAndError {

    public static void mathsOperation(int m, int n){
        try{
            int division=m/n;
            System.out.println("Dividing two numbers :" + division);

        } catch (Exception exception){
            System.out.println("Exception happened ");
        }
    }

    public static void main(String[] args)  {
        int a= 10;
        int b=0;
        int c=15;
        int d=9;

        double x=0.0;
        double y=3.0;

         try{
             int divisionOfNumbers= a/b;
             System.out.println(divisionOfNumbers);

         } catch (Exception e){
             System.out.println("Exception due to mathematical error");
         }



        int productOfNumbers=c*d;
        System.out.println("Product of Two Numbers :"+productOfNumbers);

        mathsOperation(1,0);

        try {
            double divisionOfDouble = y / x;
            System.out.println(divisionOfDouble);
        } catch(Exception e){
            System.out.println("Math Error");
        }

    }
}
