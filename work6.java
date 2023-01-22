import java.util.Scanner;
public class work6 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Write a");
        int a = in.nextInt();
        System.out.println("Write b");
        int b = in.nextInt();

        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));
        System.out.println("%" + (a%b));

    }

}
