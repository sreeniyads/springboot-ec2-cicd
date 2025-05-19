FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/springboot-ec2-cicd-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]