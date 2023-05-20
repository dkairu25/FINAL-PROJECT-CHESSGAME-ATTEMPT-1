import java.util.Scanner;
public class ChessGame {

    public static void main(String[]args){
                playGame.PlayChessGame();
                }
     public static String[][] print2D(String[][] a) {
                for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < a[i].length; j++) {
                System.out.print("["+a[i][j]+"]"+" ");
                }
                System.out.println();
                }
                return a;
                }
    public static int getRow(String word){  //assuming user does not pick empty square
                int row=0;
                for(int i=0; i<8;i++){
                if(word.startsWith(String.valueOf(i+1))){
                row=i;
                }
                }
                return row;
                }
    public static int getColumn(String word){
                int col=0;
                String[]File={"a","b","c","d","e","f","g", "h","A","B","C","D","E","F","G","H"};
                for(int i=0; i<8;i++){
                if((word.endsWith(File[i]))||(word.endsWith(File[i+8]))){    //didn't know how to ignore case
                col=i;
                }
                }
                return col;
                }
                public static void reverseMove(){
                    System.out.println("Please create me");

    }

}
