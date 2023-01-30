

class HelloWorld {


    // Syntax: Class keyword followed by className adn curly braces

    public static void main(String[] args){

        //Primitive Data in Java
        char practiceChar='A';
        byte byteName=100;
        short shortName=1000;
        int intName=90000;
        long longName=366666;
        float floatName= 6;
        double doubleName=78;
        boolean YesorNo= true;
        String name="Monsur ";
        String secondName="Monsur";

        // Syntax: Variable type variableName= value(s) ;

        System.out.println(practiceChar);
        System.out.println(byteName);
        System.out.println(shortName);
        System.out.println(intName);
        System.out.println(longName);
        System.out.println(floatName);
        System.out.println(doubleName);
        System.out.println(YesorNo);
        System.out.println(practiceChar+byteName+shortName+intName+longName+floatName+doubleName);
        System.out.println(practiceChar+" ,"+byteName+" , "+shortName);

        intName=8700;
        System.out.println(intName);


        String myName="My name is Monsur Ahmed";
        String myAddress="  105 Ave";
        System.out.println(myName+myAddress);


        int myPrimeNumber=7;
        System.out.println("This is a prime number : "+myPrimeNumber + " This is a beautiful Number");

        b=87;


    }

    //Local Variable
    // A varibale inside any block of code ie methods or functions

    //Instance Variable is a variable within the class
    int a=90;
    static int b=65;
    String name="My Name";

    public void run(){
        a=80;
        b=89;
    }
}



