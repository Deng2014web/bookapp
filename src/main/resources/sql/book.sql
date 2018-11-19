create database book;
use book;
create table tb_user(
    id int primary key auto_increment,
    loginname varchar(50) unique,
    password varchar(18),
    username varchar(18),
    phone varchar(18),
    address varchar(255)
);
insert into tb_user(loginname,password,username,phone,address) 
values('jack','123456','杰克','13920001234','广州市天河区');
insert into tb_user(loginname,password,username,phone,address) 
values('tom','123456','汤姆','13920001256','广州市海名曲');
insert into tb_user(loginname,password,username,phone,address) 
values('jerry','123456','杰瑞','13920003456','广州市回笼去');
create table tb_book (
    id int primary key auto_increment,
    name varchar(54),
    author varchar(54),
    publicationdate date,
    publication varchar(150),
    price double,
    image varchar(54),
    remark varchar(600)
);
insert into tb_book(id,name,author,publicationdate,publication,price,image,remark)
values('1','疯狂Java','li编','2018-10-1','电子工业出版社','74.2','java.jpg','好好学习，总结java经验');
insert into tb_book(id,name,author,publicationdate,publication,price,image,remark)
values('2','疯狂Java-Hibernate','wang编','2018-11-10','电子工业出版社','54.2','hibernate.jpg','好好学习，总结java经验');
insert into tb_book(id,name,author,publicationdate,publication,price,image,remark)
values('3','疯狂Java-Spring','zhang编','2017-6-1','机械出版社','34.2','spring.jpg','好好学习，总结java经验');
insert into tb_book(id,name,author,publicationdate,publication,price,image,remark)
values('4','疯狂Java-MyBaits','zhao编','2016-5-1','科技出版社','44.2','mybaits.jpg','好好学习，总结java经验');