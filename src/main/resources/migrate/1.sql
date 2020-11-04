DROP TABLE IF EXISTS CupcakeDB.orders;
create table CupcakeDB.orders
(
    orderid   int primary key auto_increment,
    order_cupcake_id int not null,
    customerid int not null,
    orderedtime TIMESTAMP not null,
    pickuptime varchar(50)
);

DROP TABLE IF EXISTS CupcakeDB.orderline;
create table CupcakeDB.orderline
(
    orderlineid   int primary key auto_increment,
    orderid int not null,
    topid int not null,
    botid int not null,
    quantity int not null
);

UPDATE cupcakedb.properties set numberversion = '1' where name = 'version';