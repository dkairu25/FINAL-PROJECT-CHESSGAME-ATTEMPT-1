import java.util.Scanner;
public class Move {
        static Scanner keyboard=new Scanner(System.in);

public static String[][] movePiece(String FinalInfo,String Piece, String chessPiece, int row1, int row2, int col1, int col2, String[][]ChessBoard){
        ChessBoard[row2][col2]=chessPiece;
        ChessBoard[row1][col1]=Piece+"          ";
        playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo; //to save info in case we want to reverse
        playGame.AllCounter++;
        return ChessBoard;
}
        public static String [][] promotePawn(int row2, int col2, String[][]ChessBoard){
                String promoted="";

                System.out.print("WHAT PIECE DO YOU WANT TO PROMOTE PAWN TO?"  );
                promoted=keyboard.nextLine()+" ";    //Assuming promoted piece is queen, and entered as BLACK KING

                ChessBoard[row2][col2]=promoted;

                return ChessBoard;
        }
        public static boolean ownPiece(String chessPiece, String[][]ChessBoard, int row2, int col2) {
                boolean ours = false;
                if (chessPiece.startsWith("W")) {
                            if (ChessBoard[row2][col2].equals("WHITE PAWN  ") ||
                                ChessBoard[row2][col2].equals("WHITE BISHOP") ||
                                ChessBoard[row2][col2].equals("WHITE KING  ") ||
                                ChessBoard[row2][col2].equals("WHITE QUEEN ") ||
                                ChessBoard[row2][col2].equals("WHITE ROOK  ") ||
                                ChessBoard[row2][col2].equals("WHITE KNIGHT")) {
                                System.out.println("INVALID MOVE");
                                System.out.println("PLAYER 1 YOU ARE TRYING TO CAPTURE YOUR OWN PIECE");
                                return true;
                        }
                }
                if (chessPiece.startsWith("B")) {
                            if (ChessBoard[row2][col2].equals("BLACK PAWN  ") ||
                                ChessBoard[row2][col2].equals("BLACK KING  ") ||
                                ChessBoard[row2][col2].equals("BLACK QUEEN ") ||
                                ChessBoard[row2][col2].equals("BLACK ROOK  ") ||
                                ChessBoard[row2][col2].equals("BLACK BISHOP") ||
                                ChessBoard[row2][col2].equals("BLACK KNIGHT")) {
                                System.out.println("INVALID MOVE");
                                System.out.println("PLAYER 2, YOU ARE TRYING TO CAPTURE YOUR OWN PIECE");
                                return true;
                        }
                }
                return ours;
        }
        public static boolean clearPath(String[][]ChessBoard, int row, int col){
                boolean clear=false;
                         if(!ChessBoard[row][col].equals("BLACK PAWN  ") &&
                             !ChessBoard[row][col].equals("BLACK BISHOP") &&
                             !ChessBoard[row][col].equals("BLACK QUEEN ")&&
                             !ChessBoard[row][col].equals("BLACK KING  ")&&
                             !ChessBoard[row][col].equals("BLACK ROOK  ")&&
                             !ChessBoard[row][col].equals("BLACK KNIGHT")&&
                             !ChessBoard[row][col].equals("WHITE PAWN  ")&&
                             !ChessBoard[row][col].equals("WHITE KING  ")&&
                             !ChessBoard[row][col].equals("WHITE QUEEN ")&&
                             !ChessBoard[row][col].equals("WHITE BISHOP")&&
                             !ChessBoard[row][col].equals("WHITE KNIGHT")){
                        return true;
                }
                return clear;
        }
        public static void EnPassant(){

        }
        public static void Castling(){

        }
}
