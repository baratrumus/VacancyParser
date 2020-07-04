[![Build Status](https://travis-ci.org/baratrumus/VacancyParser.svg?branch=master)](https://travis-ci.org/baratrumus/VacancyParser)
[![codecov](https://codecov.io/gh/baratrumus/VacancyParser/branch/master/graph/badge.svg)](https://codecov.io/gh/baratrumus/VacancyParser)

## Application Vacancy parser 

This console App parses java vacancies from job sites. In fact, at the current time only from one site - sql.ru. But going to extend. Parser uses Quartz scheduler with cron timer, so you can set your own shedule and parser at first launch will collect vacancies from begining of the year, next times will update info from the last time with Postgresql DB. 


#### Technologies

* PostgreSQL, JDBC
* Quartz Scheduler
* Jsoup for parsing
* SL4J, LOG4J
* Travis CI
* Maven 


#### Details

Parser collects data only with java vacancies, not javascript.
All config parameters are situated in app.properties file
Without any doubts you can change cron trigger time and DB credentials in app.properties 
 
 
#### Local run 

* Clone project. 
* You are to have JDK, Maven, Tomcat installed.
* Also you need PostgreSql. Create empty base named tracker. Or set your name in app.properties
* Run ParcerLocalRun.but from app folder 
* Just wait and parser will start in one minute after install


TO DO:
Create sb app with web face and append hh.ru as parsed site.


 
 
 