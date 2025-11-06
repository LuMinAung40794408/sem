FROM eclipse-temurin:24
COPY ./target/alpha-0.1.0.4-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "alpha-0.1.0.4-jar-with-dependencies.jar"]