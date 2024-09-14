FROM openjdk:17
EXPOSE 9090
COPY target/springboot-docker.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java", "-jar", "/springboot-docker.jar"]