// Lab08vst.java
// This the Student Starting file for Lab08.

import java.text.DecimalFormat;

public class Lab08vst
{
   public static int row = 0;
   public static int col = 0;
   public static int moves = 1;
   
   public static void main (String[] args)
   {
      int[][] board = new int[8][8];
      startBoard(board);
      for (int k = 2; k <= 64; k++)
      {
         nextMove(board);
      }
      showBoard(board);
   } 
   
        
   // Initializes the 2D board array with 0s and 1 at the top-left.            
   public static void startBoard(int[][] brd)
   {
      /* To Be Completed */
   }
   
   // Displays a matrix of board values using the 2-digit format.
   public static void showBoard(int[][] brd)
   {
      /* To Be Completed */
   } 
   
   // Used by method nextMove to see if a board location was visited.
   public static boolean checkVisit(int[][] brd, int r, int c)
   {
      /* To Be Completed */ 
      return true;
   } 
   
   // Finds a knight-type move to the next location, if possible.
   public static void nextMove(int[][] brd)
   {
      /* To Be Completed */  
   }     

         
}

