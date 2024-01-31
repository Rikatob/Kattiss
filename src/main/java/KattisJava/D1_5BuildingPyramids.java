package KattisJava;

import java.util.Scanner;

public class D1_5BuildingPyramids {

    public static void main(String[] args) {
        int availableBlocks;
        int usedBlocks = 0;
        int itterator = 1;
        int layers = 0;
        Scanner scanner = new Scanner(System.in);
        availableBlocks = scanner.nextInt();


        while (true) {
            usedBlocks += Math.pow(itterator, 2);
            if (usedBlocks > availableBlocks) {
                break;
            }
            layers++;
            itterator += 2;
        }

        System.out.println(layers);

    }
}
