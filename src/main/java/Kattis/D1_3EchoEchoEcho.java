package Kattis;

import java.util.Scanner;

public class D1_3EchoEchoEcho {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String pattern = "[a-zA-Z]{1,15}";
        String word = myscan.next(pattern);
        for(int i = 0; i<3;i++){
            System.out.print(word + " ");

        }
    }
}
