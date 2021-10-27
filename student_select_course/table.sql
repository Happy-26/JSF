create table stu_select_crouse.admin
(
    id       varchar(255) not null
        primary key,
    name     varchar(255) null,
    password varchar(255) null,
    phone    varchar(255) null
);

create table stu_select_crouse.course
(
    id       varchar(255) not null
        primary key,
    category varchar(255) null,
    name     varchar(255) null,
    quota    int          null,
    teacher  varchar(255) null,
    no       int          null,
    major    varchar(255) not null
);

create table stu_select_crouse.course_time
(
    id        int auto_increment
        primary key,
    course_id varchar(255) not null,
    no        int          not null
);

create table stu_select_crouse.notification
(
    id      int auto_increment
        primary key,
    content text         null,
    major   varchar(255) null,
    time    varchar(255) null,
    title   varchar(255) null
);

create table stu_select_crouse.student
(
    id       varchar(255) not null
        primary key,
    birth    varchar(255) null,
    classes  varchar(255) null,
    gender   varchar(255) null,
    major    varchar(255) null,
    name     varchar(255) null,
    password varchar(255) null
);

create table stu_select_crouse.student_course
(
    id         int auto_increment
        primary key,
    student_id varchar(255) not null,
    course_id  varchar(255) not null,
    no         int          not null
);

