#!/usr/bin/env bash
mvn package;
java -jar target/LambdaExpressions-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado LambdaExpressions"
echo "*************************************"
