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
    no       int null,
    quota    int null,
    teacher  varchar(255) null
);

create table stu_select_crouse.notification
(
    id      int auto_increment
        primary key,
    content text null,
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
    studentList_id      varchar(255) not null,
    courseEntityList_id varchar(255) not null,
    constraint FK20jcx8me1et126fwexn5ipg7h
        foreign key (studentList_id) references stu_select_crouse.student (id),
    constraint FK3alepotft5gca28d67si1v12j
        foreign key (courseEntityList_id) references stu_select_crouse.course (id)
);

