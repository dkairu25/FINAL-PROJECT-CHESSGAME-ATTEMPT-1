public class WhiteKnight {
    public static boolean legalMove(String FinalInfo,String Piece, String chessPiece,
                                    int row1, int row2, int col1, int col2, String[][]ChessBoard){
        boolean legal=false;

        if((row2==row1+1 &&(col2==col1+2|| col2==col1-2) )||(row2==row1-1 && (col2==col1+2|| col2==col1-2))||
                (col2==col1+1 &&(row2==row1+2||row2==row1-2))||(col2==col1-1 &&(row2==row1+2||row2==row1-2))) {
            //no need to check clear path as we can jump over squares
            if(Move.ownPiece(chessPiece,ChessBoard,row2,col2)){
                System.out.println("INVALID MOVE");
                System.out.println("PLAYER 1 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE YOUR KING");
                return false;
            }else {
                //now check if you can capture your opponent pieces
                if (WHITE.canWeCapture(ChessBoard, row2, col2)) {
                    Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    playGame.WhiteCaptures += FinalInfo;
                    System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");

                } else {
                    Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //if we cant capture we just move the piece
                    System.out.println();
                }
                return true;
            }
        }
        return legal;

    }}
