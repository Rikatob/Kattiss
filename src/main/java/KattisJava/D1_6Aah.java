package KattisJava;

import java.util.Scanner;

public class D1_6Aah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jon = input.nextLine();
        String doctor = input.nextLine();

        if (jon.length() >= doctor.length()) {
            System.out.println("go");

        } else {
            System.out.println("no");
        }
    }
}
