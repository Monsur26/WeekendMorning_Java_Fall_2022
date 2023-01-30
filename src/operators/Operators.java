package operators;

public class Operators {
    public static void main(String[] args) {
        /* arithmetic operators */

        //Addition
        int a=5;
        int b=7;
        int c= 10;

        System.out.println("This is the sum of numbers : "+(a+b+c));

        int sum=a+b+c;
        System.out.println("This is sum using a variable : "+sum);

        //Subtraction
        int subtractionOfNumbers= a-b-c;
        System.out.println("This is the subtraction of three numbers : "+subtractionOfNumbers);

        //Combination of addition and subtraction
        int combinationOFAddAndSubs=(a+b)-c;
        System.out.println("Combination of addition and subtraction : "+combinationOFAddAndSubs);

        //Division
        int divideTwoNumbers= c/a;
        System.out.println("Dividing two numbers : "+ divideTwoNumbers);

        //Multiplication
        int multiplicationOfTwoNumbers=a*b;
        System.out.println("Multiplication of two numbers :" +multiplicationOfTwoNumbers);

        //Modulus
        int modOftwoNumbers= c%b;
        System.out.println("The Modulus of two numbers : "+ modOftwoNumbers);

        // == operator
        System.out.println(a==b);
        System.out.println(a!=b);

        // Assignment operator

        //incrementing by one
        System.out.println(a); //5
        a++;
        System.out.println(a); //6
        ++a;
        System.out.println(a); //7
        --a;
        a--;
        a--;
        a--;
        a--;
        a++;
        a++;
        a++;
        a++;
        --a;
        --a;
        --a;
        --a;
        System.out.println(a); //

        //incrementaing by more than one

        a+=2;
        a+=2;

        System.out.println(a);

        a=-9;
        a=-3;
        a=-6;
        System.out.println(a);

        a*=2;
        System.out.println(a);

        a/=2;
        System.out.println(a);

        int m=3;
        int n=8;
        int l=21;

        System.out.println(m>9); //false
        System.out.println(m<9); //true
        System.out.println(m>=3); //true
        System.out.println((m+n)>=l); //false
        System.out.println((m+n)<=l); //true


        int ab=5;
        int cd=++ab;
        System.out.println(cd);

        int ez=8;
        int yd=ez++;
        System.out.println(yd);


    }
}
