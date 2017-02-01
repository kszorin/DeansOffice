USE deans_office;
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