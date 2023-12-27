FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY demoapi2/pom.xml .
COPY demoapi2/src ./src
RUN mvn package

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY demoapi2/src/main/resources/keystore.p12 /app/keystore.p12
COPY --from=builder /app/target/demoapi2-v1.jar /app/app.jar
EXPOSE 443
CMD ["java", "-jar", "app.jar"]
