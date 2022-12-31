package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class D2_0BlackFriday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int participants;
        String dizeOutcome;
        //int winner = -1;

        participants = Integer.parseInt(scanner.nextLine());
        //int[] participantsArray = new int[participants];

        dizeOutcome = scanner.nextLine();
        int[] dizeArray = Arrays.stream(dizeOutcome.split(" ")).mapToInt(Integer::parseInt).toArray();




    }
}
