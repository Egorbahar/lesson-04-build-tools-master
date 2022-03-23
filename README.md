# Maven Task: Lesson 4 Build Tools

Import lesson-4-build-tools project as a maven project

1. run project as **mvn clean package**
	- build should fail with a compilation failure
	
2. add **commons-lang** dependency to the pom.xml file
	- re-run **mvn clean package** command
	- build should fail due to test failure (compilation should pass successfully this time)
	
3. check test results in target/surefire-reports folder
	- fix failing test by providing a valid postcode value
	- re-run **mvn clean package** command
	- build should be successful this time
	- check test results in target/surefire-reports folder
	
4. check that jar file was created inside a target folder
    - run **java -jar ./target/lesson-4-build-tools-1.0.0-SNAPSHOT.jar** to run your application on jetty server
    - open **http://localhost:8080/lesson-4-build-tools** address in browser 
    - test available-address-resource by providing a postcode
    - make sure Response Body is returned with populated JSON object
    - read more about swagger API http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
    
 5. add the last version of **maven-checkstyle-plugin** to the pom file
    - run **mvn clean checkstyle:check** to generate a report
    - check the report with errors in generated checkstyle-result.xml file under target folder
    
6. build a dependency tree of a project 

		