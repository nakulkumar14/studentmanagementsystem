FROM openjdk:11.0.14.1-jdk
MAINTAINER nakulkumar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]