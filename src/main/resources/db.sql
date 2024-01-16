CREATE DATABASE PRODUCTS;

CREATE TABLE PRODUCT(
    id integer primary key not null AUTO_INCREMENT,
    name varchar(50),
    description varchar(100),
    product_size varchar(20),
    prix varchar(50),
    type varchar(20),
    stock_quantity integer
);


