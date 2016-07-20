First create the mysql docker container
```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=beerfindr -e MYSQL_USER=gustav -e MYSQL_PASSWORD=password -d mysql:latest --character-set-server=utf8 --collation-server=utf8_unicode_ci
```
When creating a new mysql container remember to set the IP of the new container to the persistence.xml to get local testing working.

```
docker inspect <container-name> | egrep IP
```
Second start a new app server container with the beerfindr image (Linking mysql container)
```
docker run -it --name appserver --link mysql:mysql -v /home/gustav/development/personal/beerfindr/docker-dir/deploy:/opt/jboss/wildfly/standalone/deployments/:rw -p 8080:8080 -p 9990:9990 beerfindr
```

Second start a new app server container with the beerfindr image (Linking postgres container)
```
docker run -it --name appserver --link postgres:postgres -v /home/gustav/development/personal/beerfindr/docker-dir/deploy:/opt/jboss/wildfly/standalone/deployments/:rw -p 8080:8080 -p 9990:9990 beerfindr
```

