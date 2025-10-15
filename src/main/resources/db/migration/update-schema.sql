ALTER TABLE task
    ADD created_at date NULL;

ALTER TABLE task
    ADD name_task VARCHAR(100) NULL;

ALTER TABLE task
    MODIFY name_task VARCHAR (100) NOT NULL;

ALTER TABLE task
DROP
COLUMN createdAt;

ALTER TABLE task
DROP
COLUMN nameTask;