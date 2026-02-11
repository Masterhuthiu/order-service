# ===== Stage 1: Build =====
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /build

# Copy toàn bộ source luôn (đơn giản & đúng)
COPY . .

# Skip sonar + test khi build Docker
RUN ./mvnw -B -DskipTests -Dsonar.skip=true package


# ===== Stage 2: Run =====
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

COPY --from=build /build/target/*.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/app/app.jar"]
