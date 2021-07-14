FROM selenium/standalone-chrome

USER root

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

RUN apt-get update -qqy \
	&& apt-get install -y apt-transport-https \
	&& apt-get -qqy install maven \
	&& apt-get install -y openjdk-8-jdk maven
	 
RUN rm -rf /etc/maven/settings.xml
COPY settings.xml /etc/maven/	 

WORKDIR /home/seluser/

COPY pom.xml AutomacaoQA/

COPY giss-atual/pom.xml AutomacaoQA/giss-atual/
COPY giss-atual/lib/chromedriver/ AutomacaoQA/giss-atual/lib/chromedriver/
COPY giss-atual/src/ AutomacaoQA/giss-atual/src/

WORKDIR /home/seluser/AutomacaoQA/giss-atual

RUN mvn clean install -DskipTests

