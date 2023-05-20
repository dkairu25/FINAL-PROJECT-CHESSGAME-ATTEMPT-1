public class WhiteBishop {
    public static boolean legalMove(String FinalInfo, String Piece, String chessPiece,
                                    int row1, int row2, int col1, int col2, String[][] ChessBoard) {
        boolean legal = false;
        int sum=row1+col1; //sum of diagonal entries going up right or down left is same
        int diff=row1-col1;//difference of diagonal entries going down right or up left is same

        if(row2>row1){ //moving down
            if(col2<col1){ //moving down lefT
                for(int i=row1+1; i<row2; i++){
                    if(!Move.clearPath(ChessBoard,i, sum-i)) {
                        System.out.println("INVALID MOVE");
                        System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                        return false;
                    }
                }//if path is clear check what is at our destination is not our own piece
                    if(Move.ownPiece(chessPiece,ChessBoard,row2,col2)) {
                    System.out.println("INVALID MOVE");
                        System.out.println("PLAYER 2 YOU ARE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE DOWN LEFT");
                        return false;
                }else{
                    //now check if you can capture your opponent pieces
                    if(WHITE.canWeCapture(ChessBoard, row2, col2)){
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        playGame.WhiteCaptures+=FinalInfo;
                        System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | "+playGame.WhiteCaptures+" | ");

                    }else{
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    }
                    return true;
                }
            }
            if(col2>col1){ //moving down right
                for(int i=row1+1; i<row2; i++){
                    if(!Move.clearPath(ChessBoard, i,i-diff)){
                        System.out.println("INVALID MOVE");
                        System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                        return false;
                    }
                }//if path is clear check what is at our destination is not our own piece
                    if(Move.ownPiece(chessPiece,ChessBoard,row2,col2)) {
                    System.out.println("INVALID MOVE");
                    System.out.println("PLAYER 2 YOU ARE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE DOWN RIGHT");
                    return false;
                }else{ //now check if you can capture your opponent pieces
                    if(WHITE.canWeCapture(ChessBoard, row2, col2)){
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        playGame.WhiteCaptures+=FinalInfo;
                        System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | "+playGame.WhiteCaptures+" | ");
                        System.out.println();

                    }else{
                        //if there is nothing to capture just move the piece
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    }
                    return true;
                }
            }
        }

        if(row2<row1){ //moving up
            if(col2<col1){ //moving up left
                for(int i=row1-1; i>row2; i--) {
                    if (!Move.clearPath(ChessBoard, i, i - diff)) {
                        System.out.println("INVALID MOVE!");
                        System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                        return false;
                    }
                }//if path is clear check what is at our destination is not our own piece
                if(Move.ownPiece(chessPiece,ChessBoard,row2,col2))  {
                    System.out.println("INVALID MOVE");
                    System.out.println("PLAYER 2 YOU ARE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE UP LEFT");
                    return false;
                }else{
                    //now check if you can capture your opponent pieces
                    if(WHITE.canWeCapture(ChessBoard, row2, col2)){
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        playGame.WhiteCaptures+=FinalInfo;
                        System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | "+playGame.WhiteCaptures+" | ");
                    }
                    else{
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    }
                    return true;
                }
            }

            if(col2>col1){ //moving up right
                for(int i=row1-1; i>row2; i--){
                    if(!Move.clearPath(ChessBoard, i,sum-i )){
                        System.out.println("INVALID MOVE!");
                        System.out.println("YOU CANT MOVE YOUR PIECE THROUGH A PATH THAT HAS ANOTHER PIECE ON IT");
                        return false;
                    }
                }//if path is clear check what is at our destination is not our own piece
                if(Move.ownPiece(chessPiece,ChessBoard,row2,col2))  {
                    System.out.println("INVALID MOVE");
                    System.out.println("PLAYER 2 YOU ARE TRYING TO CAPTURE YOUR OWN PIECE AS YOU MOVE UP RIGHT");

                    return false;
                }else{
                    //now check if you can capture your opponent pieces
                    if(WHITE.canWeCapture(ChessBoard, row2, col2)){
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                        playGame.WhiteCaptures+=FinalInfo;
                        System.out.println("WHITE PLAYER HAS CAPTURED FOLLOWING PIECES | "+playGame.WhiteCaptures+" | ");
                        System.out.println();
                    }else{
                        Move.movePiece(FinalInfo,Piece, chessPiece, row1, row2, col1, col2, ChessBoard);
                    }
                    return true;
                }
            }
        }

        return legal;
    }
}



