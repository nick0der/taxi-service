create table department
(
	id bigint not null
		constraint department_pkey
			primary key,
	address varchar(255),
	chief_id bigint
		constraint fk7r7mj0hi1v9o06ikym5we2diy
			references chief
);

alter table department owner to postgres;

