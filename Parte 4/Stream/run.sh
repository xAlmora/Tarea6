#!/usr/bin/env bash
mvn package;
java -jar target/Stream-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Stream"
echo "*************************************"
