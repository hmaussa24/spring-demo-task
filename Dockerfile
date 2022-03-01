FROM openjdk:11
WORKDIR /App
COPY ./target/users-0.0.1-SNAPSHOT.jar /App/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.jar"]
