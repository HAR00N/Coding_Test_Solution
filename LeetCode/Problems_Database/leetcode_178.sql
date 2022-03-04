/* Question
Write an SQL query to rank the scores. The ranking should be calculated according to the following rules:
The scores should be ranked from the highest to the lowest.
If there is a tie between two scores, both should have the same ranking.
After a tie, the next ranking number should be the next consecutive integer value. In other words, there should be no holes between ranks.
*/

/* Setting
CREATE SCHEMA `leetcode_178` ;

CREATE TABLE SCORES (
	ID		INT,
	SCORE	DECIMAL(3,2) );

INSERT INTO SCORES VALUES
(1, 3.50), (2, 3.65), (3, 4.00), (4, 3.85), (5, 4.00), (6, 3.65);
*/

SELECT * FROM SCORES;

SELECT 
	SCORE ,
    DENSE_RANK() OVER (ORDER BY SCORE DESC) AS 'RANK'
FROM SCORES;
