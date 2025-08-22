FROM openjdk:17-jdk-slim
 
LABEL maintainer="mudhenanarasimharao@gmail.com"
 
WORKDIR /app
 
COPY target/simple-hello-Narasimha-Error-1.0.0.jar simple-hello-Narasimha-Error-1.0.0.jar
 
EXPOSE 8080
 
ENTRYPOINT [ "java", "-jar", "simple-hello-Narasimha-Error-1.0.0.jar" ]
 