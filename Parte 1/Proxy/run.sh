#!/usr/bin/env bash
mvn package;
java -jar target/Proxy-1.0-SNAPSHOT.jar
echo "*************************************"
echo "Terminado Proxy"
echo "*************************************"
