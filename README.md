### Unit Test Training

## Build with gradle
<Gradle is currently in Desktop/tmp directory>
gradle build<br>
gradle test<br>
gradle cobertura<br>


## Build with Maven
mvn cobertura:cobertura<br>
-> code coverage report is under $PROJECT/target/site/cobertura/index.html


#Agenda
9.00 - 10.00 Test pyramid, what is a unit test, what is important in unit testing?


###Maven and Gradle


###Code coverage
mvn cobertura:cobertura


###Sonar
NOTE: there is a problem with Sonar on OSX.
Run the following: rvm use jruby

cd /Desktop/tmp/sonarqube-4.5.5/macosx-universal-64/bin
./sonar.sh start

First run: mvn cobertura:cobertura -Dcobertura.report.format=xml (--> sonar requires coverage.xml file to display unit tests)
Run Sonar job:  ~/Desktop/tmp/sonar-runner-2.3/bin/sonar-runner


###Test Doubles
Mocking


