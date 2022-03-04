-- -------------------------------------------------------------
-- ------ Write an SQL query to report the movies with ---------
-- an odd-numbered ID and a description that is not "boring". --
-- -------------------------------------------------------------

-- CREATE SCHEMA `leetcode_620` ;
-- CREATE TABLE CINEMA (
-- 	ID				INT,
-- 	MOVIE			VARCHAR(50),
-- 	DESCRIPTION		VARCHAR(50), 
-- 	RATING			FLOAT);

-- INSERT INTO CINEMA VALUES 
-- (1, "War", "great 3D", 8.9), (2, "Science", "fiction", 8.5), (3, "irish", "boring", 6.2), 
-- (4, "Ice song", "Fantacy", 8.6), (5, "House card", "Interesting", 9.1);

SELECT * FROM CINEMA;

SELECT * FROM CINEMA
WHERE MOD(ID,2) = 1 AND DESCRIPTION NOT LIKE 'BORING'
ORDER BY RATING DESC;

-- Slower Answer
-- SELECT * FROM CINEMA
-- WHERE MOD(ID,2) = 1 AND DESCRIPTION != 'BORING'
-- ORDER BY RATING DESC;