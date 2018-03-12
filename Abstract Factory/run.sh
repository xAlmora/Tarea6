#!/usr/bin/env bash
mvn package;
java -jar target/AbstractFactory-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Abstract Factory"
echo "*************************************"
