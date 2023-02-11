package controlflow;

public class NestedIfElse {

    public static void nestedCondition(int num){
        if (num > 0) {
            if (num %2 ==0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Number is Odd Number");
            }

        } else {
            System.out.println("The Number is Zero or a negative Number");
        }
    }

    public static void main(String[] args) {
        nestedCondition(3);
    }
}
