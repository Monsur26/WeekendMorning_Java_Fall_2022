package randomfunction;

import java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
        Random random=new Random();

        int x=random.nextInt();
        int y=random.nextInt(10);
        double a=random.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);

        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuffer sb= new StringBuffer();

        for (int i = 0; i <10 ; i++) {
            int index=random.nextInt(str.length());
            char character=str.charAt(index);
            sb.append(character);
        }
        System.out.println(sb);
    }
}
