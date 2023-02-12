package arraysUse;

public class TwoDimArray {
    public static void main(String[] args) {
        // Declaration of 2D Array
        int a[][]={{1,2,3},
                {4,5,6},
                {7,8,9}
        };



        int b[][]=new int[3][4];

        b[0][0]=76;
        b[0][1]=2;
        b[0][2]=46;
        b[0][3]=74;
        b[1][0]=7556;
        b[1][1]=4546;
        b[1][2]=7454;
        b[1][3]=6566;
        b[2][0]=744;
        b[2][1]=7344;
        b[2][2]=73454;
        b[2][3]=7345345;

        System.out.println("Printing numbeer 8 from array a : "+ a[2][1]);

    }
}
