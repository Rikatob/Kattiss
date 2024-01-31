package KattisJava;

import java.util.Scanner;

public class D1_3Tarifa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mb = s.nextInt();
        int numberOfMonths = s.nextInt();
        int usedMb = 0;

        for (int i = 0; i < numberOfMonths; i++) {
            usedMb += s.nextInt();
        }

        System.out.println((mb*(numberOfMonths+1))-usedMb);
    }
}
