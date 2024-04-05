
       
/**
* Author:  Wei Deng
*/

-- DROP DATABASE IF EXISTS inventory;
-- CREATE DATABASE inventory;
USE inventory;
-- 
-- CREATE TABLE Users (
--     userId int NOT NULL AUTO_INCREMENT,
--     userName varchar(100) NULL,
--     email varchar(100) NOT NULL,
--     userPassword varchar(100) NOT NULL,
--     userType varchar(100) NOT NULL,
--     subscription varchar(100) NULL,
--     PRIMARY KEY (userId)
-- );

-- CREATE TABLE Food (
--     foodId int NOT NULL,
--     foodName varchar(100) NULL,
--     quantity varchar(100) NULL,
--     expireDate varchar(100) NULL,
--     price int NULL,
--     discount int NULL,
--     donation boolean NULL,
--     sale boolean Null,    
--     PRIMARY KEY (foodId)
-- );
-- 
-- CREATE TABLE UserFood (
--     userId int not NULL,
--     foodId int not NULL,
--     FOREIGN KEY (userId) REFERENCES Users (userId),
--     FOREIGN KEY (foodId) REFERENCES Food (foodId),
-- 	PRIMARY KEY (userId, foodId) 
-- );

-- INSERT INTO Users (userId, userName, email, userPassword, userType, subscription) 
-- VALUES (1, 'John Doe', 'john@example.com', 'password123', 'Retailer', 'Yes'),
--        (2, 'Jane Smith', 'jane@example.com', 'password456', 'Customer', 'Yes'),
--        (3, 'Jane Care', 'care@example.com', 'password789', 'Charitable Organization', 'Yes');
       
-- INSERT INTO Food (foodId, foodName, quantity, expireDate, price, discount, donation, sale) 
-- VALUES (1, 'Apple', '10', '2024-03-30', 1, 0, true, false),
--        (2, 'Banana', '15', '2024-03-25', 2, 10, false, true),
--        (3, 'Orange', '20', '2024-04-01', 1, 0, true, false);
       
-- INSERT INTO UserFood (userId, foodId)
-- VALUES (1, 1),
--        (2, 2),
--        (3, 3);      

select * from Users;
-- select * from Food;
-- select * from UserFood;
