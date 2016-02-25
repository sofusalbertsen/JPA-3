-- DROP TABLE Person;
-- CREATE TABLE IF NOT EXISTS Person(
--    CLASSNAME   VARCHAR(12) NOT NULL PRIMARY KEY
--   ,Username    VARCHAR(9) NOT NULL
--   ,DTYPE       VARCHAR(7) NOT NULL
--   ,Email       VARCHAR(24) NOT NULL
--   ,Firstname   VARCHAR(23) NOT NULL
--   ,Lastname    VARCHAR(14) NOT NULL
--   ,MobilePhone VARCHAR(11)
--   ,Address     VARCHAR(27) NOT NULL
--   ,PostalCode  INTEGER  NOT NULL
--   ,City        VARCHAR(14) NOT NULL
-- );
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2015Dat3SemA','cph-ag80','Student','cph-ag80@cphbusiness.dk','Alex Kristian','Grabowski','45223484897');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2015Dat3SemA','cph-an130','Student','cph-an130@cphbusiness.dk','Alexander Rode','Nielsen','31234337');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2015Dat3SemA','cph-as282','Student','cph-as282@cphbusiness.dk','Andreas Essing','Snorrason','23423482393');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2016Dat3SemA','cph-al180','Student','cph-al180@cphbusiness.dk','Andreas Heindorff','Larsen','412343233');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2016Dat3SemA','cph-as283','Student','cph-as283@cphbusiness.dk','Andreas Sørbye','Styltsvig','3112344');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2016Dat3SemA','cph-ba98','Student','cph-ba98@cphbusiness.dk','Bente','Andersen','2234321250');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2017Dat3SemA','cph-ba83','Student','cph-ba83@cphbusiness.dk','Bobbie Boll Mikkelsen','Apitzsch','2342341812');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2017Dat3SemA','cph-ct78','Student','cph-ct78@cphbusiness.dk','Can','Turan','538234230');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2017Dat3SemA','cph-cs200','Student','cph-cs200@cphbusiness.dk','Casper Peter','Schultz','31723434');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2018Dat3SemA','cph-cl166','Student','cph-cl166@cphbusiness.dk','Christian','Lind','23440 76');
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2018Dat3SemA','cph-cj230','Student','cph-cj230@cphbusiness.dk','Christoffer Friis','Jagd',NULL);
INSERT INTO PERSON(CLASSNAME,Username,DTYPE,Email,Firstname,Lastname,MobilePhone) VALUES ('2018Dat3SemA','cph-cj231','Student','cph-cj231@cphbusiness.dk','Christoffer Sander','Jørgensen',NULL);
INSERT INTO `ADDRESS` (`ID`,`CITY`,`COUNTRY`,`STREETNAME`,`STREETNUMBER`,`ZIPCODE`) VALUES (1,'Copenhagen','Denmark','Nørrebrogade','233','2200');
UPDATE PERSON SET `ADDRESS_ID`='1' WHERE `USERNAME`='cph-ba98';
