// Lab07vst100.java
// This the Student Starting file for Lab07.
// This file is specifically for the 100-Point version.

import java.util.ArrayList;

public class Lab07vst100
{
   public static void main (String[] args)
   {
      System.out.println("Lab07v100 by Suzy Snodgrass");
      System.out.println();
      int size = 10;
      School bhs = new School(size);
      System.out.println(bhs);
      System.out.println(bhs.linearSearch("Meg"));
      System.out.println(bhs.linearSearch("Sid"));
      System.out.println();
      bhs.selectionSort();
      System.out.println(bhs);
      System.out.println(bhs.binarySearch("Meg"));
      System.out.println(bhs.binarySearch("Sid"));
      System.out.println();
   }     
}

class School
{
   private ArrayList<Student> students;
   private int size;
   
   public School (int s) { /* To Be Completed */ }
   public void addData() { /* To Be Completed */ } 
   public void selectionSort () { /* To Be Completed */ }
   public int linearSearch (String str) { /* To Be Completed */ return 0; }    
   public int binarySearch (String str) { /* To Be Completed */ return 0; }
   public String toString() { /* To Be Completed */ return ""; }
}
      
			

