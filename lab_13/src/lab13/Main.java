package lab13;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [][] area = {{"-","-","-"}, {"-","-","-"}, {"-","-","-"}};

        test(area);

        while(true){
                player1(area,input);
                test(area);
            if(checkWin(area, "X")){
                System.out.println("Player 1 wins");
                break;
            } else{
                System.out.println("unfinished");
            }

            player2(area,input);
            test(area);
            if(checkWin(area, "O")){
                System.out.println("Player 2 wins");
                break;
            } else{
                System.out.println("unfinished");
            }

            if(boardFull(area)){
                System.out.println("Draw");
                break;
            }
        }



    }
    public static void player1(String[][] area, Scanner input){
        boolean validInput = false;
        while(!validInput) {
            System.out.print("Player 1: ");
            int firstPosition = input.nextInt();
            int secondPosition = input.nextInt();
            if ((firstPosition < 3 && firstPosition > -1) && (secondPosition > -1 && secondPosition < 3)) {
                if (area[firstPosition][secondPosition].equals("-")) {
                    area[firstPosition][secondPosition] = "X";
                    validInput = true;
                }
                else{
                    System.out.println("invalid Input");
                }
            } else {
                player1(area, input);
            }
        }
    }
    public static void player2(String[][] area, Scanner input){
        boolean validInput = false;
        while(!validInput) {
            System.out.print("Player 2: ");
            int firstPosition = input.nextInt();
            int secondPosition = input.nextInt();

            if ((firstPosition < 3 && firstPosition > -1) && (secondPosition > -1 && secondPosition < 3)) {
                if (area[firstPosition][secondPosition].equals("-")) {
                    area[firstPosition][secondPosition] = "O";
                    validInput = true;
                } else{
                    System.out.println("invalid input");
                }
            } else {
                player2(area, input);
            }
        }
    }
    public static void test(String[][] area) {

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j] + " ");
                if (j == 2) {
                    System.out.println();
                }
            }
        }
    }
    public static boolean checkWin(String[][] area, String player) {
        for (int i = 0; i < 3; i++) {
            if (area[i][0].equals(player) && area[i][1].equals(player) && area[i][2].equals(player)) {
                return true;
            }
            else if(area[0][i].equals(player) && area[1][i].equals(player) && area[2][i].equals(player)){
                return true;
            }
        }
        if (area[0][0].equals(player) && area[1][1].equals(player) && area[2][2].equals(player)){
            return true;
        }
        if (area[0][2].equals(player) && area[1][1].equals(player) && area[2][0].equals(player)){
            return true;
        }
        return false;
    }
    public static boolean boardFull(String[][] area){
        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area.length; j++){
                if(area[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;

    }
}