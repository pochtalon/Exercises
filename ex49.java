import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ex49 {
    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            integers.add(scanner.nextInt());
        }
        int max = 0;
        Collections.sort(integers);
        max = integers.get(integers.size() - 1);
        System.out.println(max);

    }
}
