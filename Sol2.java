import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] street = new int[15];
        for(int i = 0; i < 15; i++){
            street[i] = scanner.nextInt();
        }
        int e = 0;
        int o = 0;
        for(int i = 0; i < 15; i++){
            if (i % 2 == 0){
                e = e + street[i];
            }
            if(i % 2 != 0){
                o = o + street[i];
            }
        }
        if(e > o){
            System.out.println("Even");
        }
        if(e < o){
            System.out.println("Odd");
        }
    }
}
