# Voting Machine Java Application 

A simple terminal-based voting machine system built in Java. Cast votes, view results, and manage via an admin panel. Includes Dockerfile and Jenkinsfile for CI/CD.

## Features
- Add votes for candidates
- Display current results
- Reset voting system
- Simple CLI interaction

## Run
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.voting.App"
```

## Docker
```bash
docker build -t voting-machine-app .
docker run -it voting-machine-app
```

## CI/CD with Jenkins
Pipeline includes:
- Build
- Test
- Package
- Docker build
