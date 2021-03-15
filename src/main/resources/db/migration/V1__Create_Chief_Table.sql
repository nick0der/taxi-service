create table chief
(
	id bigint not null
		constraint chief_pkey
			primary key,
	age numeric(19,2),
	email varchar(255),
	full_name varchar(255),
	mobile varchar(255),
	salary numeric(19,2)
);

alter table chief owner to postgres;

