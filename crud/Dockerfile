# FROM openjdk:8-alpine
# RUN mkdir -p /opt/crud
# WORKDIR /opt/crud
# COPY crud/target/crud-0.0.1-SNAPSHOT.jar /opt/crud
# CMD ['java', '-jar', 'crud-0.0.1-SNAPSHOT.jar']
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/crud-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]