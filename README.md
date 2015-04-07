# spring-webapp-no-xml

A simple Spring webapp project that demonstrates Spring configuration with Java-only configuration (no-xml).

## Build WAR
* `mvn package` - builds a war file, e.g. `target/spring-webapp-no-xml.war`

## Run Example
* `mvn tomcat7:run` - runs the application in embedded Tomcat7, as specified in `pom.xml`, or
* Copy `target\spring-webapp-no-xml.war` to a running Tomcat7 (Tomcat8) instance.

