package constructor;

public class LearnConstructor {
    int age;
    String nameOFPerson;
    double height;

    public LearnConstructor(String nameOFPerson, int age){
        this.age=age;
        this.nameOFPerson=nameOFPerson;

        System.out.println("The Name of the person is :"+this.nameOFPerson + " The Age of the person is:  "+this.age);

    }

    public LearnConstructor(){
        System.out.println("Welcome to Introduction of yourself");
    }
    public LearnConstructor(int age){

    }
    public  LearnConstructor(double height){

    }


    public static void main(String[] args) {
        LearnConstructor welcomeMessage= new LearnConstructor();
        LearnConstructor inputNameAndAge=new LearnConstructor("Monsur",67);
        LearnConstructor inputNameAndAge2=new LearnConstructor("Ameen",200);
        new LearnConstructor("John Doe",23);

    }

}
