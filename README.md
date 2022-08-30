# myproject2

Minimal Helidon MP project suitable to start from scratch.

## Build and run


With JDK17+
```bash
mvn package
java -jar target/myproject2.jar
```

## Exercise the application
```
curl -X GET http://localhost:8080/simple-greet
{"message":"Hello World!"}
```

```
curl -X GET http://localhost:8080/employees
[{"department":"IT","eid":"101","email":"A@gmail.com","firstName":"A","gender":"male","lastName":"A"},{"department":"Sales","eid":"102","email":"B@gmail.com","firstName":"B","gender":"male","lastName":"B"},{"department":"Sales","eid":"103","email":"C@gmail.com","firstName":"C","gender":"male","lastName":"C"},{"department":"Management","eid":"104","email":"D@gmail.com","firstName":"D","gender":"male","lastName":"D"},{"department":"IT","eid":"105","email":"E@gmail.com","firstName":"E","gender":"male","lastName":"E"}]

curl -X GET http://localhost:8080/employees/101
{"department":"IT","eid":"101","email":"A@gmail.com","firstName":"A","gender":"male","lastName":"A"}

curl -X GET http://localhost:8080/employees/department/IT
[{"department":"IT","eid":"101","email":"A@gmail.com","firstName":"A","gender":"male","lastName":"A"},{"department":"IT","eid":"105","email":"E@gmail.com","firstName":"E","gender":"male","lastName":"E"}]

curl -X GET http://localhost:8080/employees/department/Sales
[{"department":"Sales","eid":"102","email":"B@gmail.com","firstName":"B","gender":"male","lastName":"B"},{"department":"Sales","eid":"103","email":"C@gmail.com","firstName":"C","gender":"male","lastName":"C"}]
```

For more information on available configuration options see the helidon-maven-plugin documentation.
                                
