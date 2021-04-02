CREATE DATABASE employe_management 
create table New_employee_Registration  (

Employee_ID int,

Employee_First_Name varchar(255),
Employee_lastName varchar(255),
Employee_Gender varchar(255),
Employee_Age nvarchar(255),
Employee_Date_of_birth varchar(255),
Employee_join_on varchar(255),
Employee_Designation varchar(255),
Employee_Password varchar(255),
Employee_Salary varchar(255),
Employee_Email_Id varchar(255),
Employee_Contact_no varchar(255),
Employee_Address nvarchar(255),
Employee_NIC_No varchar(255)

);insert into New_employee_Registration values('1','akash','Samuel khokhar','Male','18','29th may 1997','19 feb 2015','computer teacher','123456','199230','akashkhokhar782YAHOO.COM','03443641135','P&TCOLONYBLOCKNUM554','2456-5478624-24578')
insert into New_employee_Registration values('2','talha','khan','Male','19','14th aug 1996','22 feb 2013','faculty head','234567','20000','talhafiaz123@yahoo.com','03102700980','keamari','42401-8025591-3')
insert into New_employee_Registration values('3','ramsha','ansari','female','22','23th mar 1992','13 jul 2008','center manager','345678','50000','ramshaansari@yahoo.com','03434354544','main taalpur road,lucky star,saddar','32342-2343-2322')
insert into New_employee_Registration values('4','chandar','harwani','Male','17','20th may 1999','8 apr 2012','','456789','34500','chandarharwani@gmail.com','03332201180','civil lines clifton','2526-66323-3366')
insert into New_employee_Registration values('5','romish','Samuel khokhar','Male','18','29th may 1997','19 feb 2015','computer teacher','123456','199230','akashkhokhar782YAHOO.COM','03443641135','P&TCOLONYBLOCKNUM554','2456-5478624-24578')
drop table New_employee_Registration