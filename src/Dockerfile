# Use the official OpenJDK 21 image to run the application
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the build stage to the working directory
COPY --from=build /app/target/restuarant-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 to allow external access to the application
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]