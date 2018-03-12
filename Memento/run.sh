#!/usr/bin/env bash
mvn package;
java -jar target/Memento-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Memento"
echo "*************************************"
