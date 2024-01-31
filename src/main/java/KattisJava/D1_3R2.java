package KattisJava;

import java.util.Scanner;

public class D1_3R2 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int r1 = myscan.nextInt();
        int s = myscan.nextInt();
        int r2 = s*2-r1;
        System.out.println(r2);
    }
}
