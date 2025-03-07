// Lab06bvst.java
// This the Student Starting file for Lab06b.

public class Lab06bvst
{
   public static void main (String[] args)
   {
      System.out.println("Lab06bv100 by Suzie Snodgrass");
      int size = 10;
      School bhs = new School(size);
      bhs.addData();
      
    //   System.out.println(bhs);
//       bhs.bubbleSort1();      // Sorts by name (Only for 100-Point version)
      System.out.println(bhs);
      bhs.bubbleSort2();      // Sorts by gpa 
      System.out.println(bhs);
     //   bhs.bubbleSort3();     // Sorts by age (Only for 100-Point version)
//       System.out.println(bhs);
   }     
}

class School
{
   private Student[] students;
   private int size;
   
   // Already completed for Lab06a
   public School (int s) {
   size = s;
    students = new Student[size];  
   }
   
   
   // Already completed for Lab06a
   public void addData() {
         int[] ages = {21,34,18,45,27,19,30,38,40,35};
      double[] gpas = {1.685,3.875,2.5,4.0,2.975,3.225,3.65,2.0,3.999,2.125};
      String[] names = {"Tom","Ann","Bob","Jan","Joe","Sue","Jay","Meg","Art","Deb"};
      int selection = 0;
       for (int k = 0;k<10;k++)
       {
          
          
          Student student1 = new Student (names[k],ages[k],gpas[k]);
          
          students[k] = student1;
       
    }
    } 
   
   // Sorts by name (For 100-Point version only )
   public void bubbleSort1() { /* To Be Completed */ }
   
   // Sorts by gpa 
   public void bubbleSort2() {
   
   for (int p = 1; p < students.length; p++){
      for (int q = 0; q < students.length-p; q++) {
         if (students[q].getGPA() > students[q+1].getGPA()) {
            Student 
            temp = students[q];
            students[q] = students[q+1];
            students[q+1] = temp;
            }
         }
         
      }   
   }
   
   // Sorts by age (For 100-Point version only)
   public void bubbleSort3() { /* To Be Completed */ }
   
   // Already completed for Lab06a    
   public String toString() 
   { 
      String temp = "";
    
    for (int index = 1; index < 10; index++) {
             temp += students[index];
             
           }
      return temp;
      }
       
   
}
      
			

