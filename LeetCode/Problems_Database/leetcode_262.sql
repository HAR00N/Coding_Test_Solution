/* Question
The cancellation rate is computed by dividing the number of canceled (by client or driver) 
requests with unbanned users by the total number of requests with unbanned users on that day.

Write a SQL query to find the cancellation rate of requests with unbanned users (both client and driver must not be banned) 
each day between "2013-10-01" and "2013-10-03". Round Cancellation Rate to two decimal points.
*/

/* Setting
CREATE SCHEMA `leetcode_262`;

CREATE TABLE TRIPS (
	ID			INT ,
	CLIENT_ID	INT ,
	DRIVER_ID	INT ,
	CITY_ID		INT ,
	STATUS		ENUM ('completed','cancelled_by_driver','cancelled_by_client') ,
	REQUEST_AT	DATE ) ;

CREATE TABLE USERS (
	USERS_ID	INT ,
	BANNED		ENUM ('Yes', 'No') ,
    ROLE		ENUM ('client', 'driver', 'partner') );

INSERT INTO TRIPS VALUES
("1", "1", "10", "1", "completed", "2013-10-01"), ("2", "2", "11", "1", "cancelled_by_driver", "2013-10-01"), 
("3", "3", "12", "6", "completed", "2013-10-01"), ("4", "4", "13", "6", "cancelled_by_client", "2013-10-01"), 
("5", "1", "10", "1", "completed", "2013-10-02"), ("6", "2", "11", "6", "completed", "2013-10-02"), 
("7", "3", "12", "6", "completed", "2013-10-02"), ("8", "2", "12", "12", "completed", "2013-10-03"), 
("9", "3", "10", "12", "completed", "2013-10-03"), ("10", "4", "13", "12", "cancelled_by_driver", "2013-10-03");

INSERT INTO USERS VALUES
("1", "No", "client"), ("2", "Yes", "client"), ("3", "No", "client"), 
("4", "No", "client"), ("10", "No", "driver"), ("11", "No", "driver"), 
("12", "No", "driver"), ("13", "No", "driver");
*/

SELECT * FROM TRIPS;
SELECT * FROM USERS;

SELECT
	  REQUEST_AT AS Day
	, ROUND(COUNT(CASE WHEN STATUS != 'completed' THEN 1 END) / COUNT(*), 2) AS 'Cancellation Rate'
FROM TRIPS
WHERE CLIENT_ID NOT IN (SELECT DISTINCT USERS_ID FROM USERS WHERE BANNED = 'Yes')
  AND DRIVER_ID NOT IN (SELECT DISTINCT USERS_ID FROM USERS WHERE BANNED = 'Yes')
  AND REQUEST_AT BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY REQUEST_AT;

-- Another Answer
WITH MAIN AS (
	SELECT
		REQUEST_AT AS Day
		, COUNT(REQUEST_AT) AS C1
        , COUNT(CASE WHEN STATUS != 'completed' THEN 1 END) AS C2
	FROM TRIPS
	WHERE CLIENT_ID NOT IN (SELECT DISTINCT USERS_ID FROM USERS WHERE BANNED = 'Yes')
	  AND DRIVER_ID NOT IN (SELECT DISTINCT USERS_ID FROM USERS WHERE BANNED = 'Yes')
	GROUP BY REQUEST_AT
    )

SELECT 
 	  Day
 	, ROUND( C2 / C1, 2 ) AS 'Cancellation Rate'
FROM MAIN
GROUP BY DAY
HAVING DAY BETWEEN '2013-10-01' AND '2013-10-03';