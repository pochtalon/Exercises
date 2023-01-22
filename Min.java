import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Min {


        public static void main(String[] args) {
            System.out.println(Arrays.toString(map("2001:xcv:dfvdasdv:asdfgv:asdfg:dsfgds:adfg")));
        }

        public static String @NotNull [] map(String ipv6){
            StringTokenizer qwerty = new StringTokenizer(ipv6, ":");
            String[] a = new String[qwerty.countTokens()];
            System.out.println(qwerty.countTokens());
            for (int i = 0; i < a.length; i++){
                a[i] = qwerty.nextToken();
                System.out.println(a[i]);
            }
            return a;
        }




}
