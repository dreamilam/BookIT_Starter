# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  user_name                     varchar(255) not null,
  user_id                       integer,
  user_email                    varchar(255),
  user_password                 varchar(255),
  constraint pk_user primary key (user_name)
);


# --- !Downs

drop table if exists user;

