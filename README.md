# Introduction
Welcome to Call For Service Spring Microservices  

# Software needed
1.	[Apache Maven] (http://maven.apache.org). Extremely popular, Maven is build tool in use in the Java ecosystem.
2.	[Docker] (http://docker.com). 
3.	[Git Client] (http://git-scm.com).

# Building the Docker Images for CFS

To build the code of CFS as a docker image, open a command-line window and change to the directory CallForService

Run the following maven command

   ```bash
   mvn clean package docker:build
   ```