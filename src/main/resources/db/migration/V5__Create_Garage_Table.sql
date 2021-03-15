create table garage
(
	id bigint not null
		constraint garage_pkey
			primary key,
	area numeric(19,2),
	number varchar(255),
	department_id bigint
		constraint fkonek03jack8suav4mruy9yomk
			references department
);

alter table garage owner to postgres;

