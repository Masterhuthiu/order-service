# ===== Stage 1: Build =====
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /build
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw
RUN ./mvnw -B -DskipTests -Dproperties.skip=true package


COPY src src
RUN ./mvnw -B -DskipTests package

# ===== Stage 2: Run =====
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

COPY --from=build /build/target/*.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/app/app.jar"]
