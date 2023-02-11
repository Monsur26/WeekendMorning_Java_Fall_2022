package enumUse;

public class Runner {
    public static void main(String[] args) {
        UseEnum today=UseEnum.SATURDAY;
       // System.out.println("Today is : " + today);

        if(today == UseEnum.SATURDAY){
            System.out.println("This is Saturday");
        } else {
            System.out.println("This is not Saturday");
        }
    }
}
