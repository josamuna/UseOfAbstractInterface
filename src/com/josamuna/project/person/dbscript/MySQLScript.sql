CREATE database db_person;
USE db_person;

CREATE TABLE conjoint
(
	id INTEGER NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    CONSTRAINT pk_conjoint PRIMARY KEY(id)
);
CREATE TABLE person 
(
	id INTEGER NOT NULL,
    id_conjoint INTEGER,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    CONSTRAINT pk_person PRIMARY KEY(id),
    CONSTRAINT fk_conjoint_person FOREIGN KEY(id_conjoint) REFERENCES conjoint(id)
);

CREATE TABLE telephone
(
	id INTEGER NOT NULL,
    id_person INTEGER,
    number VARCHAR(13),
    CONSTRAINT pk_telephone PRIMARY KEY(id),
    CONSTRAINT fk_person_telephone FOREIGN KEY(id_person) REFERENCES person(id)
);

CREATE USER 'josue'@"%" IDENTIFIED BY 'josue';
GRANT ALL PRIVILEGES ON db_person.* TO 'josue'@"%";

INSERT INTO conjoint(id,firstname,lastname) VALUES
(1,'Espoir','Salumu'),(2,'Vanessa','Materanya');

INSERT INTO person(id,id_conjoint,firstname,lastname) VALUES
(1,1,'Natasha','Atolo'),(2,2,'Josué', 'Isamuna'),(3,null,'Espoir', 'Baraka'),
(4,null,'Joel', 'Kasereka'),(5,null,'Sarah', 'Feza'),(6,null,'Sophie', 'Alimasi');

INSERT INTO telephone(id,id_person,number) VALUES
(1,1,'+243998532460'),(2,1,'+243857489703'),(3,2,'+250789140630'),(4,2,'+243816078930'),(5,2,'+243970537879'),(6,3,'+250789654107'),
(7,3,'+243852105698'),(8,4,'+243825678402'),(9,4,'+243974015896'),(10,4,'+243898745016'),(11,4,'+250784013698'),(12,4,'+249858075758');

-- All telephone of a specific person
SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=1;

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=2;

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=3;

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=4;

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=5;

SELECT person.id,person.firstname,person.lastname,telephone.id,telephone.id_person,telephone.number FROM telephone 
RIGHT OUTER JOIN person ON person.id=telephone.id_person
WHERE person.id=6;

-- Conjoint of a specific person
SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=1;

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=2;

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=3;

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=4;

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=5;

SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person
LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint
WHERE person.id=6;