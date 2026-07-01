FROM maven:3.9.16-eclipse-temurin-25-alpine AS  build
WORKDIR /build
COPY src /build/src
COPY pom.xml /build/pom.xml
RUN mvn clean package

FROM eclipse-temurin:25-jre-alpine
COPY --from=build /build/target/*.jar /opt/app.jar
CMD ["java","-jar","/opt/app.jar"]
