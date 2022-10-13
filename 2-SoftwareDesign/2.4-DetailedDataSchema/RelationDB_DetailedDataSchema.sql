drop table user CASCADE ;
drop table record CASCADE ;
drop table water CASCADE ;
drop table feel CASCADE ;
drop table poem CASCADE ;
drop table premium CASCADE ;

CREATE SEQUENCE s_user;
CREATE SEQUENCE s_record;


CREATE TABLE user( --опис користувача
      user_id INT PRIMARY KEY, --id
	email VARCHAR CHECK(email ~* '^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$') UNIQUE, --поштова скринька
	password VARCHAR --пароль
);
CREATE TABLE record( --опис запису
      user_id INT REFERENCES user(user_id), --id користувача
	record_id INT PRIMARY KEY --id
);
CREATE TABLE water( --опис води
      record_id INT REFERENCES record(record_id), --id запису
	volume NUMBER(6,2) --об'єм випитої води
);
CREATE TABLE feel( --опис запису
      record_id INT REFERENCES record(record_id), --id запису
	feeling VARCHAR --почуття
);
CREATE TABLE poem( --опис запису
      record_id INT REFERENCES record(record_id), --id запису
	text VARCHAR --текст віршу
);
CREATE TABLE premium( --опис запису
      record_id INT REFERENCES record(record_id), --id запису
	cardnumber NUMBER(16), --номер карти
	cvv INT, --3 цифри звороту
	address VARCHAR --адреса
);
