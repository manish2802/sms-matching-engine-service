FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar smsmatchingengineservice.jar

RUN apt-get update \
    && apt-get install -y curl \
    && curl -L \
       https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar \
       -o /app/opentelemetry-javaagent.jar \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

EXPOSE 9001

ENTRYPOINT ["java","-javaagent:/app/opentelemetry-javaagent.jar","-jar","smsmatchingengineservice.jar"]