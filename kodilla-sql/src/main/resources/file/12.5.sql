INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, ":)");
COMMIT;

UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 7;
COMMIT;

DELETE FROM POSTS
WHERE ID = 7;
COMMIT;