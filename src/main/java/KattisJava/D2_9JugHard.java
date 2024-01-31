package KattisJava;

import java.util.Scanner;

public class D2_9JugHard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amountOfTasks = sc.nextInt();

        for (int i = 0; i < amountOfTasks; i++) {
            int jug1 = sc.nextInt();

            int jug2 = sc.nextInt();

            int goal = sc.nextInt();


            if (jug1 == jug2 && jug1 > goal) {
                System.out.println("False");

            } else if (goal % 2 != 0 && jug1 % 2 == 0 && jug2 % 2 == 0) {
                System.out.println("False");

            } else if (goal % 2 == 0 && jug1 % 2 != 0 && jug2 % 2 != 0) {
                System.out.println("True");
            }

           /* if (goal % 2 == 0 && jug1 % 2 == 0 && jug2 % 2 != 0 || jug1 % 2 == 0 && jug2 % 2 != 0 && goal % 2 != 0) {

            }*/
        }


    }
}
