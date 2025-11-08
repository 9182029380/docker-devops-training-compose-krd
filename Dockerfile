# Step 1: Use a base image with JDK 17
FROM eclipse-temurin:17-jdk-jammy

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY target/*.jar app.jar

# Step 4: Expose port 5000
EXPOSE 5000

# Step 5: Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
