/* Question
Write an SQL query to report all customers who never order anything. --
*/

/*Setting
CREATE SCHEMA `leetcode_183` ;

CREATE TABLE CUSTOMERS (
	ID 		INT PRIMARY KEY, 
	NAME 	VARCHAR(50) );
    
CREATE TABLE ORDERS (
	ID 			INT PRIMARY KEY, 
	CUSTOMERID 	VARCHAR(50) );

INSERT INTO CUSTOMERS VALUES 
(1,'JOE'), (2,'HENRY'), (3,'SAM'), (4,'MAX');

INSERT INTO ORDERS VALUES 
(1, 3), (2, 1);
*/

SELECT * FROM CUSTOMERS;
SELECT * FROM ORDERS;

SELECT NAME AS CUSTOMERS
FROM CUSTOMERS
WHERE ID NOT IN (SELECT CUSTOMERID FROM ORDERS);


