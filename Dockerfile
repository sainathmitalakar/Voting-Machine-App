FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN ./mvnw clean package -DskipTests
CMD ["java", "-cp", "target/classes", "com.voting.App"]
