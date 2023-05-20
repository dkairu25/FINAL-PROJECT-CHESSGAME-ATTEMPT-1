public class BLACK {
    public static boolean isValidMove(String FinalInfo,String Piece, String chessPiece, int row1, int row2, int col1, int col2,
                                      String[][]ChessBoard){
        boolean valid=false;
        if(chessPiece.equals("BLACK KING  " )){
                     if(BlackKing.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else if(chessPiece.equals("BLACK QUEEN " )){
                     if(BlackQueen.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else if(chessPiece.equals("BLACK ROOK  " )){
                     if(BlackRook.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else if(chessPiece.equals("BLACK BISHOP" )){
                     if(BlackBishop.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else if(chessPiece.equals("BLACK KNIGHT" )){
                     if(BlackKnight.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else if(chessPiece.equals("BLACK PAWN  " )){
                     if(BlackPawn.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                     valid=true;
                     }
                     }
        else {
                     return false;


                     }
        return valid;
    }
    public static boolean CheckOnBlackPlayer(){
        boolean check=false;

        return check;
    }
    public static boolean CheckMateBlackPlayer(String[][]ChessBoard){
        boolean checkMate=true;
                for(int i=0; i<ChessBoard.length; i++){
                for(int j=0; j<ChessBoard.length; j++){
                if(ChessBoard[i][j].equals("BLACK KING  ")){
                    return false;
                }
                }
                }
                return checkMate;
    }
    public static boolean canWeCapture(String[][] ChessBoard, int row2, int col2){ //THIS METHOD SHOULD PROBABLY BE IN CLASS BLACK
        boolean possible=false;
            if( ChessBoard[row2][col2].equals("WHITE PAWN  ") ||
                ChessBoard[row2][col2].equals("WHITE KING  ") ||
                ChessBoard[row2][col2].equals("WHITE QUEEN ") ||
                ChessBoard[row2][col2].equals("WHITE ROOK  ") ||
                ChessBoard[row2][col2].equals("WHITE BISHOP") ||
                ChessBoard[row2][col2].equals("WHITE KNIGHT")) {
            return true;
        }
            return possible;
    }
}
