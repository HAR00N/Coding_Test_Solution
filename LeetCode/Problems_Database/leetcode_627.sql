-- ----------------------------------------------------------------------------------------------------------
-- Write an SQL query to swap all 'f' and 'm' values (i.e., change all 'f' values to 'm' and vice versa) ----
-- with a single update statement and no intermediate temporary tables.                                   ---
-- Note that you must write a single update statement, do not write any select statement for this problem. --
-- ----------------------------------------------------------------------------------------------------------

-- CREATE SCHEMA `leetcode_627` ;
-- CREATE TABLE SALARY (
-- 	ID		INT ,
-- 	NAME	VARCHAR(50) ,
-- 	SEX		ENUM('m', 'f') ,
-- 	SALARY	FLOAT );

-- INSERT INTO SALARY VALUES
-- (1, 'A', 'm', 2500), (2, 'B', 'f', 1500), (3, 'C', 'm', 5500), (4, 'D', 'f', 500);

SELECT * FROM SALARY;

UPDATE SALARY
SET SEX = IF (SEX = 'm', 'f', 'm');
