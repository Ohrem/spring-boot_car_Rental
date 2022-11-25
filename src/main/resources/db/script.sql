CREATE DATABASE IF NOT EXISTS car_rental;

CREATE TABLE car
(
    id    BIGINT PRIMARY KEY,
    brand VARCHAR(64) NOT NULL,
    model VARCHAR(64) NOT NULL,
    color VARCHAR(64) NOT NULL,
    price DECIMAL     NOT NULL
);

DROP TABLE car;

CREATE TABLE payment
(
    id          BIGINT PRIMARY KEY,
    paymentDate DATE    NOT NULL,
    paymentSum  DECIMAL NOT NULL,
    order_id    BIGINT REFERENCES orders (id)
);

DROP TABLE payment;

CREATE TABLE orders
(
    id         BIGINT PRIMARY KEY,
    begin_date DATE,
    end_date   DATE,
    message    VARCHAR(64) NOT NULL,
    car_id     BIGINT REFERENCES car (id),
    payment_id BIGINT REFERENCES payment (id),
    user_id    BIGINT REFERENCES user (id)
);

DROP TABLE orders;

CREATE TABLE user
(
    id       BIGINT PRIMARY KEY,
    name     VARCHAR(64)        NOT NULL,
    surname  VARCHAR(64)        NOT NULL,
    email    VARCHAR(64) UNIQUE NOT NULL,
    password VARCHAR(64)        NOT NULL,
    phone    VARCHAR(64)        NOT NULL,
    balance  DECIMAL,
    role     VARCHAR(64)        NOT NULL
);

DROP TABLE user;