I tried developing APIs as mentioned in the email. 


Database –
I have used in memory DB i.e. H2 database and configuration is available in application.properties file. Once server is started DB URL can be find in as below 
http://localhost:9090/h2/
Please put JDBC URL as jdbc:h2:mem:demo
Username and password is as general configuration 

Tomcat Server
Inbuild Tomcat server is running on 9090 port 

DDL and DML
Table information and data files (DDL and DML) are available in resources folder. Once server started successfully, table will be created and data will be inserted in the table.  

API documentation 
	Swagger document has been implemented with APIs and can be access with below URL when server started successfully. 
	http://localhost:9090/swagger-ui.htm
	

Steps to build and run 
===============================
1. Extract code from zip file 
2. navigate to the project folder 'employeedemo' 
3. mvn clean install (assume MVN and java (1.8) is already installed in your machine)
4. Once build is success, go to target folder andhot below command 
5. java -jar employeedemo-0.0.1-SNAPSHOT.jar
6. http://localhost:9090/swagger-ui.htm - To open Swagger document to test APIs 
7. http://localhost:9090/h2/ -- to check DB details 
