package KattisJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        String l = myscan.nextLine();
        ArrayList<String> shortList = new ArrayList<>(Arrays.asList(l.split("-")));
        for(String s : shortList){
            System.out.print(s.charAt(0));
        }
    }
}
