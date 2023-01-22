import java.util.Scanner;
public class work7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number");
        int a = in.nextInt();
        int i;
        for (i = 0; i <= 10; i++){
            System.out.println(a + "x" + i + "=" + a*i);
        }
    }
}