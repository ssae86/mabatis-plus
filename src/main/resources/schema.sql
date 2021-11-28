CREATE TABLE tbl_employee(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    last_name VARCHAR (50),
    email VARCHAR (50),
    gender CHAR(1),
    age INT
);
INSERT INTO tbl_employee (last_name, email, gender, age) VALUES('Tom','tom@atguigu.com', 1, 22);
INSERT INTO tbl_employee (last_name, email, gender, age) VALUES('Jerry', 'jerry@atguigu.com', 0, 25);
insert into tbl_employee (last_name, email, gender, age) values ('Black', 'black@atguigu.com', 1, 30);
INSERT INTO tbl_employee (last_name, email, gender, age) VALUES('White','white@atguigu.com', 0 , 35);
