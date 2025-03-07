// Lab07vst80.java
// This the Student Starting file for Lab07.
// This file is used with the 80-Point version.

import java.util.ArrayList;

public class Lab07vst80
{
   public static void main (String[] args)
   {
      System.out.println("Lab07v80 by Suzy Snodgrass");
      System.out.println();
      int size = 10;
      School bhs = new School(size);
      System.out.println(bhs);
      bhs.bubbleSort();
      System.out.println(bhs);
      bhs.selectionSort();
      System.out.println(bhs);
      bhs.insertionSort();
      System.out.println(bhs);
   }     
}

class School
{
   private ArrayList<Student> students;
   private int size;
   
   public School (int s) { /* To Be Completed */ }
   public void addData() { /* To Be Completed */ } 
   public void bubbleSort()    { /* To Be Completed */ }
   public void selectionSort() { /* To Be Completed */ }
   public void insertionSort() { /* To Be Completed */ }     
   public String toString() { /* To Be Completed */ return ""; }
}
      
			

