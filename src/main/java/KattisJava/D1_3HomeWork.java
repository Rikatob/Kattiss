package KattisJava;

import java.util.Scanner;

public class D1_3HomeWork {

    public static void main(String[] args) {

        Scanner mysc = new Scanner(System.in);
        int tasks = 0;
        while (mysc.hasNext()) {

            int number1 = mysc.nextInt();
            String current = mysc.next();

            if (current.equals("-")) {
                int temp = mysc.nextInt() - number1 + 1;
                tasks += temp;
            } else if (current.equals(";")) {
                tasks += 1;
            }
        }
        System.out.println(tasks);
    }
}
