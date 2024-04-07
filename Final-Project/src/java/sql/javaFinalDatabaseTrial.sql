
       
/**
* Author:  Wei Deng
*/

-- DROP DATABASE IF EXISTS inventory;
-- CREATE DATABASE inventory;
USE inventory;

drop table if exists Users;

CREATE TABLE Users (
    userId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userName varchar(100) NULL,
    email varchar(100) NOT NULL,
    userPassword varchar(100) NOT NULL,
    userType varchar(100) NOT NULL,
    subscription varchar(100) NULL
);

-- CREATE TABLE Food (
--     foodId int NOT NULL auto_increment,
--     foodName varchar(100) NULL,
--     quantity int NULL,
--     expireDate varchar(100) NULL,
--     price double NULL,
--     discount double NULL,
--     donation boolean NULL,
--     sale boolean Null,    
--     PRIMARY KEY (foodId)
-- );
-- 
-- CREATE TABLE UserFood (
-- 	userId int not NULL,
--     foodId int not NULL,
--     FOREIGN KEY (userId) REFERENCES Users (userId),
--     FOREIGN KEY (foodId) REFERENCES Food (foodId),
-- 	PRIMARY KEY (userId, foodId) 
-- );
       
-- INSERT INTO Food (foodId, foodName, quantity, expireDate, price, discount, donation, sale) 
-- VALUES (1, 'Apple', '10', '2024-03-30', 1, 0, true, false),
--        (2, 'Banana', '15', '2024-03-25', 2, 10, false, true),
--        (3, 'Orange', '20', '2024-04-01', 1, 0, true, false);

INSERT INTO Users (userName, email, userPassword, userType, subscription) 
VALUES ('John Doe', 'john@example.com', 'password123', 'retailer', 'yes'),
       ('Jane Smith', 'jane@example.com', 'password456', 'customer', 'yes'),
       ('Jane Care', 'care@example.com', 'password789', 'charitable_organization', 'yes');
       
-- INSERT INTO Food (foodId, foodName, quantity, expireDate, price, discount, donation, sale) 
-- VALUES (1, 'Apple', '10', '2024-03-30', 1, 0, true, false),
--        (2, 'Banana', '15', '2024-03-25', 2, 10, false, true),
--        (3, 'Orange', '20', '2024-04-01', 1, 0, true, false);     

-- select * from Users;
-- select * from Food;
-- select * from UserFood;
