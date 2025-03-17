# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk

# Copy the application JAR file to the container
COPY build/libs/petstore-0.1-all.jar application.jar

# Specify the command to run the application
CMD ["java", "-jar", "/application.jar"]