DROP TABLE IF EXISTS student;

CREATE TABLE student (
    id INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER
);

INSERT INTO student (id, name, age)
VALUES (1, 'Goku', 20);

SELECT * FROM student;