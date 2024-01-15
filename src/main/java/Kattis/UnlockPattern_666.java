package Kattis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UnlockPattern_666 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertical = 1;
        double diagonal = 1.41421356235;
        int size = 3;

        List<List<Integer>> display = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            display.add(new ArrayList<>());
        }

        int inputCount = 0;
        while (inputCount < 3) {
            String temp = sc.nextLine();
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(0))));
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(2))));
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(4))));
            inputCount++;
        }

        // System.out.println(display);
        double length = 0;
        int xValue = -1;
        int yValue = -1;
        boolean firstFound = false;
        for (int currNumber = 1; currNumber < 10; currNumber++) {

            yFor:
            for (int y = 0; y < 3; y++) {
                xFor:
                for (int x = 0; x < 3; x++) {
                    if (display.get(y).get(x) == currNumber) {
                        // Set x,y Values first time.
                        if (!firstFound) {
                            yValue = y;
                            xValue = x;
                            firstFound = true;
                            break yFor;
                        } else {
                            // If on same y axes.
                            if (y == yValue) {
                                if (x == xValue + 1 || x == xValue - 1) {
                                    length += 1;
                                } else {
                                    length += 2;
                                }
                                // if on same x axes.
                            } else if (x == xValue) {
                                if (y == yValue + 1 || y == yValue - 1) {
                                    length += vertical;
                                } else {
                                    length += (vertical * 2);
                                }

                            } else if (y == yValue + 1 || y == yValue - 1) {
                                //Single diagonal.
                                if (x == xValue + 1 || x == xValue - 1) {
                                    length += diagonal;
                                    // L-shape (longside horizontal)
                                } else if (x == xValue + 2 || x == xValue - 2) {
                                    length += Math.sqrt(5);
                                }

                            } else if (y == yValue + 2 || y == yValue - 2) {
                                //Double diagonal.
                                if (x == xValue + 2 || x == xValue - 2) {
                                    length += (diagonal * 2);
                                    // L-shape (longside vertical)
                                } else if (x == xValue + 1 || x == xValue - 1) {
                                    length += Math.sqrt(5);
                                }
                            }/* else if (y == yValue + 1 && x == xValue - 2 || y == yValue + 1 && x == xValue + 2 || y == yValue - 1 && x == xValue - 2 || y == yValue - 1 && x == xValue + 2) {
                                length += vertical;
                            }*/
                            yValue = y;
                            xValue = x;
                        }

                    }
                }
            }
        }
        System.out.println(length);
    }
}