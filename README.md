mengua
======
Requirement:
  - maven 3 (mvn -version)
  - java 7 (java -version)
  - mysql
  - make sure maven is using java 7(mvn compile --debug)

Compile:
  mvn clean compile

Package and run remotely:
  mvn package
  copy over target/mengua-0.0.1-SNAPSHOT-dist.zip and unzip to a directory
  java -jar mengua-0.0.1-SNAPSHOT.jar
  
Run server locally:
  mvn exec:java

Set up databse:
  mysql -uroot
  create user mengua_dev@localhost identified by "admin";
  grant all privileges on *.* to mengua_dev@locahost;
  drop database menguadb;
  create database menguadb;
