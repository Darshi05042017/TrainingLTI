create sequence cust_seq
start with 1
increment by 1;

create table Table_register(
	id number(10) primary key,
    name varchar2(20),
    email varchar(20),
    username varchar(20),
    password varchar(20));