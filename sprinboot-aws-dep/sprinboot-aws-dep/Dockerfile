FROM eclipse-temurin:17-jdk-alpine

RUN apk add --no-cache curl

VOLUME /tmp

COPY target/sprinboot-aws-dep.jar sprinboot-aws-dep.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sprinboot-aws-dep.jar"]
