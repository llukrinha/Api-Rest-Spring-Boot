create table usuario(
                        id serial not null,
                        nome varchar(25) not null ,
                        email varchar(255) not null ,
                        senha varchar(15) not null ,

                        primary key (id)
);