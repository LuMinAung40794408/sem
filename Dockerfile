FROM openjdk:18
COPY target/DevOpsLAB-1.0-SNAPSHOT-jar-with-dependencies.jar DevOpsLAB-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "DevOpsLAB-1.0-SNAPSHOT-jar-with-dependencies.jar"]