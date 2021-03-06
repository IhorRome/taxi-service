# Taxi service
This project is written using N-tier architecture and it is a custom implementation of car management system which allows you to create/read/update/delete car manufacturers, cars related to manufacturer and drivers of cars. As user you will be able to register yourself (or anyone else) as driver and after that - authenticate using login/password gaining access to further features of this project. Also all information about your doings will be logged in a local file on your computer (search logs/app.log in directory with Tomcat to find it). 

## Launch
1. Download this project to your local IDE
2. In MySQL Workbrench create new connection with your username / password to MySQL -> create new local database (schema)
3. Configure connection to your database in src/main/java/taxi/util/ConnectionUtil.java: <br>
    URL TO YOUR LOCAL DB - jdbc:mysql://localhost:3306/<b>database_name</b>?useLegacyDatetimeCode=false&serverTimezone=UTC <br>
    YOUR USERNAME - MySQL username <br>
    YOUR PASSWORD - MySQL password <br>
    JDBC_DRIVER - com.mysql.cj.jdbc.Driver <br>
4. Configure TomCat Local server (Add New Configuration -> TomCat -> Local -> Fix -> taxi-service:war exploded -> OK
5. Run your project
6. In browser you will see login page with possibility to register a new user(drier) - click register
7. Fill in empty fields on this page -> click Submit
8. Login with your username and password, enjoy!

## Technologies used
- Apache Tomcat (version 9.0.46)
- MySQL (version 8.0.24)
- JDBC
- Servlet
- JSP
- JSTL
- Logger
