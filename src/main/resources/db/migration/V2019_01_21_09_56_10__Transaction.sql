/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  acer
 * Created: Jan 21, 2019
 */

create table transaction(
id varchar(64) not null primary key,
date timestamp,
customer_id varchar(64) not null,
shop_id varchar(64) not null,
total double
);