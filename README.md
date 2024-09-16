# springboot-app-docker

Step 1- Created springbooot project in which one controller method (welcome) is available with url mapping /welcome.

Step 2- I created Dockerfile as well in this project(RightClick on project-->new--->file--->DockerFile)

Step 3-  I psuh our project on github

**Now We are moving towards our setup for Application Deployement on Docker**

**Tools Using- AWS for our virtual machine like Ubuntu and to connect with this ubuntu machine , i am using MobaXterm application**

Step 1- I created virtaul machine instance on AWS 

Step 2- Connected MabaXterm with ubuntu (Using public IP address of ubutu)

Step 3- Install Docker on ubuntu machine

**command to install docker is - curl -fsSL get.docker.com | /bin/bash**

**Verify docker installation**
**sudo docker --version**

Step 4- now clne  application project from github to local  machine(Ubuntu)
**git clone giturl**

step 5- Build docker images
**sudo docker build -t imagename .**

Step 6-We can see list of images
**sudo docker images**

Step 7- Run docker images
**sudo docker run imagename**

**These below are improtant command i have used**

# display docker images available in our machine
sudo docker images

# Remove docker image
sudo docker rmi <image-name/image-id>

# Display Running Docker containers
sudo docker ps

# Display stopped docker containers
sudo docker ps -a

# Remove container
sudo docker rm <container-id>

# Download docker image
sudo docker pull <image-name>

# Login into Docker Hub Account
$ sudo docker login

# Push Docker Image to Docker Hub
$ sudo docker push <tag-name>



