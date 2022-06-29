FROM amazoncorretto:11

USER root

COPY target/scala-3*/lambda-*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]
