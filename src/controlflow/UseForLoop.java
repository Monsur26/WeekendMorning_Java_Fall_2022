package controlflow;

public class UseForLoop {
    public static void main(String[] args) {

        // increment
        for (int i = 0; i <=3; i++) {
            System.out.println("The number is : "+i);
        }
        System.out.println(" *********************************** ");
        //decrement
        for (int i = 3; i >=0 ; i--) {
            System.out.println("Number is : "+ i);
        }

        String testString="This Class is fun";
        int lengthofString=testString.length();
        int index=lengthofString-1;

        for (int i = 3; i <=index ; i++) {
           System.out.println("The character at index" + i +" is : "+ testString.charAt(i));
        }
    }
}
