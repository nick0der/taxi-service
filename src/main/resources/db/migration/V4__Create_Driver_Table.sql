create table driver
(
	id bigint not null
		constraint driver_pkey
			primary key,
	age numeric(19,2),
	email varchar(255),
	full_name varchar(255),
	mobile varchar(255),
	salary numeric(19,2),
	taxi_id bigint
		constraint fk5plgwvwqbf6qvym9uol6ly2jn
			references taxi
);

alter table driver owner to postgres;

