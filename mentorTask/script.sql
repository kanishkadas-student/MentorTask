create database LoginInfo;
use LoginInfo;

create table Login(
userid int primary key not null,
username varchar(20) not null,
password varchar(8) not null);

insert into Login values(1,'Kanishka Das','Akash@12');
insert into Login values(2,'Jishu Das','Jishu@12');

commit;