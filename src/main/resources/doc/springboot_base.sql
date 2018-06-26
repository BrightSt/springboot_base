create database springboot_base;

create table `user_t`(
  `id` int(11),
  `user_name` varchar(255),
  `password` varchar(255),
  `age` int(10),
  primary key (`id`)
)
