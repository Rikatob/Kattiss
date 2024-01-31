package KattisJava;

import java.util.Scanner;

public class D2_9Different {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            long n1 = Long.parseLong(sc.next());
            long n2 = Long.parseLong(sc.next());

                System.out.println( Math.abs(n1-n2));

        }
    }
}
