cloud-config-server:
==================
1. Its Spring-Cloud-Config server, which is basically spring-boot application.
2. It runs at port: **8888** by default.
3. start this boot application as "./gradlew bootRun"

### Basic Info:
1. To check/modify server port (by default, its 8888), please check @ [src/main/resources/application.yml](src/main/resources/application.properties)

### Below are Test URLs:

1. [http://localhost:8888/sample/development] (http://localhost:8888/sample/development)
2. [http://localhost:8888/sample/e2e] (http://localhost:8888/sample/e2e)
3. [http://localhost:8888/sample/production] (http://localhost:8888/sample/production)

test-application-a :

1. [http://localhost:8888/application-a/development] (http://localhost:8888/application-a/development)
2. [http://localhost:8888/application-a/e2e] (http://localhost:8888/application-a/e2e)
3. [http://localhost:8888/application-a/production] (http://localhost:8888/application-a/production)

test-application-b :

1. [http://localhost:8888/application-b/development] (http://localhost:8888/application-b/development)
3. [http://localhost:8888/application-b/e2e] (http://localhost:8888/application-b/e2e)
4. [http://localhost:8888/application-b/production] (http://localhost:8888/application-b/production)
