FROM maven:3.8.5-openjdk-17 AS maven_build
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
CMD java -jar /data/demoapi2-0.0.1-SNAPSHOT.jar
COPY --from=maven_build /tmp/target/demoapi2-0.0.1-SNAPSHOT.jar /data/demoapi2-0.0.1-SNAPSHOT.jar