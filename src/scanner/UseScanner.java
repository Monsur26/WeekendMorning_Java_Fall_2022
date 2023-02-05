package scanner;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
/*      String firstName="Monsur";
        String lasttName="Ahmed";
        System.out.println("The name is "+ firstName + " "+ lasttName );*/

        Scanner scanner = new Scanner(System.in);   // Syntax for creating the scanner object
        System.out.println(" Please Enter your First Name");
        String firstName = scanner.nextLine(); // takes String input from user

        System.out.println("Please Enter you last name");
        String lastName = scanner.nextLine();

        System.out.println("Please Enter your age");
        int age = scanner.nextInt(); //takes int input from user

        System.out.println("Please Enter your hourly salary");
        double hourlySalary = scanner.nextDouble(); //takes a Double input from user

        System.out.println("Name of the user :" + firstName + " " + lastName);
        System.out.println("Age of the user : " + age);
        System.out.println("Salary of the user : " + hourlySalary);
    }
}
