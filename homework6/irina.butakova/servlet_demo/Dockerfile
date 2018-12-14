FROM tomcat:8-jre11
MAINTAINER  irina butakova allegr12@gmail.com
COPY ["target/servlet_demo-0.0.1-SNAPSHOT.war", "/usr/local/tomcat/webapps/servlet_demo.war"]
ENTRYPOINT ["catalina.sh", "jpda", "run"]
