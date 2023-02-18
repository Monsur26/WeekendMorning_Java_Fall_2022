package controlflow;

public class UseNestedForLoop {
    public static void main(String[] args) {
        String newString="ABCDEDGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 1; i <=10 ; i++) { //Parent Loop
            for (int j = 0; j <=newString.length()-1 ; j++) { //Child Loop
                System.out.println(" For Value of  i = "+i+" , Values of  j = "+ newString.charAt(j));
            }
        }

        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        for (int i = 0; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        System.out.println("********************************");

        for (int i = 1; i <= 10; i++)
        { for (int j = 1; j <= 10; j++)
        { System.out.print(i * j + " ");
        }
            System.out.println();
        }

    }
}
