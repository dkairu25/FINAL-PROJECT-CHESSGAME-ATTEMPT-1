public class BlackRook {
    public static boolean legalMove(String FinalInfo, String Piece, String chessPiece, int row1, int row2, int col1,
                                                                                  int col2, String[][] ChessBoard) {
        boolean legal = false;
                    if (row1 == row2) {       //move along same row
                        if (col2 > col1) {  //moving to the right

                            for (int i = col1 + 1; i < col2; i++) {
                                if (!Move.clearPath(ChessBoard, row1, i)) {    //check if there is a clear path to final destination
                                    System.out.println("INVALID MOVE");
                                    System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                                    return false;
                                }
                            }//outside this loop means there is a clear path ,
                            //if path is clear check that what is at our destination is not our own piece
                            if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                                System.out.println("INVALID MOVE");
                                System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE TO THE RIGHT");
                                return false;
                            } else {
                                //now we check if it's something we can capture
                                if (BLACK.canWeCapture(ChessBoard, row2, col2)) {
                                    Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //move piece to where captured piece is
                                    playGame.BlackCaptures += FinalInfo;
                                    System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.BlackCaptures + " | ");
                                } else {
                                    //if there is nothing to capture we just move the piece
                                    Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //if we cant capture we just move the piece
                                }
                                return true;
                            }
                        }
                        if (col2 < col1) {//moving to the left
                            for (int i = col1 - 1; i > col2; i--) {
                                if (!Move.clearPath(ChessBoard, row1, i)) {
                                    System.out.println("INVALID MOVE");
                                    System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                                    return false;
                                }
                            }
                            if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                                System.out.println("INVALID MOVE");
                                System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE TO THE LEFT");
                                return false;
                            } else {
                                if (BLACK.canWeCapture(ChessBoard, row2, col2)) {
                                    Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //move piece to where captured piece is
                                    System.out.println();
                                    playGame.BlackCaptures += FinalInfo;
                                    System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES  | " + playGame.BlackCaptures + " | ");
                                } else {
                                    Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //if we cant capture we just move the piece
                                    System.out.println();
                                }
                                return true;
                            }}
                    }
            if (col2 == col1) {    //moving along same column
                if (row2 > row1) { //moving down
                    for (int i = row1 + 1; i < row2; i++) {
                        if (!Move.clearPath(ChessBoard, i,col1)) {
                            System.out.println("INVALID MOVE");
                            System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                            return false;
                        }
                    }
                    if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                        System.out.println("INVALID MOVE");
                        System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE DOWN");
                        return false;
                    } else {
                        if (BLACK.canWeCapture(ChessBoard, row2, col2)) {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //move piece to where captured piece is
                            System.out.println();
                            playGame.BlackCaptures += FinalInfo;
                            System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES  | " + playGame.BlackCaptures + " | ");
                        } else {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //if we cant capture we just move the piece
                            System.out.println();
                        }
                        return true;
                    }
                }
                    if (row2 < row1) {// moving up

                        for (int i = row1 - 1; i > row2; i--) {
                            if (!Move.clearPath(ChessBoard, i,col1)) {
                                System.out.println("INVALID MOVE");
                                System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                                return false;
                            }
                        }
                        if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                            System.out.println("INVALID MOVE");
                            System.out.println("PLAYER 2 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE TO THE LEFT");
                            return false;
                        } else {
                            if (BLACK.canWeCapture(ChessBoard, row2, col2)) {
                                Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //move piece to where captured piece is
                                System.out.println();
                                playGame.BlackCaptures += FinalInfo;
                                System.out.println("BLACK PLAYER HAS CAPTURED FOLLOWING PIECES  | " + playGame.BlackCaptures + " | ");

                            } else {
                                Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard); //if we cant capture we just move the piece
                                System.out.println();
                            }
                            return true;
                        }}}
                    return legal;
                }
            }





