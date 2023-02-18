CREATE DATABASE QLCnhahang

use QLCnhahang

CREATE TABLE ACCOUNT (
	Username nvarchar(255)  PRIMARY KEY,
	Password nvarchar(255),
	Role varchar(255)
);

CREATE TABLE Restaurant (
	restaurantId nvarchar(25) PRIMARY KEY,
	name nvarchar(255),
	phoneNumber int,
	tNTT int,
	tNTN int
);


DROP TABLE NHAHANG;

DROP TABLE ACCOUNT;

INSERT INTO ACCOUNT VALUES ('ninhhai123','vanhai456','admin');

INSERT INTO Restaurant VALUES('12','NINHHAI',3451681,12,12);

select * from Restaurant;

ALTER TABLE Restaurant AFTER COLUMN restaurantId varchar(25);

DROP TABLE Restaurant;

