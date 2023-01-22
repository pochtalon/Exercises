import java.util.Scanner;
public class ssef {
    public static void main (String [] args ){
     Scanner in = new Scanner(System.in);
     System.out.println("Write a");
     int a = in.nextInt();
     System.out.println("Write b");
     int b = in.nextInt();

     int c;
     c=a;
     a=b;
     b=c;

     System.out.println("a=" + a + " b=" + b);
    }
}
