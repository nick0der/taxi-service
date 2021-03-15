create table taxi
(
	id bigint not null
		constraint taxi_pkey
			primary key,
	color varchar(255),
	model varchar(255),
	seats bigint,
	track_number varchar(255),
	garage_id bigint
		constraint fkdqpd8bq2nx8qeulmwv17qqd91
			references garage
);

alter table taxi owner to postgres;

