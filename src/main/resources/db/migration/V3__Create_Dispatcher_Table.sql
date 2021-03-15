create table dispatcher
(
	id bigint not null
		constraint dispatcher_pkey
			primary key,
	age numeric(19,2),
	email varchar(255),
	full_name varchar(255),
	mobile varchar(255),
	salary numeric(19,2),
	department_id bigint
		constraint fkan6u2els8mxmcftedbyv3ficr
			references department
);

alter table dispatcher owner to postgres;

