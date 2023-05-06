/*- Create an " Employee " class with a constructor that includes the employee's name,
salary, position, and department. The class should have methods for setting and getting
these attributes, as well as a method for giving the employee a raise based on their
position. */

import java.util.jar.Attributes.Name;

class Employee{
    String Name;
    Double Salary;
    String Positon;
    String Department;

    Employee(String n, Double s, String p, String d){
        Name = n;
        Salary = s;
        Positon = p;
        Department = d;
    }
    public String getName(){
        return Name;
    }
    public double getSalary(){
        return Salary;
    }
    public String getPositon(){
        return Positon;
    }
    public String getdepartment(){
        return Department;
    }
    public void setname(String n){
        Name = n;
    }
    public void setSalary(double s){
        Salary = s;
    }
    public void setPositon(String p){
        Positon = p;
    }
    public void setdepartment(String d){
        Department = d;
    }
    public void GiveRaise(){
        if(Positon.equalsIgnoreCase("Manager")){
            Salary *= 1.10;
        }
        else if(Positon.equalsIgnoreCase("Supervisor")){
            Salary *= 1.05;
        }
        else{
            Salary *= 1.02; 
        }
    }
}
public class p1q6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ayushmaan", 100000.0, "manager", "Game Development");
        e1.GiveRaise();
        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Positon: "+e1.getPositon());
        System.out.println("Department: "+e1.getdepartment());
    }
}
