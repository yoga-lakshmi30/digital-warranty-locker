FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN bash mvnw clean package -DskipTests

CMD ["sh", "-c", "java -Dserver.port=$PORT -jar target/digital-warranty-locker-0.0.1-SNAPSHOT.jar"]