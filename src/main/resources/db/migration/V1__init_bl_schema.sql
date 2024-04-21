create schema if not exists auth;

SET search_path TO auth;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
(

    id         SERIAL PRIMARY KEY,
    username   VARCHAR(100) not null unique,
    email      VARCHAR(100) not null unique,
    password   VARCHAR(255) NOT NULL,
    role       VARCHAR(10) NOT NULL DEFAULT 'USER',
    status     VARCHAR(10) NOT NULL DEFAULT 'ACTIVE',
    created    timestamp not null,
    updated    timestamp not null

);