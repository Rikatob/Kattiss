package Kattis;

import java.util.Scanner;

public class D1_3StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println(i+1 + " Abracadabra");
        }
    }
}
