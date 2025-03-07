// Lab06avst.java
// This is the student starting file of Lab06a.

public class Lab06avst
{
   public static void main (String[] args)
   {
      System.out.println("Lab06av100 by Kyle Pitcock");
      int size = 10;
      School bhs = new School(size);
      bhs.addData();
      System.out.println(bhs);
     
      
}
}

class School
{
   private Student[] students;
   private int size;

   
   public School (int s)
   {
    size = s;
    students = new Student[size];  
   

   }
   
   public void addData()
   {
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
        
   public String toString()
   {
    
    String temp = "";
    
    for (int index = 1; index < 10; index++) {
             temp += students[index];
             
           }
      return temp;
      }
   }

     
     
			

