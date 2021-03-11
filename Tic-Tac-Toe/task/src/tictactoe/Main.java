package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        char[] celldata = new char[9];
        for (int i = 0; i < 9; i++) {
            celldata[i] = '_';
        }
        boolean finished = false;
        int player = 0; //first player 0, second 1

        printGameField(celldata);
        while(!finished) {
            int x = 0;
            int y = 0;
            boolean check = false;
            while (!check) {
                System.out.print("Enter the coordinates: ");
                String coords = data.nextLine();
                x = Character.getNumericValue(coords.charAt(0));
                y = Character.getNumericValue(coords.charAt(2));
                check = checkNumbers(celldata, x, y);
            }
            setPiece(celldata, x, y, player);
            printGameField(celldata);
            if(getGameState(celldata).equals("X wins")) {
                finished = true;
                System.out.println("X wins");
            } else if (getGameState(celldata).equals("O wins")) {
                finished = true;
                System.out.println("O Wins");
            } else if (getGameState(celldata).equals("Draw")) {
                finished = true;
                System.out.println("Draw");
            }
            if (player == 0) {
                player = 1;
            } else {
                player = 0;
            }
        }
    }

    private static boolean checkNumbers(char[] celldata, int x, int y) {
            if ((x >= 1 && x <= 3) && (y >= 1 && y <= 3)) {
                if (x == 1 && y == 1 && (celldata[0] == 'X' || celldata[0] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 1 && y == 2 && (celldata[1] == 'X' || celldata[1] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 1 && y == 3 && (celldata[2] == 'X' || celldata[2] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 2 && y == 1 && (celldata[3] == 'X' || celldata[3] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 2 && y == 2 && (celldata[4] == 'X' || celldata[4] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 2 && y == 3 && (celldata[5] == 'X' || celldata[5] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 3 && y == 1 && (celldata[6] == 'X' || celldata[6] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 3 && y == 2 && (celldata[7] == 'X' || celldata[7] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (x == 3 && y == 3 && (celldata[8] == 'X' || celldata[8] == 'O')) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    return true;
                }
            } else {
                if (x > 3 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    System.out.println("You should enter numbers!");
                }
                return false;
            }
        return false;
    }

    private static void setPiece(char[] cells, int x, int y, int player) {
        if (x == 1 && y == 1) {
            if (player == 0) {
                cells[0] = 'X';
            } else {
                cells[0] = 'O';
            }
        } else if (x == 1 && y == 2) {
            if (player == 0) {
                cells[1] = 'X';
            } else {
                cells[1] = 'O';
            }
        } else if (x == 1 && y == 3) {
            if (player == 0) {
                cells[2] = 'X';
            } else {
                cells[2] = 'O';
            }
        } else if (x == 2 && y == 1) {
            if (player == 0) {
                cells[3] = 'X';
            } else {
                cells[3] = 'O';
            }
        } else if (x == 2 && y == 2) {
            if (player == 0) {
                cells[4] = 'X';
            } else {
                cells[4] = 'O';
            }
        } else if (x == 2 && y == 3) {
            if (player == 0) {
                cells[5] = 'X';
            } else {
                cells[5] = 'O';
            }
        } else if (x == 3 && y == 1) {
            if (player == 0) {
                cells[6] = 'X';
            } else {
                cells[6] = 'O';
            }
        } else if (x == 3 && y == 2) {
            if (player == 0) {
                cells[7] = 'X';
            } else {
                cells[7] = 'O';
            }
        } else if (x == 3 && y == 3) {
            if (player == 0) {
                cells[8] = 'X';
            } else {
                cells[8] = 'O';
            }
        }
    }

    public static void printGameField(char[] cells){
        System.out.print ("---------\n");
        System.out.format("| %c %c %c |\n" +
                          "| %c %c %c |\n" +
                          "| %c %c %c |\n" +
                          "---------\n", cells[0], cells[1], cells[2],
                cells[3], cells[4], cells[5], cells[6], cells[7], cells[8]);
    }
    public static String getGameState(char[] cells){
        boolean xWins = false;
        boolean oWins = false;
        //count x and o
        int count = 0;
        int countx = 0;
        int counto = 0;
        int counte = 9;
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == 'X') {
                countx++;
            } else if (cells[i] == 'O') {
                counto++;
            } else {
                counte--;
            }
        }
        //X or O - Senkrecht/Diagonal
        if ((cells[0] + cells[3] + cells[6] == 237) || (cells[1] + cells[4] + cells[7] == 237) || (cells[2] + cells[5] + cells[8]) == 237 || (cells[0] + cells[4] + cells[8] == 237) || (cells[2] + cells[4] + cells[6] == 237)) {
            oWins = true;
        }if ((cells[0] + cells[3] + cells[6] == 264) || (cells[1] + cells[4] + cells[7] == 264) || (cells[2] + cells[5] + cells[8]) == 264 || (cells[0] + cells[4] + cells[8] == 264) || (cells[2] + cells[4] + cells[6] == 264)) {
            xWins = true;
        }
        // X or 0 - Waagerecht
        if ((cells[0] + cells[1] + cells[2] == 237) || (cells[3] + cells[4] + cells[5] == 237) || (cells[6] + cells[7] + cells[8]) == 237) {
            oWins = true;
        }if ((cells[0] + cells[1] + cells[2] == 264) || (cells[3] + cells[4] + cells[5] == 264) || (cells[6] + cells[7] + cells[8]) == 264) {
            xWins = true;
        }

        //Draw/Impossible/Not finished
        if (countx - counto >1 || counto - countx > 1) {
            return "Impossible";
        } else if (oWins && xWins) {
            return "Impossible";
        } else if (oWins || xWins) {
            if (oWins) {
                return "O wins";
            } else {
                return "X wins";
            }
        } else if (counte != 9) {
            return "Game not finished";
        } else {
            return "Draw";
        }
    }
}
