import java.util.Scanner;
public class WhitePawn {
    static Scanner keyboard = new Scanner(System.in);
    public static boolean legalMove(String FinalInfo,String Piece,String chessPiece,int row1, int row2, int col1,int col2,
                                    String[][] ChessBoard) {
        boolean legal = false;
        if (col2 == col1) {
            if (row1 == 6 && row2 == 4) {
                for (int i = 4; i < 6; i++) {
                    if (!Move.clearPath(ChessBoard, i, col1)) {
                        return false;
                    }
                }
                Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                playGame.AllCounter++;
                return true;
            }
            if (row2 == row1 - 1 && row2 >= 0) {
                if (!Move.clearPath(ChessBoard, row2, col2)) { //Check if destination is empty
                    System.out.println("THERE IS ANOTHER PIECE WHERE YOU ARE TRYING TO MOVE YOUR PAWN");
                    return false;
                } else {
                    Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    if (row2 == 0) {
                        Move.promotePawn(row2, col2, ChessBoard);
                    }
                    playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                    playGame.AllCounter++;
                    System.out.println();
                    return true;
                }
            }
        }
        if ((col2 == col1 + 1 || col2 == col1 - 1) && row2 == row1 - 1 && row2 >= 0) {
            if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                System.out.println("INVALID MOVE");
                System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE YOUR PAWN");
                return false;
            } else {
                if (row2 == 0) {
                    if (WHITE.canWeCapture(ChessBoard, row2, col2)) { // if we can capture, we capture and promote pawn
                        playGame.WhiteCaptures += FinalInfo;
                        System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");
                        Move.promotePawn(row2, col2, ChessBoard);
                        playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                        playGame.AllCounter++;
                    } else {
                        Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        Move.promotePawn(row2, col2, ChessBoard);
                    }

                }
                if (WHITE.canWeCapture(ChessBoard, row2, col2)) { // if we can capture, we capture
                    Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    playGame.WhiteCaptures += FinalInfo;
                    System.out.println("White PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");
                    playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                    playGame.AllCounter++;
                }
                return true;
            }
        }
        return legal;
    }}




