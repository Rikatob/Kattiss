package KattisJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1_6Mylla {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char winningSign = ' ';

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        List<String> board = List.of(first,second,third);

        /**
         * 0 1 2
         * 0 1 2
         * 0 1 2
         */

        for (int i = 0; i < 3; i++) {

            // Vertical
            if (board.get(0).charAt(i) == board.get(1).charAt(i) && board.get(0).charAt(i) == board.get(2).charAt(i)) {
                winningSign = board.get(0).charAt(i);
                break;
            }
            //Horizontal
            if(board.get(i).charAt(0) == board.get(i).charAt(1) && board.get(i).charAt(0) == board.get(i).charAt(2)){
                winningSign = board.get(i).charAt(0);
                break;
            }
        }


        // Diagonal
        if (first.charAt(0) == second.charAt(1) && first.charAt(0) == third.charAt(2)) {
            winningSign = first.charAt(0);
        }

        if (first.charAt(2) == second.charAt(1) && first.charAt(2) == third.charAt(0)) {
            winningSign = first.charAt(2);
        }



        if(winningSign == 'O'){
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
    }
}
