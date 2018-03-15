#!/usr/bin/env bash
mvn package;
java -jar target/Factory-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Factory"
echo "*************************************"
