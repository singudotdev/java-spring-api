# Spring API
## The ultimate template for starting a Java API with Spring


This is an API that uses Spring Boot 3, Spring Security 6, Swagger/OpenAPI 3 and Logstash.
Will add elasticsearch in the future in roder to use PostgreSQL, Elasticsearch and MongoDB.

How to deploy with Docker Compose:
```sh
docker compose up -d
```

To stop the deployment:
```sh
docker compose down
```


This API is intended to be used with the ELK Stack in order to centralize logs,
so you will need to deploy it also. If not, you must update the code.

Docker ELK: https://github.com/deviantony/docker-elk
