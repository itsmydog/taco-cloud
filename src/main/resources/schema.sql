CREATE TABLE if not exists Taco_Order (
    id identity,
    delivery_Name varchar(50) not null,
    delivery_Street varchar(50) not null,
    deliver_City varchar(50) not null,
    delivery_State varchar(2) not null,
    delivery_Zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    place_at timestamp not null
);

CREATE TABLE if not exists Taco(
    id identity,
    name varchar(50) not null,
    taco_order BIGINT not null,
    taco_order_key BIGINT not null,
    create_at timestamp not null
);

CREATE TABLE if not exists Ingredient_Ref (
    ingredient varchar(4) not null,
    taco BIGINT not null,
    taco_key BIGINT not null
);

CREATE TABLE if not exists Ingredient(
    id varchar (4) not null,
    name varchar (25) not null,
    type varchar (10) not null
);

alter table ingredient add PRIMARY key (id);
alter table Taco
    add foreign key (taco_order) references Taco_order(id);
alter table Ingredient_Ref
    add foreign key (ingredient) references Ingredient(id);
