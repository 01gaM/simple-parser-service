FROM adoptopenjdk/openjdk11:ubi
#TODO create-service: rename your jar
ADD target/simple-parser-service.jar /app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=docker","/app.jar"]