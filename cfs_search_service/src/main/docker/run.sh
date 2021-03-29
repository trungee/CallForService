#!/bin/sh

echo "********************************************************"
echo "Starting CFS Search Service"
echo "********************************************************"
java -Dspring.profiles.active=$PROFILE -jar /usr/local/cfs_search_service/@project.build.finalName@.jar