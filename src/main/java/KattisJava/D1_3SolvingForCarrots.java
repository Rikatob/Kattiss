package KattisJava;

import java.util.ArrayList;
import java.util.Scanner;

public class D1_3SolvingForCarrots {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contestants = s.nextInt();
        int numberSolved = s.nextInt();

        ArrayList<String> names = new ArrayList<>();

        for(int i = 0; i<contestants;i++){
            names.add(s.next());
        }

        System.out.println(numberSolved);
    }
}
