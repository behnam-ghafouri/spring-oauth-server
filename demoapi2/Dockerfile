FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/demoapi2-v1.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
