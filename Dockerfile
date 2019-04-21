FROM openjdk:8
WORKDIR /spring-app
COPY . /spring-app
EXPOSE 8080
EXPOSE 5432
CMD ["java", "-jar", "target/web-usecase-editor.jar"]

