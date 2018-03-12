#!/usr/bin/env bash
mvn package;
java -jar target/Adapter-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Adapter"
echo "*************************************"
