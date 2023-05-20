public class WhiteQueen {
    public static boolean legalMove(String FinalInfo,String Piece,
                                    String chessPiece,int row1, int row2,
                                    int col1,  int col2, String[][]ChessBoard){
        boolean legal=false;
               if(WhiteRook.legalMove(FinalInfo, Piece,  chessPiece, row1,  row2,  col1,   col2, ChessBoard)||
                WhiteBishop.legalMove(FinalInfo, Piece,  chessPiece, row1,  row2,  col1,   col2, ChessBoard)){
            return true;
        }
               return legal;
    }
}

