package Kattis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UnlockPattern_666 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;

        List<List<Integer>> display = new ArrayList<List<Integer>>(size);

        for (int i = 0; i < size; i++) {
            display.add(new ArrayList<Integer>());
        }

        int inputCount = 0;
        while (inputCount < 3) {
            String temp = sc.nextLine();
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(0))));
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(2))));
            display.get(inputCount).add(Integer.parseInt(String.valueOf(temp.charAt(4))));
            inputCount++;
        }

        Array[][] start= new Array[1][1];



        System.out.println(display);

  /*      double length = 0;

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> third = new ArrayList<>();
        ArrayList<ArrayList<Integer>> display = new ArrayList<>();

        first.add(6);
        first.add(5);
        first.add(4);

        second.add(1);
        second.add(2);
        second.add(3);

        third.add(9);
        third.add(8);
        third.add(7);

        display.add(first);
        display.add(second);
        display.add(third);

        int one;
        int two;
        int three;

        HashMap<Integer, Integer> index = new HashMap<>();
        List<Integer> oneIndex = new ArrayList<>();
        List<Integer> twoIndex = new ArrayList<>();
        List<Integer> threeIndex = new ArrayList<>();


        int jalla = 0;
        while (jalla <3) {

            one = sc.nextInt();
            two = sc.nextInt();
            three = sc.nextInt();

            for (int i = 0; i < display.size(); i++) {

                int sizeY = display.get(i).size();
                for (int j = 0; j < sizeY; j++) {

                    if (one == display.get(i).get(j)) {
                        oneIndex.add(display.get(i).indexOf(j));
                        oneIndex.add(i);

                    } else if (two == display.get(i).get(j)) {
                        twoIndex.add(display.get(i).indexOf(j));
                        twoIndex.add(i);

                    } else if (three == display.get(i).get(j)) {
                        threeIndex.add(display.get(i).indexOf(j));
                        threeIndex.add(i);
                    }
                }
            }

            if (oneIndex.get(0).equals(twoIndex.get(0)) && !oneIndex.get(1).equals(twoIndex.get(1))) {
                length += 1;
            } else {
                length += 1.41421356235;
            }

            if (twoIndex.get(0).equals(threeIndex.get(0)) && !twoIndex.get(1).equals(threeIndex.get(1))) {
                length += 1;
            } else {
                length += 1.41421356235;
            }
            jalla ++;
        }

        System.out.println(length);

    }*/
    }
}