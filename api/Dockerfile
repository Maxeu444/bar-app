# Utilisez une image de base Java 17
FROM openjdk:17-jdk-alpine

# Variable pour faciliter la mise à jour de la version de l'application
ARG JAR_FILE=target/*.jar

# Copiez le jar de l'application dans le conteneur
COPY ${JAR_FILE} app.jar

# Exposez le port sur lequel votre application s'exécute
EXPOSE 8080

# Commande pour exécuter votre application
ENTRYPOINT ["java","-jar","/app.jar"]