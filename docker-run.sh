docker build -f src/main/docker/Dockerfile.jvm -t pancix/quarkus-simplerest .
docker run -i -d --rm -p 8080:8080 --name simplerest pancix/quarkus-simplerest

