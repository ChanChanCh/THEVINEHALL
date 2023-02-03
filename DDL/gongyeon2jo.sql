drop table gongyeon2jo.performance;

drop table gongyeon2jo.performance_detail;

drop table gongyeon2jo.ticketing;

drop table gongyeon2jo.user;

create table if not exists gongyeon2jo.performance
(
    performance_id varchar(100) null,
    prfperiod      date         null,
    category       varchar(100) null,
    prfplacename   varchar(100) null,
    prfname        varchar(100) null,
    seatcnt        varchar(100) null,
    poster         varchar(100) null,
    ticketing_id   varchar(100) null
    );

create table if not exists gongyeon2jo.performance_detail
(
    detail_id      varchar(100) null,
    performance_id varchar(100) null,
    display_id     varchar(100) null,
    display_name   varchar(100) null,
    first_date     date         null,
    last_date      date         null,
    runtime        int          null,
    company        varchar(100) null,
    price          varchar(100) null,
    poster         varchar(100) null,
    story          varchar(100) null,
    genre          varchar(100) null
    );

create table if not exists gongyeon2jo.ticketing
(
    ticketing_id   varchar(100) null,
    email          varchar(100) null,
    phonenumber    varchar(100) null,
    credit         varchar(100) null,
    left_credit    varchar(100) null,
    performance_id varchar(100) null
    );

create table if not exists gongyeon2jo.user
(
    user_id           varchar(100) null,
    email             varchar(100) null,
    name              varchar(100) null,
    password          varchar(100) null,
    birth             date         null,
    phone             varchar(100) null,
    create_dt         date         null,
    modified_dt       date         null,
    verification_code varchar(100) null,
    verify            tinyint      null,
    verify_expired_at date         null,
    credit_id         varchar(100) null,
    review_id         varchar(100) null,
    ticketing_id      varchar(100) null
);
