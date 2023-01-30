package methods;

public class PracticeMethod {
    static int numberOne=12;
    static int numberTwo=14;
    int thirdNumber=43;

    //static void methdo

    static void additionOfNumbers(){
        int sum=numberOne+numberTwo;

        System.out.println("This is the sum of two numbers : "+ sum);
    }

    //non-static return method
    int multiplicationOfTwoNumbers(){
        int fourthNumber=5;
        int multiplyTwoNumber=thirdNumber*fourthNumber;
        System.out.println("This is the product of two numbers :"+multiplyTwoNumber);
        return multiplyTwoNumber;
    }

    public static void main(String[] args){
        additionOfNumbers();

        PracticeMethod obj1=new PracticeMethod();
        obj1.multiplicationOfTwoNumbers();
    }
}
