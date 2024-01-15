package Kattis;

import java.util.Scanner;

// https://open.kattis.com/problems/easiest
public class D1_6TheEasiestProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            int n = Integer.parseInt(userInput);
            int sumN = 0;
            int p = 11;

            if (n == 0) {
                break;
            }
            for (int i = 0; i < userInput.length(); i++) {
                sumN += Integer.parseInt(String.valueOf(userInput.charAt(i)));
            }

            while (true) {
                String multi = String.valueOf(p * n);
                int sumMulti = 0;
                for (int i = 0; i < multi.length(); i++) {
                    sumMulti += Integer.parseInt(String.valueOf(multi.charAt(i)));
                }

                if (sumMulti == sumN) {
                    System.out.println(p);
                    break;
                } else {
                    p++;
                }
            }
        }

    }


}
