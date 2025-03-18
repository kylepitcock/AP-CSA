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
//      System.out.println(checkVisit(board,1,0));
      for (int k = 2; k <= 64; k++)
      {
         nextMove(board);
      }
      showBoard(board);
   } 
   
        
   // Initializes the 2D board array with 0s and 1 at the top-left.            
   public static void startBoard(int[][] brd)
   {

//      brd = new int[7][7];
      brd[0][0] = moves;

      }
   
   // Displays a matrix of board values using the 2-digit format.
   public static void showBoard(int[][] brd)
   {
      for (int row = 0; row < brd.length;row++) {
         for (int col = 0; col < brd[0].length; col++) {
            System.out.print(brd[row][col]);
         }System.out.println();
      }
   } 
   
   // Used by method nextMove to see if a board location was visited.
   public static boolean checkVisit(int[][] brd, int r, int c)
   {
      int visited = brd[r][c];
      {
         if (visited == 0) {
            return false;
         } else {
            return true;
         }
      }


   } 
   
   // Finds a knight-type move to the next location, if possible.
   public static void nextMove(int[][] brd)
   {

//      int x = brd[0][0];
//      int y = brd[0][0];
      int x = 4;
      int y = 4;
      boolean flag = true;
      int n = 1;
      while (true) {
      System.out.println("hello");
         boolean negHoriposVert = checkVisit(brd, x - 1, y + 2);
         boolean negHoriposVert2 = checkVisit(brd, x - 2, y + 1);
         boolean negHorinegVert = checkVisit(brd, x - 1, y - 2);
         boolean negHorinegVert2 = checkVisit(brd, x - 2, y - 1);
         boolean posHoriposVert = checkVisit(brd, x + 1, y + 2);
         boolean posHoriposVert2 = checkVisit(brd, x + 2, y - 1);
         boolean posHorinegVert = checkVisit(brd, x + 1, y - 2);
         boolean posHorinegVert2 = checkVisit(brd, x + 2, y - 1);
         {
         if (negHoriposVert == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
            System.out.println("stuck here");
         } else if (negHoriposVert2 == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (negHorinegVert == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (negHorinegVert2 == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (posHoriposVert == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (posHoriposVert2 == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (posHorinegVert == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else if (posHorinegVert2 == false) {
            x -= 1;
            y += 2;
            n++;
            brd[x][y] = n;
         } else {
            System.out.println("didnt work");
            flag = true;
         }
      }








      }

   }     

         
}

