public class WHITE {
    public static boolean isValidMove(String FinalInfo,String Piece, String chessPiece, int row1, int row2, int col1, int col2,
                                      String[][]ChessBoard){
        boolean valid=false;

        if(chessPiece.equals("WHITE KING  " )){
            if(WhiteKing.legalMove(FinalInfo,Piece, chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
        else if(chessPiece.equals("WHITE QUEEN " )){
            if(WhiteQueen.legalMove(FinalInfo,Piece, chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
       else if(chessPiece.equals("WHITE ROOK  " )){
            if(WhiteRook.legalMove(FinalInfo,Piece, chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
        else if(chessPiece.equals("WHITE BISHOP" )){
            if(WhiteBishop.legalMove(FinalInfo,Piece, chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
        else if(chessPiece.equals("WHITE KNIGHT" )){
            if(WhiteKnight.legalMove(FinalInfo,Piece, chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
        else if(chessPiece.equals("WHITE PAWN  " )){
            if(WhitePawn.legalMove(FinalInfo,Piece,chessPiece,row1,row2,col1,col2,ChessBoard)){
                valid=true;
            }
        }
        else {
           return false;

        }
        return valid;
    }
    public static boolean canWeCapture(String[][] ChessBoard, int row2, int col2){
        boolean possible=false;
        if( ChessBoard[row2][col2].equals("BLACK PAWN  ") ||
                ChessBoard[row2][col2].equals("BLACK KING  ") ||
                ChessBoard[row2][col2].equals("BLACK QUEEN ") ||
                ChessBoard[row2][col2].equals("BLACK ROOK  ") ||
                ChessBoard[row2][col2].equals("BLACK BISHOP") ||
                ChessBoard[row2][col2].equals("BLACK KNIGHT")) {
            return true;
        }

        return possible;
    }
    public static boolean CheckOnWhitePlayer(){
        boolean check=false;

        return check;
    }
    public static boolean CheckMateWhitePlayer(String[][]ChessBoard){
        boolean checkMate=true;
        for(int i=0; i<ChessBoard.length; i++){
            for(int j=0; j<ChessBoard.length; j++){
                if(ChessBoard[i][j].equals("WHITE KING  ")){
                    return false;
                }
            }
        }


        return checkMate;
    }
}
