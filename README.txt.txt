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
