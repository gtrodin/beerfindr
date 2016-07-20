FROM jboss/wildfly:latest

ADD deploy/beerfindr.war /opt/jboss/wildfly/standalone/deployments/
ADD config/standalone.xml /opt/jboss/wildfly/standalone/configuration/

USER jboss

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]