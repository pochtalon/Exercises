import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int x = in.nextInt();
        System.out.println("Input second number");
        int y = in.nextInt();
        System.out.println("Input third number");
        int z = in.nextInt();
        int lx = x % 10;
        int ly = y % 10;
        int lz = z % 10;
        if (lx == ly || lx == lz || ly == lz){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
