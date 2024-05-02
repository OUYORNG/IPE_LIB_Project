create database librarydb2;
create table students(
StID int not null,
StName varchar(100) not null,
AcaYear int not null,
Dep varchar(100) not null,
primary key(StID)
);
describe students;
create table LibraryRecode(
StID int not null,
RecodeNum int not null
);
alter table LibraryRecode
 alter ddate set default (curdate());
 drop table  libaryRecode;
 alter table LibraryRecode
 add ddate date not null;
 describe LibraryRecode;
  alter table LibraryRecode
 add primary key (StID, RecodeNum);
 alter table students
 add foreign key(StID) references libraryRecode(StID) on update cascade on delete restrict;
 select * from information_schema.referential_constraints where constraint_schema = "librarydb2";
 select * from information_schema.referential_foreign where foreign_schema = "librarydb2";
select * from information_schema.columns where table_schema = 'librarydb2';