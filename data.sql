DROP TABLE ORDERS IF EXISTS;
CREATE TABLE ORDERS
(
    id int(10) not null,
    order_name varchar(100),
    price DECIMAL(7,2),
    customer_id int(10) not null,
    card_id int(10)
);

insert into ORDERS(id,order_name,price,customer_id,card_id) values 
(1,'Mobile',10000,1, 1),
(2,'Laptop',50000,2, 2),
(3,'Books',5000,1, 1),
(4,'Cloths',3000,3, 3);