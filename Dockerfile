FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} my_springboot_app.jar
ENTRYPOINT ["java","-jar","/my_springboot_app.jar"]
