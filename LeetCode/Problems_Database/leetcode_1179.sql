-- -----------------------------------------------------------------------
-- --------- Write an SQL query to reformat the table such that ----------
-- there is a department id column and a revenue column for each month. --
-- -----------------------------------------------------------------------

-- CREATE SCHEMA `leetcode_1179` ;
-- CREATE TABLE DEPARTMENT (
-- 	ID		INT ,
-- 	REVENUE	VARCHAR(50) ,
-- 	MONTH	VARCHAR(50) );

-- INSERT INTO DEPARTMENT VALUES
-- (1,8000,"Jan"),(2,9000,"Jan"),(3,10000,"Feb"),(1,7000,"Feb"),(1,6000,"Mar");


SELECT * FROM DEPARTMENT;
SELECT ID, REVENUE FROM DEPARTMENT WHERE MONTH = 'Jan';

SELECT 
	ID ,
    SUM(CASE WHEN MONTH = 'Jan' THEN REVENUE END) AS Jan_Revenue ,
    SUM(CASE WHEN MONTH = 'Feb' THEN REVENUE END) AS Feb_Revenue ,
    SUM(CASE WHEN MONTH = 'Mar' THEN REVENUE END) AS Mar_Revenue ,
    SUM(CASE WHEN MONTH = 'Apr' THEN REVENUE END) AS Apr_Revenue ,
    SUM(CASE WHEN MONTH = 'May' THEN REVENUE END) AS May_Revenue ,
    SUM(CASE WHEN MONTH = 'Jun' THEN REVENUE END) AS Jun_Revenue ,
    SUM(CASE WHEN MONTH = 'Jul' THEN REVENUE END) AS Jul_Revenue ,
    SUM(CASE WHEN MONTH = 'Aug' THEN REVENUE END) AS Aug_Revenue ,
    SUM(CASE WHEN MONTH = 'Sep' THEN REVENUE END) AS Sep_Revenue ,
    SUM(CASE WHEN MONTH = 'Oct' THEN REVENUE END) AS Oct_Revenue ,
    SUM(CASE WHEN MONTH = 'Nov' THEN REVENUE END) AS Nov_Revenue ,
    SUM(CASE WHEN MONTH = 'Dec' THEN REVENUE END) AS Dec_Revenue 
FROM DEPARTMENT
GROUP BY ID
ORDER BY ID ASC;