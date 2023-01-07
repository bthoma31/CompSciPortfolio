import java.util.Scanner;

public class TicTacToe {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Player 1, what is your name?");
            String p1 = keyboard.nextLine();
            System.out.println("Player 2, what is your name?");
            String p2 = keyboard.nextLine();

            char[][] board = new char[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';

                }
            }
            boolean isPlayer1 = true;
            boolean gameEnded=false;
            while(!gameEnded) {
                drawBoard(board);

                char symbol = ' ';
                if (isPlayer1) {
                    symbol = 'x';
                } else {
                    symbol = 'o';
                }
                if (isPlayer1) {
                    System.out.println(p1 + "'s turn");
                } else {
                    System.out.println(p2 + "'s turn");
                }
                int row = 0;
                int col = 0;
                while (true) {
                    System.out.println("Enter a row (0,1, or 2) :");
                    row = keyboard.nextInt();
                    System.out.println("Enter a col(0,1 0r 2) :");
                    col = keyboard.nextInt();
                    if (row < 0 || col < 0 || row > 2 || col > 2) {
                        System.out.println("The row and columns you inputed are not in play!");
                    } else if (board[row][col] != '-') {
                        System.out.println("This position is already taken!");
                    } else {
                        break;
                    }
                }
                board[row][col] = symbol;
                if (hasWon(board) == 'x') {
                    System.out.println(p1 + " has won");
                    gameEnded=true;
                } else if (hasWon(board) == 'o') {
                    System.out.println(p2 + " has won");
                    gameEnded=true;
                } else {
                    if (hasTied(board)) {
                        System.out.println("its a tie");
                        gameEnded=true;
                    } else{
                        isPlayer1=!isPlayer1;
                    }

                }

            }
        }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();
        }

    }

    public static char hasWon(char[][] board) {
        for (int i = -0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][1];
            }
        }
        for (int j = -0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }
        if (board[0][0]==board[1][1]&& board[1][1]==board[2][2]&& board[0][0]!='-'){
            return board[0][0];
        }
        if(board[2][2]==board[1][1]&&board[1][1]==board[0][2]&&board[1][1]!='-')
        {
            return board[1][1];
        }
        return '-';
    }
    public static boolean hasTied(char[][]board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]=='-'){
                    return false;
                }
            }
    }
        return true;
}
}
