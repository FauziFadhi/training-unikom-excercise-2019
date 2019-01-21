/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  acer
 * Created: Jan 21, 2019
 */

create table item(
id varchar(64) not null primary key,
name varchar(50) not null,
qty int(15) not null,
price double not null
);

insert into item(id,name,qty,price)
values(
'001','Asus X550DP',10,150000
);