package controlflow;

public class UseIfElse {
    public static void main(String[] args) {
        double temp=35.99;

        if(temp <=30){
            System.out.println("Outside temp is very Cold");
        } else {
            System.out.println("Temp is not very cold");
        }

      checkifAdult(17);
        UseIfElse obj1=new UseIfElse();
        obj1.nameCheck("Monsur");
    }

    public static void checkifAdult(int age){

        if(age <18){
            System.out.println("Person is not adult");
        } else {
            System.out.println("Person is adult");
        }

    }

    public String nameCheck(String name){

        if (name.equalsIgnoreCase("Monsur")) {
            System.out.println("It is the same name");
        } else {
            System.out.println("It is a different name");
        }
        return  name;
    }

}
