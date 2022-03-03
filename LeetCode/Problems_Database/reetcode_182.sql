-- ---------------------------------------------------------
-- Write an SQL query to report all the duplicate emails. --
-- ---------------------------------------------------------

-- CREATE SCHEMA `leetcode_182` ;
-- CREATE TABLE PERSON (
-- 	ID 		INT PRIMARY KEY, 
-- 	EMAIL 	VARCHAR(50) );

-- INSERT INTO PERSON VALUES (1,'a@b.com');
-- INSERT INTO PERSON VALUES (2,'c@d.com');
-- INSERT INTO PERSON VALUES (3,'a@b.com');

SELECT * FROM PERSON;

SELECT DISTINCT EMAIL
FROM PERSON
GROUP BY EMAIL
HAVING COUNT(EMAIL) >= 2;

-- Slower Answer
-- SELECT DISTINCT EMAIL
-- FROM PERSON
-- WHERE EMAIL IN 
-- (SELECT EMAIL FROM PERSON GROUP BY EMAIL HAVING COUNT(EMAIL)>=2);
