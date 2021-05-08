insert into date (Date) values ('01-04-2021');
insert into date (Date) values ('02-04-2021');


insert into desk (desk, availability,date_id) values ('Desk1','Available',1);
insert into desk (desk, availability,date_id) values ('Desk2','Available',1);
insert into desk (desk, availability,date_id) values ('Desk3','Available',1);
insert into desk (desk, availability,date_id) values ('Desk4','Available',1);
insert into desk (desk, availability,date_id) values ('Desk5','Available',1);
insert into desk (desk, availability,date_id) values ('Desk6','Available',1);
insert into desk (desk, availability,date_id) values ('Desk7','Available',1);
insert into desk (desk, availability,date_id) values ('Desk8','Available',1);
insert into desk (desk, availability,date_id) values ('Desk9','Available',1);
insert into desk (desk, availability,date_id) values ('Desk10','Available',1);

insert into desk (desk, availability,date_id) values ('Desk1','Available',2);
insert into desk (desk, availability,date_id) values ('Desk2','Available',2);
insert into desk (desk, availability,date_id) values ('Desk3','Available',2);
insert into desk (desk, availability,date_id) values ('Desk4','Available',2);
insert into desk (desk, availability,date_id) values ('Desk5','Available',2);
insert into desk (desk, availability,date_id) values ('Desk6','Available',2);
insert into desk (desk, availability,date_id) values ('Desk7','Available',2);
insert into desk (desk, availability,date_id) values ('Desk8','Available',2);
insert into desk (desk, availability,date_id) values ('Desk9','Available',2);
insert into desk (desk, availability,date_id) values ('Desk10','Available',2);


INSERT INTO users (username, password, enabled) VALUES ('user', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('peter', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_ADMIN');
