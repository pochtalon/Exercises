import java.util.Scanner;
public class descreminant {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Write a");
        int a = in.nextInt();
        System.out.println("Write b");
        int b = in.nextInt();
        System.out.println("Write c");
        int c = in.nextInt();

        int D;
        D = b*b-(4*a*c);

        if (D<0){
            System.out.println("No results");
        }
        else {

            System.out.println("D=" + D);

            double x1;
            double x2;

            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println("x1=" + x1 + " x2=" + x2);
        }

    }
}
