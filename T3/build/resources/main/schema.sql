drop table if exists pokemon;

create table pokemon(
 id_pokemon bigint auto_increment,
 name varchar(100) not null,
 type1 varchar(100) not null,
 type2 varchar(100) not null,
 primary key(id_pokemon)
 );