package oop.encapsulation;

public class Runner {
    public static void main(String[] args) {
        Students st=new Students();
        st.setName("Sharmin");
        st.setUseid(75312);

        String nameofFirstStudent= st.getName();
        int UserIDofFirstStudent=st.getUseid();

        System.out.println("First Student Detail\nname :"+ nameofFirstStudent + "\nuserID: "+ UserIDofFirstStudent);
    }
}
