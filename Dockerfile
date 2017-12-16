FROM maven:3.5.2-jdk-8-slim
WORKDIR /app
COPY . /app
RUN mvn install -DskipTests=true
CMD ["java", "-jar", "/app/target/boot2-metrics.jar"]
