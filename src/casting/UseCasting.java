package casting;

public class UseCasting {
    public static void main(String[] args) {
        int x=5; //Smaller Data Type
        long y=x; //Larger data type

        //Implicit Casting happens when smaller data type is stored in a larger data type

        System.out.println(y);

        double d= 50.0;
        int a=(int) d; //Explicit Casting Converting larger data type into smaller data type

        System.out.println(a);
    }
}
