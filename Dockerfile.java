FROM  eclipse-temurin:21 as builder

WORKDIR /src
COPY . .
USER root

RUN apt-get update && \
    apt-get install -y python3 python3-pip && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# USER gradle
# RUN gradle clean build

CMD [ "python3 -m http.server" ]