-- creat database whis it name is Librarydb;
Create database Librarydb;
show databases;
create table BOOKS(
DocID int primary key not null auto_increment,
Title varchar(255) not null Unique,
Publisher varchar(255),
Year int
);
describe BOOKS;
create table STUDENTS(
StID int not null primary key auto_increment,
Stname varchar(100) not null,
Major varchar(100)
);
describe STUDENTS;
create table AUTHORS(
AName varchar(255) primary key not null,
Address varchar(255)
);
describe AUTHORS;
create table borrows(
DocID int not null,
StID int not null,
DDate date not null,
primary key (DocID, StID, DDate)
);
describe borrows;
create table has_written(
DocID int not null ,
AName varchar(255) not null,
primary key (DocID, Aname)
);
describe has_written;
create table describes(
DocID int not null ,
Keyword varchar(255) default "computer",
primary key (DocID)
);
select * from information_schema.columns where table_schema = 'librarydb';
describe books;
describe students;
alter table students modify stname varchar(255);
describe students;
alter table students
add Age int ;
describe students;
describe authors;
describe borrows;
alter table borrows 
 alter ddate set default (curdate());
 describe borrows;
 describe describes;
 alter table describes 
 drop primary key;
 alter table describes
 add primary key(Docid, Keyword);
 describe has_written;
 alter table has_written 
 add foreign key (DocID) references BOOKS(DocID) on delete restrict on update cascade,
 add foreign key (AName) references AUTHORS(AName) on delete restrict on update cascade;
 describe has_written;
  alter table bo
 add foreign key (DocID) references BOOKS(DocID) on delete restrict on update cascade,
 add foreign key (StID) references students(StID) on delete restrict on update cascade;
  alter table describes
 add foreign key (DocID) references BOOKS(DocID) on delete restrict on update cascade;
   alter table books
 add check (year>1000 and year<9999) ;
 select * from information_schema.columns where table_schema = 'librarydb';
  select * from information_schema.referential_constraints where constraint_schema = "librarydb";
   select * from information_schema.columns where table_schema = 'librarydb';
 

