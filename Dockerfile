FROM openjdk:11

WORKDIR /app

# Copy the jar file into our app
COPY ./target/Twillio-demo-0.0.1-SNAPSHOT.jar /app

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "Twillio-demo-0.0.1-SNAPSHOT.jar"]