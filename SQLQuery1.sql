create database University


create table Teacher(
  	tID int NOT NULL,
	name varchar(50),
	lastName varchar(50),
	sex varchar(50),
	subject varchar(50),
 	PRIMARY KEY (tID)
  
);
create table Pupil(
  	pID int NOT NULL,
	name varchar(50),
	lastName varchar(50),
	sex varchar(50),
	class int,
 	PRIMARY KEY (pID)
  
);


create table class(
  pID int NOT NULL,
  tID int NOT NULL,
  foreign key (pID) references Pupil(pID) ON UPDATE CASCADE,
  foreign key (tID) references Teacher(tID) ON UPDATE CASCADE
 );
 
insert into Teacher VALUES(1,'Daviti','Morgoshia','mamrobiti', 'Matimatika')
insert into Teacher VALUES(2,'Levan','Pavliashivli','mamrobiti', 'Matimatika')
insert into Teacher VALUES(3,'Nana','Katsia','mdedrobiti', 'manqanis martva')
insert into pupil Values(1,'Luka', 'Dolidze','mamrobiti',1)
insert into pupil Values(2,'giorgi', 'mamardashvili','mamrobiti',2)
insert into pupil Values(3,'Zaal', 'Chkheidze','mamrobiti',3)
insert into pupil Values(4,'gulnari', 'ckhvitia','mdedrobiti',2)
insert into pupil Values(5,'sergos', 'bebia','mamrobiti',2)
insert into pupil Values(6, N'გიორგი', 'Dolidzeski','mamrobiti',1)

insert into class Values(1,1);
insert into class Values(2,2);
insert into class Values(3,3);
insert into class Values(4,2);
insert into class Values(5,2);
insert into class Values(6,1);

select * from teacher where tID in (select tID from class where pID in (select pID from Pupil where name = N'გიორგი'))
