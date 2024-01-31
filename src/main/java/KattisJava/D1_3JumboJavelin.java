package KattisJava;

import java.util.Scanner;

public class D1_3JumboJavelin {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int numberOfRods = myscan.nextInt();
        int length = 0;

        for(int i = 0; i<numberOfRods;i++){
            length += myscan.nextInt();

        }

        System.out.println(length-numberOfRods+1);
    }
}
