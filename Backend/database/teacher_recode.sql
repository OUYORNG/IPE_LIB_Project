create database teacher_recode;
create table teachers(
TID int not null,
teacherName varchar(100),
courseID int not null,
depID int not null,
primary key (TID, courseID, depID)
);
create table student(
StID int not null,
courseID int not null,
depID int not null,
stName varchar(100)
);
create table courses(
courseID int not null,
courseName varchar(100),
TID int not null,
depID int not null,
primary key (courseID, TID, depID)
);
create table department (
depID int not null primary key,
AcaYear int not null,
DepName varchar(100)
);
 alter table teachers
 add foreign key (depID) references department(depID) on delete restrict on update cascade;
  alter table courses
  add foreign key (TID) references teachers(TID) on delete restrict on update cascade;
  select * from information_schema.referential_constraints where constraint_schema = "teacher_recode";
  select * from information_schema.columns where table_schema = 'teacher_recode';
