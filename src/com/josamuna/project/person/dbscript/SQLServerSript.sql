create database db_person;
go
use db_person;
go

create table conjoint
(
	id integer not null,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    constraint pk_conjoint primary key(id)
)
go
create table person 
(
	id integer not null,
    id_conjoint integer,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    constraint pk_person primary key(id),
    constraint fk_conjoint_person foreign key(id_conjoint) references conjoint(id)
)
go
create table telephone
(
	id integer not null,
    id_person integer,
    number varchar(13),
    constraint pk_telephone primary key(id),
    constraint fk_person_telephone foreign key(id_person) references person(id)
)
go

create login josue with password='josue';
go
create user josue for login josue
go

INSERT INTO conjoint(id,firstname,lastname) VALUES
(1,'Espoir','Salumu'),(2,'Vanessa','Materanya')
go

INSERT INTO person(id,id_conjoint,firstname,lastname) VALUES
(1,1,"Natasha","Atolo"),(2,2,"Josué", "Isamuna"),(3,null,"Espoir", "Baraka"),
(4,null,"Joel", "Kasereka"),(5,null,"Sarah", "Feza"),(6,null,"Sophie", "Alimasi")
go

INSERT INTO telephone(id,id_person,number) VALUES
(1,1,"+24399853246"),(2,1,"+243857489703"),(3,2,"+250789140630"),(4,2,"+243816078930"),(5,2,"+243970537879"),(6,3,"+250789654107"),
(7,3,"+243852105698"),(8,4,"+243825678402"),(9,4,"+243974015896"),(10,4,"+243898745016"),(11,4,"+250784013698"),(12,4,"+249858075758")
go

-- All telephone of a specific person
SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=1
go

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=2
go

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=3
go

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=4
go

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=5
go

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=6
go

-- Conjoint of a specific person
SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=1
go

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=2
go

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=3
go

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=4
go

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=5
go

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=6
go