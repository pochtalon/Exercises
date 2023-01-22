import java.util.Scanner;
public class ex44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number <10");
        int a = in.nextInt();

        if (a<10){
        System.out.printf("%d + %d%d + %d%d%d", a, a, a, a, a, a);}
        else {
            System.out.println("I said <10");
        }
    }
}
