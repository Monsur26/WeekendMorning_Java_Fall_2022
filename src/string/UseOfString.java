package string;

import java.util.Locale;

public class UseOfString {

    public static void main(String[] args) {
        String abc=new String("Value1");
        String def=new String("Value1");
        abc="Value 4";

        StringBuffer sb1= new StringBuffer("Value2");

        String sb3= sb1.toString(); // Converting obj to String
        System.out.println("First Value :"+ sb3);
        sb3="Value 7";

        String firstName="Monsur";
        String lastName="  Ahmed";

        StringBuilder sb2= new StringBuilder(firstName);
        sb2.append(lastName ); // appending a value with the original value


        String name=new String("       Nancy 123     ");
        name.length(); // total number of elements length of the String including spaces
        int index=name.length()-1; // index value starts from 0
        char charat4thIndex=name.charAt(4);

        String breakingName=name.substring(5);
        String breakingName2=name.substring(0,5);
        String breakingName3=name.substring(5,8);
       // name.replace("Nancy", "Monsur");

        System.out.println(abc);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(name.concat(" Pelocy"));
        System.out.println(name.length());
        System.out.println(index);
        System.out.println(charat4thIndex);
        System.out.println(name.equals("nancy 123"));
        System.out.println(name.equalsIgnoreCase("nancy 123"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("N12"));
        System.out.println(name.endsWith("3"));
        System.out.println(breakingName);
        System.out.println(breakingName2);
        System.out.println(breakingName3);
        System.out.println(name.replace("Nancy", "Monsur"));
        System.out.println(name);
        System.out.println(name.trim());





    }
}
