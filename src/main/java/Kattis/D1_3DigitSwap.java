package Kattis;

import java.util.Scanner;

public class D1_3DigitSwap {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String result = "";
        String number = s.nextLine();

        if (number.length() == 2) {
            result += number.charAt(1);
            result += number.charAt(0);
        }

        System.out.println(result);
        s.close();
    }
}
