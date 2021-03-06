DROP TABLE IF EXISTS PROJECT;
DROP TABLE IF EXISTS DEPARTMENT;
DROP TABLE IF EXISTS EMPLOYEE;


CREATE TABLE EMPLOYEE (
  EMPLOYEE_ID INT AUTO_INCREMENT  PRIMARY KEY,
  EMPLOYEE_CODE VARCHAR(6) NOT NULL,
  EMPLOYEE_NAME VARCHAR(50) NOT NULL
);

CREATE TABLE DEPARTMENT (
  DEPARTMENT_ID INT AUTO_INCREMENT  PRIMARY KEY,
  DEPARTMENT_CODE VARCHAR(4) NOT NULL,
  DEPARTMENT_NAME VARCHAR(50) NOT NULL,
  EMPLOYEE_ID INT NOT NULL
  
);

CREATE TABLE PROJECT (
  PROJECT_ID INT AUTO_INCREMENT  PRIMARY KEY,
  PROJECT_CODE VARCHAR(5) NOT NULL,
  PROJECT_NAME VARCHAR(50) NOT NULL,
  DEPARTMENT_ID INT NOT NULL
);
