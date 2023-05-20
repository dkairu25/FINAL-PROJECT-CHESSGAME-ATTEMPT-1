public class WhiteRook {
    public static boolean legalMove(String FinalInfo, String Piece, String chessPiece,
                                    int row1, int row2, int col1, int col2,
                                    String[][] ChessBoard) {
        boolean legal = false;

            if (row1 == row2) {       //move along same row
                if (col2 > col1) {  //moving forwards

                    for (int i = col1 + 1; i < col2; i++) {
                        if (!Move.clearPath(ChessBoard, row1, i)) {    //check if there is a clear path to final destination
                            System.out.println("INVALID MOVE");
                            System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                            return false;
                        }}//outside this loop means there is a clear path ,
                    //if path is clear check that what is at our destination is not our own piece
                    if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                        System.out.println("INVALID MOVE");
                        System.out.println("PLAYER 1 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE RIGHT");
                        return false;
                    } else {
                        //its it's not our own piece we try to capture it
                        if (WHITE.canWeCapture(ChessBoard, row2, col2)) {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                            playGame.WhiteCaptures += FinalInfo;
                            System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");
                            System.out.println();

                        } else {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        }
                        return true;
                    }
                }
                if (col2 < col1) {//moving backwards

                    for (int i = col1 - 1; i > col2; i--) {
                        if (!Move.clearPath(ChessBoard, row1, i)) {    //check if there is a clear path to final destination
                            System.out.println("INVALID MOVE");
                            System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                            return false;
                        }}//outside this loop means there is a clear path ,
                    //if path is clear check that what is at our destination is not our own piece
                    if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                        System.out.println("INVALID MOVE");
                        System.out.println("PLAYER 1 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE TO THE LEFT");
                        return false;
                    } else {
                        //its it's not our own piece we try to capture it
                        if (WHITE.canWeCapture(ChessBoard, row2, col2)) {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                            playGame.WhiteCaptures += FinalInfo;
                            System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");

                        } else {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        }
                        return true;
                    }
                }
            }
            if (col2 == col1) {    //moving along same column
                if (row2 > row1) { //moving down

                    for (int i = row1 + 1; i < row2; i++) {
                        if (!Move.clearPath(ChessBoard, i,col1)) {    //check if there is a clear path to final destination
                            System.out.println("INVALID MOVE");
                            System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                            return false;
                        }}//outside this loop means there is a clear path ,
                    //if path is clear check that what is at our destination is not our own piece
                    if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                        System.out.println("INVALID MOVE");
                        System.out.println("PLAYER 1 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE TO THE DOWN");
                        return false;
                    } else {
                        //its it's not our own piece we try to capture it
                        if (WHITE.canWeCapture(ChessBoard, row2, col2)) {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                            System.out.println();
                            playGame.WhiteCaptures += FinalInfo;
                            System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");
                            System.out.println();

                        } else {
                            Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        }
                        return true;
                    }
                }
                if (row2 < row1) {// moving up
                    for (int i = row1 - 1; i > row2; i--) {
                            if (!Move.clearPath(ChessBoard, i, col1)) {    //check if there is a clear path to final destination
                                System.out.println("INVALID MOVE");
                                System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                                return false;
                            }}//outside this loop means there is a clear path ,
                        //if path is clear check that what is at our destination is not our own piece
                        if (Move.ownPiece(chessPiece, ChessBoard, row2, col2)) {
                            System.out.println("INVALID MOVE");
                            System.out.println("PLAYER 1 YOU MAY BE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE UP");
                            return false;
                        } else {
                            //its it's not our own piece we try to capture it
                            if (WHITE.canWeCapture(ChessBoard, row2, col2)) {
                                Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                                System.out.println();
                                playGame.WhiteCaptures += FinalInfo;
                                System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | " + playGame.WhiteCaptures + " | ");
                                System.out.println();

                            } else {
                                Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                            }
                            return true;
                        }
                }
            }

        return legal;
    }


}
