#!/usr/bin/env bash
mvn package;
java -jar target/Decorator-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Decorator"
echo "*************************************"
