package Kattis;

import java.util.Scanner;

public class D1_3TriangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double h = s.nextInt();
        double w = s.nextInt();

        double area = (h*w)/2;
        System.out.println(area);
    }
}
