/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  acer
 * Created: Jan 21, 2019
 */

create table shop(
id varchar(64) not null primary key,
name varchar(50) not null,
phone varchar(15) not null,
address text
);

insert into shop(id,name,phone,address)
values(
'001','Buana Electronic','083822300920','Jl Merpati 56'
);