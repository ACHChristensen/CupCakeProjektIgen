drop database if exists CupCakeDB;
drop user if exists 'Employee'@'localhost';

create database CupCakeDB;

create user 'Employee'@'localhost';

grant DROP, CREATE, INSERT, SELECT, UPDATE on CupCakeDB.* to 'Employee'@'localhost';

DROP TABLE IF EXISTS CupcakeDB.bottoms;
create table CupCakeDB.toppings
(
    id   int primary key auto_increment,
    flavor varchar(50) not null,
    price double      not null
);
DROP TABLE IF EXISTS CupcakeDB.bottoms;
create table CupcakeDB.bottoms
(
    id   int primary key auto_increment,
    flavor varchar(50) not null,
    price double      not null
);

DROP TABLE IF EXISTS cupcakedb.properties;
create table cupcakedb.properties(
                                     name  VARCHAR(255) PRIMARY KEY,
                                     numberversion VARCHAR(255)
);


