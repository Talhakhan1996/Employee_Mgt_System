/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class Data {
 Connection con=null;
 Statement st=null;
 ResultSet rst=null;
 public Connection db_Conn()
 {
     try 
     {
        con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; database=employe_management; user=sa; password=123; ");
        
     } catch (Exception e) 
     {
         System.out.println(e);
     }
     return con;
 }
 
    public int Enter(String EmployeeId, String EmployeeName, String Employee_time_in, String Employee_time_Out )
    {int add=0;
        try {
            con=db_Conn();
            st=con.createStatement();
            add=st.executeUpdate("insert into Employe_attendence values('"+EmployeeId+"', '"+ EmployeeName+"', '"+Employee_time_in+"','"+Employee_time_Out+"','True')");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return add;
    }
 
 
 
 
 
 
 
 
 
 public ResultSet Login()
 {
     try {
         con=db_Conn();
         st=con.createStatement();
         rst=st.executeQuery("Select * from Login_page");
         
     } 
     catch (Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
 
 return rst;
 }
 
    public int Submit(String Employee_First_Name, String Employee_LastName, String Employee_Address, String nicno, String Employee_Gender, String Employee_Password, String Employee_Age, String Employee_Date_of_birth, String Employee_join_on, String Employee_salary, String Designation, String Employee_Email_Id, String Employee_Contact_no)
    {int add=0;
        try {
            con=db_Conn();
            st=con.createStatement();
            add=st.executeUpdate("insert into New_employee_Registration values('"+Employee_First_Name+"', '"+ Employee_LastName+"', '"+Employee_Address+"','"+nicno+"', '"+Employee_Gender+"', '"+Employee_Password+"', '"+Employee_Age+"','"+Employee_Date_of_birth+"', '"+Employee_join_on+"', '"+Employee_salary+"','"+Designation+"' ,'"+Employee_Email_Id+"', '"+Employee_Contact_no+"','True')");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return add;
    }
       
    public int updateRecords(String Employee_ID, String Employee_Name, String Employee_lastname, String Employee_Address, String Employee_salary,  String Employee_Designation )
    {int update=0;
        try {
            con=db_Conn();
            st=con.createStatement();
            update=st.executeUpdate("update New_employee_Registration set Employee_First_Name='"+ Employee_Name+"',Employee_LastName= '"+Employee_lastname+"',Employee_Address='"+Employee_Address+"',Employee_salary='"+ Employee_salary+"',Employee_Designation= '"+Employee_Designation+"' where emp_ID='"+Integer.parseInt(Employee_ID)+"'");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return update;
    }
    
        
    public int DisableRecords( String empID )
    {int Disable=0;
        try {
            con=db_Conn();
            st=con.createStatement();
            Disable=st.executeUpdate(" update  New_employee_Registration set emp_status='False' where emp_ID='"+Integer.parseInt(empID)+"'");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return Disable;
    }
    public ResultSet getEmployees()
    {
        
        try
        {
            con=db_Conn();
            st=con.createStatement();
            rst=st.executeQuery("select n.emp_ID, n.Employee_First_Name,n.Employee_LastName,n.Employee_Address,n.Employee_salary,n.Employee_Designation from New_employee_Registration n where emp_status='True'");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    return rst;
    }
}
