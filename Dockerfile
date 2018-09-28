FROM 100.125.16.65:20202/hwcse-cn-south-1/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/cse-spring-demo-0.0.1-snapshot.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]