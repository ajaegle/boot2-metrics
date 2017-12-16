FROM maven:3.5.2-jdk-8
WORKDIR /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "/app/target/boot2-metrics.jar"]
