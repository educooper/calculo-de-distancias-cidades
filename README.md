<h1 align="center">Projeto - Calculo de Distância entre Cidades</h1>

<p align="center">
  <img alt="Github top language" src="https://img.shields.io/github/languages/top/educooper/calculo-de-distancias-cidades?color=green"> 
  <img alt="Github language count" src="https://img.shields.io/github/languages/count/educooper/calculo-de-distancias-cidades?color=56BEB8">
 <img alt="Repository size" src="https://img.shields.io/github/repo-size/educooper/calculo-de-distancias-cidades?color=56BEB8">


<hr>


<p align="center">
  <a href="#dart-about">About</a> &#xa0; | &#xa0; 
  <!-- <a href="#sparkles-features">Features</a> &#xa0; | &#xa0; -->
  <a href="#rocket-technologies">Technologies</a> &#xa0; | &#xa0;
  <a href="#white_check_mark-requirements">Requirements</a> &#xa0; | &#xa0;
  <a href="#checkered_flag-starting">Starting</a> &#xa0; | &#xa0;
  <!-- <a href="#memo-license">License</a> &#xa0; | &#xa0; -->
  <a href="https://github.com/educooper" target="_blank">Author</a>
</p>


<br>

## :dart: About / Sobre ##

Neste projeto pude acompanhar e executar implementação de API JAVA em Springboot para calculo de distância entre cidades baseadas em geolocalização. 

## :rocket: Technologies / Tecnologias ##

* GNU Linux (Windows 10 requer passos adicionais)
* Git
* Java 8 (Instale o JDK CORRETO)
* Maven
* Docker
* IntelliJ Community
* Spring Data JPA
* PostgreSQL Driver
* Heroku CLI

## :bookmark_tabs: Enviroment Preparations / Preparação do Ambiente

### Postgres

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=docker -e POSTGRES_DB=cities postgres
```

### Populate

* [data - Vamos atribuir estrelas a este gênio](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

```shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
/* SUBSTITUA PELO TRECHO docker run --rm -v "%cd%": no CMD DO RWINDOWS*/

psql -h localhost -U postgres cities -f /tmp/pais.sql
psql -h localhost -U postgres cities -f /tmp/estado.sql
psql -h localhost -U postgres cities -f /tmp/cidade.sql

psql -h localhost -U postgres cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

* [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)
* [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)
* [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)
* [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)
* [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)

### Accessando

```shell script
docker exec -it cities-db /bin/bash

psql -U postgres cities
```

### Exemplos de Pesquisa de Query Earth Distance

Point
```sh
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube
```sh
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Propriedades

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Tipos

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

### Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

### QA / Code Quality

* PMD

+ https://pmd.github.io/pmd-6.8.0/index.html

* Checkstyle

+ https://checkstyle.org/

+ https://checkstyle.org/google_style.html

+ http://google.github.io/styleguide/javaguide.html

```shell script
wget https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
```

Obrigado a Digital Innovation One,
Obrigado ao [andrelugomes (André Luis Gomes) (github.com)](https://github.com/andrelugomes) 

<a href="#top">Voltar ao Topo</a>
