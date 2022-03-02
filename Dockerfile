FROM openjdk:11
WORKDIR /App
COPY ./target/users-0.0.1-SNAPSHOT.war /App/app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.war"]
