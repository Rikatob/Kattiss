package Kattis;

import java.util.Scanner;

public class D1_3OddEcho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        String[] echos = new String[number];

        for (int i = 0; i < number; i++) {
            echos[i] = s.nextLine();

        }
        for (int j = 0; j < echos.length; j++) {
            if ((j+1) % 2 != 0) {
                System.out.println(echos[j]);
            }
        }


    }
}
