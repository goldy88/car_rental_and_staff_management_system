CREATE SCHEMA IF NOT EXISTS `fleetdb`;
create table contact
(
    id        int auto_increment
        primary key,
    email     varchar(255) null,
    firstname varchar(255) null,
    lastname  varchar(255) null,
    mobile    varchar(255) null,
    phone     varchar(255) null,
    remarks   varchar(255) null
);

create table country
(
    id          int auto_increment
        primary key,
    capital     varchar(255) null,
    code        varchar(255) null,
    continent   varchar(255) null,
    description varchar(255) null,
    nationality varchar(255) null
);

create table employee_type
(
    id          int auto_increment
        primary key,
    description varchar(255) null,
    details     varchar(255) null
);

create table job_title
(
    id          int auto_increment
        primary key,
    description varchar(255) null,
    details     varchar(255) null
);

create table module
(
    id          int auto_increment
        primary key,
    description varchar(255) null,
    details     varchar(255) null
);

create table state
(
    id        int auto_increment
        primary key,
    capital   varchar(255) null,
    code      varchar(255) null,
    countryid int          null,
    details   varchar(255) null,
    name      varchar(255) null,
    constraint FK26mi9hxhe1phwyqkvwb4ygot5
        foreign key (countryid) references country (id)
);

create table client
(
    id        int auto_increment
        primary key,
    address   varchar(255) null,
    city      varchar(255) null,
    countryid int          null,
    details   varchar(255) null,
    email     varchar(255) null,
    mobile    varchar(255) null,
    name      varchar(255) null,
    phone     varchar(255) null,
    stateid   int          null,
    website   varchar(255) null,
    constraint FKdhlcvwfpbu1g8mr22t95gfhha
        foreign key (stateid) references state (id),
    constraint FKdl2uu6vavuggmw39eqog9ka84
        foreign key (countryid) references country (id)
);

create table employee
(
    id                     int auto_increment
        primary key,
    address                varchar(255) null,
    city                   varchar(255) null,
    countryid              int          null,
    date_of_birth          datetime(6)  null,
    email                  varchar(255) null,
    firstname              varchar(255) null,
    gender                 varchar(255) null,
    initials               varchar(255) null,
    lastname               varchar(255) null,
    marital_status         varchar(255) null,
    mobile                 varchar(255) null,
    othername              varchar(255) null,
    phone                  varchar(255) null,
    photo                  varchar(255) null,
    social_security_number varchar(255) null,
    stateid                int          null,
    title                  varchar(255) null,
    employeetypeid         int          null,
    hire_date              datetime(6)  null,
    jobtitleid             int          null,
    username               varchar(255) null,
    constraint FK9hga8iyrt1lh8ofyic3lb0792
        foreign key (countryid) references country (id),
    constraint FKdququtwg0blqbvnpwhhd8g3jf
        foreign key (stateid) references state (id),
    constraint FKe1h4f2i4kb3hdr67guoeyg16h
        foreign key (employeetypeid) references employee_type (id),
    constraint FKod9tsamp0p54ko9vk9fwusrig
        foreign key (jobtitleid) references job_title (id)
);

create table location
(
    id          int auto_increment
        primary key,
    address     varchar(255) null,
    city        varchar(255) null,
    countryid   int          null,
    description varchar(255) null,
    details     varchar(255) null,
    stateid     int          null,
    constraint FK4owleaia0nd955fr44srvdwhp
        foreign key (stateid) references state (id),
    constraint FKs7swryq3x80exyw5x7q9exk4
        foreign key (countryid) references country (id)
);

create table supplier
(
    id        int auto_increment
        primary key,
    address   varchar(255) null,
    city      varchar(255) null,
    countryid int          null,
    details   varchar(255) null,
    email     varchar(255) null,
    mobile    varchar(255) null,
    name      varchar(255) null,
    phone     varchar(255) null,
    stateid   int          null,
    website   varchar(255) null,
    constraint FKan3bwr38w0wfolb0s19xdh9xi
        foreign key (countryid) references country (id),
    constraint FKdksgl156r0b3rjw74nuna1bqt
        foreign key (stateid) references state (id)
);
