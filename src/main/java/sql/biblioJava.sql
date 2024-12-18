drop database if exists biblioJava;
create database biblioJava;

use biblioJava;

create table member (
	idmember int not null auto_increment,
	lastname varchar(100) not null,
	firstname varchar(100) not null,
	email varchar (255) not null,
    password varchar (255) not null,
	phone varchar (50),
  	status enum('étudiant', 'adulte', 'senior') not null,
	credit int not null,
	is_admin boolean default false,
	primary key (idmember)
);

create table book (
	idbook int not null auto_increment,
	title varchar (255) not null,
	first_sentence varchar (255),
	image_url varchar(255) not null,
    is_loan boolean default false,
    price int not null,
	primary key (idbook)
);

create table categorie (
    idcategorie int not null auto_increment,
    label varchar(100) not null,
    primary key (idcategorie)
);

create table subscription (
	idsubscription int not null auto_increment,
	name varchar(100) not null,
	price int not null,
	credit int not null,
    primary key (idsubscription)
);

create table loan (
    idmember int not null,
    idbook int not null,
    loan_date date not null,
    is_return boolean default false,
    primary key (idmember, idbook, loan_date),
    foreign key (idbook) references book(idbook),
    foreign key (idmember) references member(idmember)
);

create table book_categorie (
    idbook int not null,
    idcategorie int not null,
    primary key (idbook, idcategorie),
    foreign key (idbook) references book(idbook),
    foreign key (idcategorie) references categorie(idcategorie)
);

create table is_subscribe (
	idmember int not null,
	idsubscription int not null,
    primary key (idmember, idsubscription),
    foreign key (idmember) references member(idmember),
    foreign key (idsubscription) references subscription(idsubscription)
);
insert into member (lastname, firstname, email, phone, status, password, credit, is_admin)
values ('Admin', 'Super', 'admin@java.com', '000-000-0000', 'adulte', 'admin123', 0, true);

