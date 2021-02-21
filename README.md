### get Started with project


### SETTING UP MONGODB
For getting started with MongoDB the steps to be followed are:

1. open up the command prompt and type mongod to start the MongoDB server.
2. Open up another shell and type mongo to connect to MongoDB database server.
3. We can create the new database 

### use Student_DB

4. We can create the collection by,
### db.createCollection("student_list")
5. Inserting data into the collection(optional)

### db.student_list.insert({rollno:1,name:"Devika",dob:"12-02-1997",stud_class="I",division:"A",gender:"Female"})  




### RUNNIG SPRING BOOT

After this we can run the Spring Boot application.To run the project move to the folder named back_end.For this we can use the Maven plugin.The Spring Boot Maven plugin includes a run goal which can be used to quickly compile and run the application.
### cd back_end
### mvn spring-boot:run

### RUNNING REACT
After the Spring Boot application run successfully,next we can run the React project.For that move to the location ui.

###  cd ui 
###  npm start

This would run the application in development mode.We can just navigate to http:localhost:8081 in any browser to preview the application.The page will automatically reload whenever it detects any code change in the source file.