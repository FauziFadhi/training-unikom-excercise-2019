/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  acer
 * Created: Jan 21, 2019
 */

create table transaction_detail(
id varchar(64) not null primary key,
transaction_id varchar(64) not null,
item_id varchar(64) not null,
qty int not null,
price double not null);