package departmentpackage;

public class Four {
    public static double avgData(double x,double y, double z)
    {
      double total=x+y+z;
       double average =(total/3);
      System.out.println("The average of three argument =" + average);
       return average;
      }
    public static void main(String[ ] args)
   {
      avgData(20.05,30.45,40.50);
 }
 }