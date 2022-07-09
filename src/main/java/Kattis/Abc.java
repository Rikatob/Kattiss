package Kattis;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        String numbers;
        int comp;

        numbers = input.nextLine();
        String[] numbersArray = numbers.split(" ");

        a = Integer.parseInt(numbersArray[0]);
        comp = Integer.parseInt(numbersArray[1]);

        if (comp > a) {
            b = comp;
        } else {
            b = a;
            a = comp;
        }

        comp = Integer.parseInt(numbersArray[2]);

        if (comp > b) {
            c = comp;

        } else if (comp < b && comp > a) {
            c = b;
            b = comp;

        } else {
            c = b;
            b = a;
            a = comp;
        }

        String order = input.nextLine();
        String[] orderArray = order.split("");

        for (int i = 0; i < orderArray.length; i++) {

            switch (orderArray[i]) {
                case "A":
                    orderArray[i] = Integer.toString(a);
                    break;
                case "B":
                    orderArray[i] = Integer.toString(b);
                    break;
                case "C":
                    orderArray[i] = Integer.toString(c);
                    break;
            }

        }
        System.out.println(orderArray[0] + " " + orderArray[1] + " " + orderArray[2]);
    }
}
