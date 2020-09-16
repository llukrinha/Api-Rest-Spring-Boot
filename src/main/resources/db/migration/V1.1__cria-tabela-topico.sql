create table topico(
                       titulo varchar(20) not null ,
                       mensagem varchar(255) not null ,
                       data_criacao date not null ,
                       status varchar(15) not null ,
                       autor_id int not null ,
                       curso_id int not null
);