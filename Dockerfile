FROM openjdk:latest
COPY ./target/DevOpsLAB-1.0-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "DevOpsLAB-1.0-SNAPSHOT.jar"]