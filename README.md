# Taxi service
This project is custom implementation of car manager which allows you to create/read/update/delete car manufacturers, cars related to manufacturer, drivers of cars

## Launch
1. Download this project to your local IDE
2. In MySQL Workbrench create new connection with your username / password to MySQL -> create new local database (schema)
3. Configure connection to your database in ConnectionUtil class (packages java->taxi->util)
    URL TO YOUR LOCAL DB - jdbc:mysql://localhost:3306/YOUR_LOCAL_DATABASE_NAME?useLegacyDatetimeCode=false&serverTimezone=UTC
    YOUR USERNAME - MySQL username
    YOUR PASSWORD - MySQL password
    JDBC_DRIVER - com.mysql.cj.jdbc.Driver
4. Configure TomCat Local server (Add New Configuration -> TomCat -> Local -> Fix -> taxi-service:war exploded -> OK
5. Run your project
6. In browser you will see login page with possibility to register a new user - click register
7. Fill in empty fields on this page -> click Submit
8. Login with your username and password, enjoy!

## Technologies used
- Apache Tomcat (version 9.0.46)
- MySQL (version 8.0.24)
- JDBC
- Servlet
- JSP
- JSTL
