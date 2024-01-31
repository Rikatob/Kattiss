package KattisJava;

import java.util.ArrayList;
import java.util.Scanner;

public class D1_5RacingAroundTheAlphabet {

    public static void main(String[] args) {

        int diam = 60;
        int amountOfTokens = 28;
        double circum = diam * Math.PI;

        double tokenDistance = circum / amountOfTokens;

        // System.out.println(tokenDistance);
        ArrayList<String> alph = new ArrayList<>();
        alph.add("A");
        alph.add("B");
        alph.add("C");
        alph.add("D");
        alph.add("E");
        alph.add("F");
        alph.add("G");
        alph.add("H");
        alph.add("I");
        alph.add("J");
        alph.add("K");
        alph.add("L");
        alph.add("M");
        alph.add("N");
        alph.add("O");
        alph.add("P");
        alph.add("Q");
        alph.add("R");
        alph.add("S");
        alph.add("T");
        alph.add("U");
        alph.add("V");
        alph.add("W");
        alph.add("X");
        alph.add("Y");
        alph.add("Z");
        alph.add(" ");
        alph.add("'");

        Scanner myscan = new Scanner(System.in);
        int amountOfAph = Integer.parseInt(myscan.nextLine());

        for(int j = 0; j<amountOfAph;j++){

            double totalLength = 0;
            String aph = myscan.nextLine();
            // System.out.println(alph.indexOf("W"));

            for (int i = 0; i < aph.length() - 1; i++) {

                char first = aph.charAt(i);
                char second = aph.charAt(i + 1);
                double range = 0;
                // System.out.println(i +" "+ alph.indexOf(String.valueOf(first)));
                // System.out.println(alph.indexOf(" "));

                if (alph.indexOf(String.valueOf(first)) + 1 > 14) {
                    range = Math.abs(((alph.indexOf(first + "") + 1) - (alph.indexOf(second + "") + 1))) * tokenDistance;

                } else {
                    range = Math.abs(((alph.indexOf(second + "") + 1) - (alph.indexOf(first + "") + 1))) * tokenDistance;

                }

                if (range > circum / 2) {

                    if (alph.indexOf(String.valueOf(first)) > 14) {
                        range = ((amountOfTokens - (alph.indexOf(first + "") + 1) + ((alph.indexOf(second + "") + 1)))) * tokenDistance;

                    } else {
                        range = ((amountOfTokens - (alph.indexOf(second + "") + 1) + ((alph.indexOf(first + "") + 1)))) * tokenDistance;

                    }
                }

                totalLength += range;
                // System.out.println("length" + totalLength);
                // System.out.println("range" + range);
            }

            double totalTime = (totalLength / 15) + aph.length();

            System.out.println(totalTime);
        }



    }
}
