#!/usr/bin/env bash
mvn package;
java -jar target/Visitor-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Visitor"
echo "*************************************"
