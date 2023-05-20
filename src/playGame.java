import java.util.Scanner;
public class playGame {
    static Scanner keyboard=new Scanner(System.in);
    static int AllCounter=0;                             //useful in entering inputs to # SaveBoardEntry
                                                         //increments every time we move a piece
    static String[][]SaveBoardEntry=new String[1][1000];    //stores anything found in the final position,
                                                           // to avoid losing information when we move a piece
                                                           //in case we want to reverse a move
                                                           //created in 2D so to be printed by print2D method

    static String WhiteCaptures="";
    static String BlackCaptures="";
    public static void PlayChessGame(){
        System.out.println("RULES");
        System.out.println("PLAYER 1 is WHITE and PLAYER 2 BLACK");
        System.out.println("This is SPECIAL CHESS where you play like you would normally play chess");
        System.out.println("except you are not allowed to make the special moves Castling and EnPassant, ironic for the name ");
        System.out.println("If you want to move a piece you type where its from like '2a' or '2A', you will be promted");
        System.out.println("And type where you want to move it eg '4a' or 4A ");
        System.out.println("For example moving 2a to 4a moves BLACK PAWN two steps");
        System.out.println("To capture an opponent  piece move your piece to where the opponent piece is");
        System.out.println("Call check on your own , checkmate happens when the King is Captured ");
        System.out.println("ENJOY THE GAME");
        System.out.println();
        String[][] ChessBoard= Board.makeBoard(); // create board
        WhitePlay(ChessBoard);
    }
    public static void WhitePlay(String[][]ChessBoard){
        ChessGame.print2D(ChessBoard);
        System.out.println();

        System.out.print("PLAYER 1, WHAT WHITE PIECE DO YOU WANT TO MOVE?");
        String wPiece = keyboard.nextLine();
        System.out.print("WHERE DO YOU WANT TO MOVE IT?");
        String wDestination = keyboard.nextLine();
        System.out.println();

        int wRow1 = ChessGame.getRow(wPiece);
        int wRow2 = ChessGame.getRow(wDestination);
        int wCol1 = ChessGame.getColumn(wPiece);
        int wCol2 = ChessGame.getColumn(wDestination);

        String wChessPiece = String.valueOf(ChessBoard[wRow1][wCol1]);
        String wFinalInfo=String.valueOf(ChessBoard[wRow2][wCol2]); //store so as not to lose the information

            if ((WHITE.isValidMove(wFinalInfo,wPiece,wChessPiece, wRow1, //this moves the piece too
                         wRow2, wCol1, wCol2,ChessBoard))) {

                    if(BLACK.CheckMateBlackPlayer(ChessBoard)){ //check if move results to checkmate
                        System.out.println("GAME OVER");
                        System.out.println("PLAYER 1 WINS");
                        System.out.print("DO YOU WANT TO PLAY ANOTHER GAME ? Type YES or NO");
                        String answer= keyboard.nextLine();
                    if(answer.equals("YES")){
                        PlayChessGame();
                    }else{
                        System.out.println("GOOD LUCK");
                    }
                    }else{
                        BlackPlay(ChessBoard);
                    }
                    }else { //if it's not a valid move make them try again
                    System.out.println("INVALID MOVE");
                    WhitePlay(ChessBoard);
                    }
               }


        //Ask second player to make move
    public static void BlackPlay(String[][] ChessBoard){
        ChessGame.print2D(ChessBoard);
        System.out.println();

        System.out.print("PLAYER 2, WHAT BLACK PIECE DO YOU WANT TO MOVE?");
        String bPiece = keyboard.nextLine();
        System.out.print("WHERE DO YOU WANT TO MOVE IT?");
        String bDestination = keyboard.nextLine();
        System.out.println();

        int bRow1=ChessGame.getRow(bPiece);
        int bRow2 = ChessGame.getRow(bDestination);
        int bCol1=ChessGame.getColumn(bPiece);
        int bCol2 = ChessGame.getColumn(bDestination);

        String bChessPiece = String.valueOf(ChessBoard[bRow1][bCol1]);
        String bFinalInfo=String.valueOf(ChessBoard[bRow2 ][bCol2]);

        if (BLACK.isValidMove(bFinalInfo,bPiece,bChessPiece, bRow1, bRow2,
                    bCol1, bCol2, ChessBoard)) {
            if(WHITE.CheckMateWhitePlayer(ChessBoard)){  // after black moves check if white player is on checkmate
                    System.out.println(" PLAYER 2 WINS ");
                    System.out.println();
                    System.out.println("GAME OVER");
                    System.out.println();
                    System.out.print("DO YOU WANT TO PLAY ANOTHER GAME ? Type YES or NO");
                    String answer= keyboard.nextLine();
                    if(answer.equals("YES")){
                        PlayChessGame();
                    }else{
                        System.out.println("GOOD LUCK");
                    }
                }else{
                System.out.println();
                WhitePlay(ChessBoard);
                }
            }else {
            System.out.println("INVALID MOVE");
                BlackPlay(ChessBoard);
            }}
}

