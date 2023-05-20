

public class BlackPawn {

    //method to move pawn
    public static boolean legalMove(String FinalInfo,String Piece,String chessPiece,int row1, int row2,int col1, int col2,
                                    String[][]ChessBoard) {
        boolean legal = false;
        if (col2 == col1) {
            if (row1 == 1 && row2 == 3) {//for white pawn first move allowed to move two squares
                for (int i = 2; i < 4; i++) { //checking next two boxes
                        if (!Move.clearPath(ChessBoard,i,col1)) {
                        return false;
                    }
                }
                Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2,ChessBoard);
                playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                playGame.AllCounter++;
                return true;
            }
            if ((row2 == row1 + 1) && (row2 < 8)) {

                if (!Move.clearPath(ChessBoard,row2,col2)){ //Check if destination is empty
                    System.out.println("THERE IS ANOTHER PIECE WHERE YOU ARE TRYING TO MOVE YOUR PAWN");
                    return false;
                } else { // if destination is empty
                    Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2,ChessBoard);
                    if (row2 == 7) {
                        Move.promotePawn(row2, col2, ChessBoard);
                    }
                    playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                    playGame.AllCounter++;
                    System.out.println();
                    return true;
                }
            }
        }
        if((col2==col1+1 || col2==col1-1) && row2==row1+1&&row2<8){
            if(Move.ownPiece(chessPiece,ChessBoard,row2,col2)){
                System.out.println("INVALID MOVE");
                System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE YOUR PAWN");
                return false;
            }else {
                if (row2 == 7) {
                    if (BLACK.canWeCapture(ChessBoard, row2, col2)) { // if we can capture, we capture and promote pawn
                        playGame.BlackCaptures += FinalInfo;
                        System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.BlackCaptures + " | ");
                        Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        Move.promotePawn(row2, col2, ChessBoard);
                        playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                        playGame.AllCounter++;
                    } else {
                        Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        Move.promotePawn(row2, col2, ChessBoard);
                    }
                }
                if (BLACK.canWeCapture(ChessBoard, row2, col2)) { // if we can capture, we capture
                    Move.movePiece(FinalInfo, Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    playGame.BlackCaptures += FinalInfo;
                    System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.BlackCaptures + " | ");
                    playGame.SaveBoardEntry[0][playGame.AllCounter] = FinalInfo;   //store information destroyed in case we have to reverse move
                    playGame.AllCounter++;
                }
              return true;
            }
        }
        return legal;
    }

}
