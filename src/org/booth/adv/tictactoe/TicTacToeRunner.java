package org.booth.adv.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {

    public static void main(String[] args) {
        TicTacToeManager man = new TicTacToeManager();
        Scanner in = new Scanner(System.in);
        while(!man.isGameOver()){
            int posxy = in.nextInt();
            man.play(posxy / 10, posxy % 10);
            System.out.println(man);
        }
    }
}