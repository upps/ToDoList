# ToDoList
Project: Online TODO List:
The aim is to build a simple online TODO list with a web interface that can be used in all popular web browsers. The application supports multiple users, store necessary data in a in-memory database and is built with Spring-Boot framework.

Spring-Boot Framework:
Spring Boot provides one of the best platforms to develop java web application. Spring Boot gives a decent stage to Java developers to build up an independent and production grade application that you can easily run. It allows the user to create an application with least arrangements without the requirement for a whole Spring configuration setup. This helps the developer to expedite the development, unit and integration testing time, which in turn increases the productivity. It can be combined with spring security to cover the overall security requirements of the web application. Spring Boot helps us to address the process of various characteristics such as security, scalability, reusability, flexibility into an organised solution that comprises the business and technical expectations.

Bootstrap Framework:
Bootstrap is typically the most widely used open-source frontend framework which includes CSS, HTML and JavaScript components for web application development. It provides the necessary arsenal to the developer to design a responsive webpage. The bootstrap framework is consistently updated so that it can provide the latest features for the developers. Bootstrap reduces the burden of the developers and helps to ease their work.

Hibernate:
Hibernate is an open-source objects relational mapping framework that helps in mapping the java classes directly to the database. It provides the additional luxury to the developer by writing the SQL queries at the backend and reduces the burden. The hibernate used JDBC for persisting the data into the database tables. The ORM helps in simplifying the creation, manipulation and accessing data.

H2 in-memory Database:
H2 is another freeware database management system which is most widely used form small web applications. It can be embedded in Java applications or run-in client server mode. It can be configured
to run as in memory database, which suggests that data will not be persisted in the disk. This is because the embedded database is only used for development and testing.

Functional Requirements:
The functional requirements help the developer in knowing more about the application especially the aspect of its behaviour. It also demonstrates activities that can be done by a user while using the application and to check whether it yields the expected result.

Description: 
• User can sign in using unique login and password securely (this can be hard coded to a default user list, at list one user e.g. with username: test, password: pwd123).
• User can view her/his task list.
• User can add/remove task.
• All changes can be persistent to allow view them in next sign in by the same user. 
• Each task should display the date of last updates and description.
• User can check/uncheck any task on their list.
• Consider performance.
Design and Architecture:
The application consists of two parts but their architecture would be quite similar. When the USER tries to access the ToDoList portal he can provide the by using the interface. Then the data obtained by the user is sent to the controller of the respective page. Then the controller sends it to the service where the services are provided to the user by fetching the data from the in-memory database respectively. When the ADMIN tries to access the ToDoList portal the data traversal will be similar except the fact that it can only be accessed by the admin. Both the portals share the same database since there are dependencies.

Security Features:
The spring security dependency will be added to the application to additionally enhance the security of the web application. The security configuration file is where all the necessary measures for the security are provided. The code snippets that are provided below are by default provided by the spring security framework.
 
Future Enhancement:
I would implement Restful services since it will be compatible with Spring Boot which eventually helps to scale up the application.
I would add additional security features to protect the application from the OWASP top threats in order to build a secure application.

Git-hub link: https://github.com/upps/ToDoList.git




 
 
 
 
