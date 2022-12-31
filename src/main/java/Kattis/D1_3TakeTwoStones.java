package Kattis;

import java.util.Scanner;

public class D1_3TakeTwoStones {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int number = myscan.nextInt();

        if(number % 2 == 0){
            System.out.println("Bob");
        } else if(number % 2 == 1){
            System.out.println("Alice");
        }
    }
}
