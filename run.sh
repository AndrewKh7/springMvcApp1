#!/usr/bin/zsh
echo 'stop Tomcat'
mvn tomcat7:shutdown
echo "START TOMCAT"
mvn tomcat7:run