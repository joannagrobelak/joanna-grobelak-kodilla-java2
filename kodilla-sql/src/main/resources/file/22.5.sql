USE KODILLA_COURSE;

CREATE TABLE STATS
(
STAT_ID INT(11) AUTO_INCREMENT PRIMARY KEY,
STAT_DATE DATETIME NOT NULL,
STAT VARCHAR(20) NOT NULL,
VALUE INT(11) NOT NULL
);

COMMIT;

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(BESTSELLER)
FROM BOOKS
WHERE BESTSELLER = 1;

USE KODILLA_COURSE;

DELIMITER $$
CREATE EVENT UPDATE_BESTSELLERS
ON SCHEDULE EVERY 1 MINUTE
DO
BEGIN
	DECLARE BESTSELLER_VALUE INT;
	CALL UpdateBestsellers();
    SELECT BESTSELLERS_COUNT INTO BESTSELLER_VALUE;
    INSERT INTO STATS (STAT_DATE, STAT, VALUE)
		VALUES (CURDATE(), "BESTSELLERS", BESTSELLER_VALUE);
END $$
DELIMITER ;