docker build -f src/main/docker/Dockerfile.jvm -t quarkus-simplerest .
docker run -i -d --rm -p 8080:8080 --name simplerest quarkus-simplerest

