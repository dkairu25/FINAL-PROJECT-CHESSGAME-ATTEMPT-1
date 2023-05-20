public class Board {
    public static String[][] makeBoard(){
        String[][] board = new String[8][8];
        String[]File={"a", "b", "c", "d", "e", "f", "g", "h"};
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col]="     "+(row+1)+File[col]+"     ";

            }
        }
        for (int i = 0; i < 8; i++) {
            board[1][i] = "BLACK PAWN  ";
            board[6][i] = "WHITE PAWN  ";

        }
        board[0][0] = "BLACK ROOK  ";
        board[0][7] = "BLACK ROOK  ";
        board[7][0] = "WHITE ROOK  ";
        board[7][7] = "WHITE ROOK  ";

        board[0][1] = "BLACK KNIGHT";
        board[0][6] = "BLACK KNIGHT";
        board[7][1] = "WHITE KNIGHT";
        board[7][6] = "WHITE KNIGHT";

        board[0][2] = "BLACK BISHOP";
        board[0][5] = "BLACK BISHOP";
        board[7][2] = "WHITE BISHOP";
        board[7][5] = "WHITE BISHOP";

        board[0][3] = "BLACK QUEEN ";
        board[0][4] = "BLACK KING  ";
        board[7][3] = "WHITE QUEEN ";
        board[7][4] = "WHITE KING  ";

        return board;

    }
}
