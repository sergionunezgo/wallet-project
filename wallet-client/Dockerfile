FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY build/libs/wallet-client-1.0.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=container","/app.jar"]