#!/bin/sh
mvn clean package && docker build -t org.example/thread-counter .
docker rm -f thread-counter || true && docker run -d -p 8080:8080 -p 4848:4848 --name thread-counter org.example/thread-counter 
