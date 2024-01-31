package KattisJava;

import java.util.Scanner;

// https://open.kattis.com/problems/judgingmoose
public class D1_5JudgingMoose {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int left = scanner.nextInt();
        int right = scanner.nextInt();

        if (left <= 0 && right <= 0 || left > 20 || right > 20) {
            System.out.println("Not a moose");
            return;
        }


        if (right == 0 || left == 0) {
            System.out.println("Odd " + (Math.max(left, right) * 2));

        } else if (left % right == 0 && right % left == 0) {
            System.out.println("Even " + left * 2);
        } else {
            System.out.println("Odd " + (Math.max(left, right) * 2));
        }
    }
}
