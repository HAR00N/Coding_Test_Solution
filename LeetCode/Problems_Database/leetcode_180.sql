/* Question
Write an SQL query to find all numbers that appear at least three times consecutively.
*/

/* Setting
CREATE SCHEMA `leetcode_180` ;

CREATE TABLE LOGS (
	ID		INT,
	NUM		VARCHAR(50) );

INSERT INTO LOGS VALUES
(1, 1), (2, 1), (3, 1), (4, 2), (5, 1), (6, 2), (7, 2);
*/

SELECT * FROM LOGS;

WITH MAIN AS (
	SELECT 
		  T2.ID
		, T1.NUM
		, T2.NUM AS NUM_1        
	FROM LOGS T1
	INNER JOIN LOGS T2
	ON T1.ID + 1 = T2.ID
    WHERE T1.NUM = T2.NUM )
SELECT DISTINCT A1.NUM AS ConsecutiveNums
FROM MAIN A1
INNER JOIN LOGS A2
ON A1.ID + 1 = A2.ID
WHERE A1.NUM_1 = A2.NUM;
