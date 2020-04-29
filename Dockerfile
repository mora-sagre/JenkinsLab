FROM jenkins/jenkins:lts
USER root
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
RUN wget https://github.com/liquibase/liquibase/releases/download/liquibase-parent-3.5.5/liquibase-3.5.5-bin.tar.gz \
  && mkdir liquibase \
  && tar -xzf liquibase-3.5.5-bin.tar.gz -C liquibase \
  && ls -l \
  && mv liquibase/ /usr/local/bin/ \
  && rm -rf liquibase/ liquibase-3.5.5-bin.tar.gz
EXPOSE 8080