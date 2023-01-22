import java.util.Scanner;
public class ex56 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int x = in.nextInt();
        System.out.println("Input second number");
        int y = in.nextInt();
        System.out.println("Input /");
        int z = in.nextInt();
        int j = 0;
        for (int i = x; i<=y; i++){
           if (i % z == 0) {
               j++;
           }
        }
        System.out.println(j);

    }
}
