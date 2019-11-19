docker build -f src/main/docker/Dockerfile.dev -t quarkus-simplerest .
docker run -i -d --rm -p 8080:8080 -v $(pwd)/src/:/home/quarkus/dev/src --name simplerest quarkus-simplerest

