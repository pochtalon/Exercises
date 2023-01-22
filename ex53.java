import java.util.Scanner;
public class ex53 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int x = in.nextInt();
        System.out.println("Input second number");
        int y = in.nextInt();
        System.out.println("Input third number");
        int z = in.nextInt();
        if (x+y==z){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
