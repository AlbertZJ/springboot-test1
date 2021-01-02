FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD springboot-test1-0.0.1-SNAPSHOT.jar /my_test.jar
RUN bash -c 'touch /my_test.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/app.jar"]
EXPOSE 8081
ENTRYPOINT ["java","-jar","/my_test.jar"]
MAINTAINER albertZJ
