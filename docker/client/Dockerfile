FROM openjdk:8

# Loading the executable server inside the image
COPY ./tcf-client-1.0-SNAPSHOT-jar-with-dependencies.jar ./tcf-client.jar

# Mounting a local directory to support file loading in the shell
VOLUME /host

# Running the client using the starting shell script
ENTRYPOINT ["java", "-jar", "./tcf-client.jar"]

# Default arguments to be forwarded to the entry point
CMD ["localhost", "8080"]
