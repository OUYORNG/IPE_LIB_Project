create database Dep_Recode;
drop database deprecode;
create table dep (
depID int not null primary key,
AcaYear int not null
);
 alter table dep
 add depName varchar(100) not null;
alter table dep
add depName varchar(100);
describe dep;
create table course(
courseID int not null,
courseName varchar(100),
TID int not null,
depID int not null,
primary key (courseID, TID, depID)
);
alter table course
drop column depID;
describe course;
create table students(
StID int not null,
coursID int not null,
depID int not null,
stName varchar(100)
);
alter table students
add primary key (StID, coursID, depID);
create table teachers(
TID int not null,
teacherName varchar(100),
coursID int not null,
depID int not null,
primary key (TID, coursID, depID)
);

