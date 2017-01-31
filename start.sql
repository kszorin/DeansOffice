DROP DATABASE IF EXISTS deans_office;
CREATE DATABASE deans_office DEFAULT CHARACTER SET 'utf8';
USE deans_office;

create table groups
(
 	id int unsigned not null auto_increment,
    group_name varchar(32) not null,
    curator_name varchar(255) not null,
    special_name varchar(255) not null,
    primary key (id)
)engine=InnoDB;
    
create table students
(
	id int unsigned not null auto_increment,
    surname varchar(64) not null,
    firstname varchar(64) not null,
    patronymic varchar(64) not null,
    birthday date not null,
    sex char(1),
    group_id int unsigned not null, 
    primary key (id),
    foreign key (group_id) references groups(id)
)engine=InnoDB;

set names 'utf8';

insert into groups (group_name, curator_name, special_name) 
values ('204', 'Доктор Борменталь', 'Системы информатики');
insert into groups (group_name, curator_name, special_name) 
values ('202', 'Профессор Преображенский', 'Биоинформатика');
insert into students (surname, firstName, patronymic, birthday, sex, group_id)
values ('Степанов', 'Иван', 'Сергеевич', '1990-03-20', 'М', 1);
insert into students (surname, firstName, patronymic, birthday, sex, group_id)
values ('Агузарова', 'Жанна', 'Анатольевна', '1989-01-22', 'Ж', 1);
insert into students (surname, firstName, patronymic, birthday, sex, group_id)
values ('Жданов', 'Анатолий', 'Карпович', '1990-07-05', 'М', 2);
insert into students (surname, firstName, patronymic, birthday, sex, group_id)
values ('Котова', 'Аделина', 'Николаевна', '1990-03-05', 'Ж', 2);