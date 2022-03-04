/* Question
Write an SQL query to delete all the duplicate emails,
keeping only one unique email with the smallest id.
Note that you are supposed to write a DELETE statement and not a SELECT one. --
*/

/* Setting
CREATE SCHEMA `leetcode_196` ;

CREATE TABLE PERSON (
	ID 		INT PRIMARY KEY, 
	EMAIL 	VARCHAR(50) );

TRUNCATE PERSON;
INSERT INTO PERSON VALUES (1,'john@example.com');
INSERT INTO PERSON VALUES (2,'bob@example.com');
INSERT INTO PERSON VALUES (3,'john@example.com');
*/

SELECT * FROM PERSON;

DELETE T1 FROM PERSON T1
JOIN PERSON T2
ON T1.EMAIL = T2.EMAIL
WHERE T1.ID > T2.ID;