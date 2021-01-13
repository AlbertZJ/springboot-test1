FROM hub.c.163.com/dwyane/openjdk:8
VOLUME /tmp
ADD springboot-test1-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/app.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
MAINTAINER albertZJ
