package Kattis;

import java.util.HashSet;
import java.util.Scanner;

public class IveBeeenEveryWhere {

    public static void main(String[] args) {
        HashSet<String> distinctCities = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());

        for (int i = 0; i < t; i++) {

            int c = Integer.parseInt(input.nextLine());
            for (int j = 0; j < c; j++) {
                distinctCities.add(input.nextLine());
            }
            System.out.println(distinctCities.size());
            distinctCities.clear();
        }
    }
}
