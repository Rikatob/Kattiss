package Kattis;

import java.util.Scanner;

public class D1_2WhichIsGreater {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        int firstInt = myscan.nextInt();
        int secondInt = myscan.nextInt();

            if (firstInt > secondInt) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }


    }
}
