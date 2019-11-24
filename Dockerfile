FROM tomcat:8.0

MAINTAINER trabalho-sidnei

COPY ./dist/Lanchonete.war /usr/local/tomcat/webapps/
