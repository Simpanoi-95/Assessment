CREATE DATABASE education;

CREATE TABLE student(
studentid int(11) NOT NULL PRIMARY KEY,
name varchar(250),
course int(11)
);

CREATE TABLE course(
courseid int(11) NOT NULL PRIMARY KEY,
name varchar(250),
institution int(11)
);

CREATE TABLE institution(
institutionid int(11) NOT NULL PRIMARY KEY,
name varchar(250)
);


SELECT * FROM education
ORDER BY  institutionName,courseName,noOfStudents;