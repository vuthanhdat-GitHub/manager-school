use spring;

insert into role(code,name) values('MANAGER','Quản trị');
insert into role(code,name) values('STAFF','Nhân Viên');

insert into user(username,password,fullname,status)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','Đặng Văn Đạt',1);
insert into user(username,password,fullname,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);
insert into user(username,password,fullname,status)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn B',1);
insert into user(username,password,fullname,status)
values('nguyenvanc','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn C',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);
INSERT INTO user_role(userid,roleid) VALUES (4,2);

INSERT INTO building(name,numberofbasement,buildingarea,district,ward,street,structure,costrent,cosdescription,servicecost,carcost,motobikecost,overtimecost,electtricost,deposit,payment,timerent,timedecorater,timecontract,managername,managerphone,type,levelbuilding,direction,id,createddate,modifieddate,createdby,modifiedby)
VALUES('The Spark',10,100,'QUAN_LONG_BIEN','Phuong Quang Trung','CT8C Khu ?ô Th? D??ng N?i, Yên L?, Yên Ngh?a, Hà ?ông, Hà N?i, Vi?t Nam',null,70,'70 trieu / m2','','','','','','','','','',null,'??t ??ng','02345565666','TANG_TRET','Gia Cao','dong bac',null,'2020-02-29 22:53:12.9',null,'',null)
