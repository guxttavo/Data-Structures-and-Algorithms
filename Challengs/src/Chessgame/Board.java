package Chessgame;

public class Board {

    private char[][] grid = new char[8][8];

    public Board() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                grid[row][col] = '.';
            }
        }
        grid[0][0] = 'r'; // a8
        grid[0][1] = 'n'; // b8
        grid[0][2] = 'b'; // c8
        grid[0][3] = 'q'; // d8
        grid[0][4] = 'k'; // e8
        grid[0][5] = 'b'; // f8
        grid[0][6] = 'n'; // g8
        grid[0][7] = 'r'; // h8

        for (int col = 0; col < 8; col++) {
            grid[1][col] = 'p';
        }

        grid[7][0] = 'R'; // a1
        grid[7][1] = 'N'; // b1
        grid[7][2] = 'B'; // c1
        grid[7][3] = 'Q'; // d1
        grid[7][4] = 'K'; // e1
        grid[7][5] = 'B'; // f1
        grid[7][6] = 'N'; // g1
        grid[7][7] = 'R'; // h1

        for (int col = 0; col < 8; col++) {
            grid[6][col] = 'P'; // linha de peões brancos
        }
    }

    public void printBoard() {
        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " ");
            for (int col = 0; col < 8; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }

    public void move(int fromRow, int fromCol, int toRow, int toCol) {
        char piece = grid[fromRow][fromCol];

        if (piece == '.') {
            System.out.println("Invalid move");
            return;
        }

        grid[fromRow][fromCol] = piece;
        grid[fromRow][fromCol] = '.'; // esvazia a casa antiga
    }
}

