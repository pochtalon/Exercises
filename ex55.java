import java.util.Scanner;
public class ex55 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input seconds");
        int sec = in.nextInt();
        int x = sec/3600;
        int y = (sec-(x*3600))/60;
        int z = sec % 60;
        System.out.println(x + ":" + y + ":" + z);
    }
}
