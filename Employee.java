package hw;

public class Employee
{
int empid;
String empName;
int empSalary;
char empDesg;

public void readData()
{
empid=9876;
empName="Dinesh";
empSalary=30000;
empDesg='A';
}
public void printData()
{
System.out.println(empid+ " " + empName+ " " +empSalary+ " " +empDesg);
}
public static void main(String[ ] args)
{
Employee emp;
emp= new Employee ();
emp.readData();
emp.printData();

Employee emp1;
emp1= new Employee ();
emp1.readData();
emp1.printData();

Employee emp2;
emp2= new Employee ();
emp2.readData();
emp2.printData();
}
}
