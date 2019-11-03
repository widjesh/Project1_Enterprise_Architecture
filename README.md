## Shiva Widjesh Bhaggan
### Steps to run this project

1. Open application in IntelliJ/Eclipse/STS
2. Open Terminal in the IDE
3. Run command : `./mvnw install dockerfile:build`
    Note : If not in iOS Enviroment, go to step 4
4. Run command : `/mvnw install dockerfile:build`
5. Run command : `docker-compose up`
6. Open POSTMAN or RESTClient (In Visual Code) 
7. Make a `POST` request to : `http://localhost:8080/authenticate`
    Add this object literal in body : 

    `{
	"username":"shiva",
	"password" : "bhaggan"
    }`

8. Copy the JWT from the response
9. Make a `GET` request to : `http://localhost:8080/load`
    Navigate to HEADERS if using postman and add the following KEY Value
    `Authorization` : `Bearer {add your copied token here}`
10. You will get a response with this message : `COMPLETED`
11. Run this command in terminal : `docker exec -it spring-security-jwt_mysqldb_1 mysql -uroot -p`
12. Enter password : `root`
13. go the database : `use batch` && `select * from student`
14. Congratulation you have executed your first application in docker