CREATE DATABASE employe_management 
create table Login_page(


Employe_Email_ID int,
Employe_Password nvarchar(255),



); 
create table Employe_diable (
Employe_ID int,
Employe_Name varchar(255),






 );
 create table Admin_table(

Admin_Id int,

Admin_Email nvarchar(255) ,

Admin_Name varchar(255),
 

Admin_Last_Name varchar (255),

Admin_Gender varchar (255)

);

create table Employe_data_table(

Employe_Id int,

Employe_Name nvarchar(255) ,

Employe_last_Name varchar (255),

Employe_Gender varchar(255),

Employe_Age nvarchar (255),

Employe_Email_Id varchar(255),

Employe_Designation varchar (255),

Employe_Salary varchar(255),

Employe_Joined_Date varchar (255),

Employe_Contact_no  varchar(255),

Employe_Birth_Of_Date  varchar(255),



);

create table Employe_attendance(
EmployeeId int primary key,
EmployeeName nvarchar(255),
DateofDay datetime,
PresentAbsent bit,
);

create table emp_Details(
EmployeeId int primary key,
EmployeeCode nvarchar(20),
EmployeeName nvarchar(50),

);

EmployeeId int,
DateofDay datetime,
PresentAbsent bit,

SalaryDetails
SalaryDetailsId
EmployeeId int foreign key references EmployeeMaster Employee Id
Salary float



);