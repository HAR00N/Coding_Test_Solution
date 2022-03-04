-- ---------------------------------------------------------------------------------
-- Write an SQL query to report all the classes that have at least five students. --
-- ---------------------------------------------------------------------------------

-- CREATE SCHEMA `leetcode_596` ;
-- CREATE TABLE COURSES (
-- 	STUDENT	VARCHAR(50) ,
-- 	CLASS	VARCHAR(50) );

-- INSERT INTO COURSES VALUES
-- ("A", "Math"), ("B", "English"), ("C", "Math"), ("D", "Biology"), 
-- ("E", "Math"), ("F", "Computer"), ("G", "Math"), ("H", "Math"), ("I", "Math");

SELECT * FROM COURSES;

SELECT CLASS
FROM COURSES
GROUP BY CLASS
HAVING COUNT(CLASS) >= 5;