package Kattis;

import java.util.Scanner;

public class D1_3SortTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b){
            System.out.print(b);
            System.out.print(" ");
            System.out.print(a);

        } else {
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
        }
    }

}
