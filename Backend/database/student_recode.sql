create database student_recode;
create table students(
StID int not null,
coursID int not null,
depID int not null,
stName varchar(100)
);
describe students;
alter table students
drop column coursID;
alter table students
add courseID int primary key;
create table course(
courseID int not null,
courseName varchar(100),
TID int not null,
depID int not null,
primary key (courseID, TID, depID)
);
 alter table students
 add foreign key (courseID) references course(courseID) on delete restrict on update cascade;
  select * from information_schema.referential_constraints where constraint_schema = "student_recode";
