-- create database
CREATE DATABASE IF NOT EXISTS 'CSJ_DB';
USE CSJ_DB;

-- create tables

CREATE TABLE IF NOT EXISTS `users` (
    `id`        int(50)     NOT NULL AUTO_INCREMENT,
    `name`      VARCHAR(25) NOT NULL COMMENT '名字',
    `age`       int(3)              COMMENT '年龄',
    `gender`    VARCHAR(15)         COMMENT '性别',
    PRIMARY KEY (id),
    UNIQUE KEY (name)
) COMMENT '用户表';

INSERT INTO users (name, age, gender) VALUES ("黄宗树", 25, '男');
INSERT INTO users (name, age, gender) VALUES ("成绍金", 24, '男');
INSERT INTO users (name, age, gender) VALUES ("姜攀", 25, '男');
INSERT INTO users (name, age, gender) VALUES ("李生", 25, '女');

SELECT * FROM users;