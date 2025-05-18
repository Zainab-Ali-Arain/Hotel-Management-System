create database hotelms;
create table room (roomnumber varchar(20) primary key , availibility varchar (20) , cleaning_status varchar(20) ,
 price varchar (20) , bed_type varchar(20));
 select * from room ;
 create table employee(name varchar(20) , age int(11) , gender varchar(20) 
 , job varchar(20) , phone varchar(20) , email varchar(20) , cnic varchar(20) primary key  );
 select * from employee;
 
 CREATE TABLE customer (
    document VARCHAR(30), number VARCHAR(30), name VARCHAR(30), gender VARCHAR(30), country VARCHAR(30),
    room VARCHAR(30), checkintime VARCHAR(100), deposit VARCHAR(30));
    
    CREATE TABLE driver (
    name VARCHAR(20),
    age VARCHAR(20),
    gender VARCHAR(20),
    company VARCHAR(20),
    carname VARCHAR(20),
    available VARCHAR(20),
    location VARCHAR(20)
);

CREATE TABLE login (
    username VARCHAR(25) PRIMARY KEY,
    password VARCHAR(25)
);

INSERT INTO login VALUES
('rabia', 'IMADWASIM_09'),
('Arshad ALI', 'java_instructor'),
('marina gul', 'database'),
('komal', 'alijee'),
('isha', '1234');

CREATE TABLE department (
    department VARCHAR(80),
    budget INT
);

INSERT INTO department VALUES
('office', 50000),
('Housekeeping', 40000),
('Food', 80000),
('kitchen', 40000),
('Security', 60000);

CREATE TABLE login2 (
    username VARCHAR(20) primary key,
    password VARCHAR(20)
);

INSERT INTO login2 VALUES
('rabia', 'IMADWASIM_09'),
('isha', '1234'),
('zainab', 'tea'),
('marina', 'dbms');





    
 