/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  acer
 * Created: Jan 21, 2019
 */

create table customer(
id varchar(64) not null primary key,
name varchar(50) not null,
phone varchar(15) not null
);

insert into customer(id,name,phone)
values(
'001','Fauzi Fadhillah','083822300920'
);