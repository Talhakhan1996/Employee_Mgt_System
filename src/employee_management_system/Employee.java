/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;

/**
 *
 * @author Afzal computers
 */
public class Employee {
int empID;
String empName;
public Employee(int ID,String name)
{
this.empID=ID;
this.empName=name;
}
public int getID()
{
return this.empID;
}
public String getName()
{
return this.empName;
}
@Override
public String toString()
{
return this.empName;
}
}
