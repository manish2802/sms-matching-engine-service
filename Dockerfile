FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar smsmatchingengineservice.jar

EXPOSE 9001

ENTRYPOINT ["java","-jar","smsmatchingengineservice.jar"]