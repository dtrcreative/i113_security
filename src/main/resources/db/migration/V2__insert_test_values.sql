SET search_path TO auth;

insert into users(username, email, firstname, lastname, password, role, status, created, updated)
values ('master', 'user_email@gmail.ru', 'Дмитрий', 'Мастерович', '$2a$12$ogK61gygrGtruI7ix02ym.WRCzLzWiCxcpMv0Lou7weEDWq9ziA9m', 'ADMIN', 'ACTIVE',
        current_timestamp, current_timestamp);
