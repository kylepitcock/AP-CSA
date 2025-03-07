// Lab08v0.java
// This is the 0-Point Version for Lab08.
// It correctly displays Knight's Tour.
// This is a hard-coded solution for the problem.

import java.text.DecimalFormat;

public class Lab08v0
{ 
   public static void main (String[] args)
   {
      int[][] board =  {{1, 6, 39, 34, 31, 18, 9, 64},
                        {38, 35, 32, 61, 10, 63, 30, 17},
                        {59, 2, 37, 40, 33, 28, 19, 8},
                        {36, 49, 42, 27, 62, 11, 16, 29},
                        {43, 58, 3, 50, 41, 24, 7, 20},
                        {48, 51, 46, 55, 26, 21, 12, 15},
                        {57, 44, 53, 4, 23, 14, 25, 6},
                        {52, 47, 56, 45, 54, 5, 22, 13}};  
      
      showBoard(board);    
   } 
      
   public static void showBoard(int[][] brd)
   {
      DecimalFormat twoDigits = new DecimalFormat("00");
      for (int r = 0; r <=7; r++)
      {
         for (int c = 0; c <= 7; c++)
         {
            System.out.print(twoDigits.format(brd[r][c]) + "  ");
         }
         System.out.println();
      }
      System.out.println();
   }             
}

