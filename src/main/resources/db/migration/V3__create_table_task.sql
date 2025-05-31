CREATE TABLE task (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    responsible_id BIGINT,
    priority priority_level,
    deadline DATE,
    FOREIGN KEY (responsible_id) REFERENCES responsible(id)
);