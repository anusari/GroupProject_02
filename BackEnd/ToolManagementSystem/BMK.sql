CREATE DATABASE if not exists BMK;

USE BMK ;

CREATE TABLE if not exists users
(
	User_Id VARCHAR(10) NOT NULL PRIMARY KEY,
    Username VARCHAR(50) NOT NULL,
    Password VARCHAR(20),
    FName VARCHAR(50),
    Lname VARCHAR(50),
    NIC VARCHAR(20),
    Position VARCHAR(20),
    Contact VARCHAR(10),
    Pic longblob
);



INSERT INTO users (User_Id, Username, Password, FName, Lname, NIC, Position, Contact, Pic) 
VALUES 
("U001","nishadi@gmail.com","nishadi@123", "Nishadi", "Sansala", "1234356V"," Admin", "0711234567", null),
("U002","manuji@gmail.com","manuji@123", "Nethuli", "Manuji", "1239356V","Manager", "0711254347",null),
("U003","ama@gmail.com","ama@123", "Nilmi", "Ama", "1234306V"," Stock Supervisor", "0711234647",null),
("U004","isuru@gmail.com","isuru@123", "Isuru", "Ganga", "1234856V","Stock keeper", "0711254634",null);



CREATE TABLE if not exists equipments
(
    Equipment_Id VARCHAR(10) NOT NULL PRIMARY KEY,
    Equipment_Name VARCHAR(50) NOT NULL,
    Description VARCHAR(50) NOT NULL,
    Quantity INT(50) NOT NULL,
    Pic longblob
    
);

INSERT INTO equipments
(Equipment_Id, Equipment_Name,Description,Quantity, Pic)
VALUES
("AGM01" , "Angle Grinder Machine - 4 inch"," " , 10,null),
("AGM02" , "Angle Grinder Machine -4.5 inch"," ",15,null),
("AGM03" , "Angle Grinder Machine - 7 inch"," ",5,null),
("BGM01" , "Bench Grinder Machine"," ",2,null),
("BDM01" , "Bench Drill Machine "," ",3,null),
("CHM01" , "Chipping Hammer Machine "," ",10,null),
("CDM01" , "Core Drilling Machine "," ",2,null),
("CDB01" , "Core Drill Bit "," ",6,null);

CREATE TABLE if not exists projects
(
    Project_Id VARCHAR(10) NOT NULL PRIMARY KEY,
    Project_Name VARCHAR(50) NOT NULL,
    Description VARCHAR(50) NOT NULL,
    Supervisor_Name VARCHAR(50) NOT NULL,
    Location VARCHAR(30) NOT NULL
);

INSERT INTO projects
(Project_Id, Project_Name,Description,Supervisor_Name, Location)
VALUES
("P001" , "Ruwanwella Water Treatment Plant "," " , "N.A.Akalanka Jayasooriya ","Ruwanwella"),
("P002" , "Greater Rathnapura Water Supply Project "," " , "Y.A. Kulathunga Senarathne "," Rathnapura"),
("P003" , " Greater Trincomalee Integrated Water Supply Project"," " , "M.S.Sithara Rathnayake ","Kanthale"),
("P004" , " Water Treatment Plant of MAS  "," " , " S.M. Nalaka Perera ","Thulhiriya");


CREATE TABLE if not exists equipment_box
(
    QR_Id VARCHAR(50) NOT NULL PRIMARY KEY,
    Equipment_Details VARCHAR(50) NOT NULL,
    Description VARCHAR(50) NOT NULL,
    Location VARCHAR(30) NOT NULL
    
);

INSERT INTO equipment_box
(QR_Id, Equipment_Details,Description,Location)
VALUES
(" ","fefvfrvrrvrg","fegsgg","fggg");

CREATE TABLE if not exists reports
(
    Report_Id VARCHAR(15) PRIMARY KEY,
    Report_Name VARCHAR(50) NOT NULL,
    Report_Type VARCHAR(50) NOT NULL,
    Report_Details VARCHAR(100) NOT NULL,
    Date Date
);

INSERT INTO reports
(Report_Id, Report_Name, Report_Type, Report_Details,Date)
VALUES
("R001","Damaged Tools","Damage ","ffeggrtgrg","02/02/2024");














