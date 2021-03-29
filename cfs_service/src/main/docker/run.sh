#!/bin/sh

echo "********************************************************"
echo "Starting CFS Service"
echo "********************************************************"
java -Dspring.profiles.active=$PROFILE -jar /usr/local/cfs_service/@project.build.finalName@.jar