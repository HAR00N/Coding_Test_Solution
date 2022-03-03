-- -----------------------------------------------------------------------------
-- Write an SQL query to find the employees who earn more than their managers --
-- -----------------------------------------------------------------------------

-- CREATE SCHEMA `leetcode_181` ;
-- CREATE TABLE EMPLOYEE (	
-- 	ID 			INT PRIMARY KEY, 
-- 	NAME 		VARCHAR(50),
-- 	SALARY 		INT,
-- 	MANAGERID 	INT	);

-- INSERT INTO EMPLOYEE (ID, NAME, SALARY, MANAGERID) VALUES (1,'JOE',70000,3);
-- INSERT INTO EMPLOYEE (ID, NAME, SALARY, MANAGERID) VALUES (2,'HENRY',80000,4);
-- INSERT INTO EMPLOYEE (ID, NAME, SALARY, MANAGERID) VALUES (3,'SAM',60000,NULL);
-- INSERT INTO EMPLOYEE (ID, NAME, SALARY, MANAGERID) VALUES (4,'MAX',90000,NULL);

SELECT * FROM EMPLOYEE;

SELECT T2.NAME AS EMPLOYEE
FROM EMPLOYEE T2
JOIN EMPLOYEE T1
ON T1.ID = T2.MANAGERID
WHERE T2.SALARY > T1.SALARY;