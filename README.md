# Liquibase Demo
 
## Prerequisites

General:

* Grails 3.3.2
* Codenarc 0.26.0
* Postgresql 9.5

## Description

This APP is used to demonstrate the usage of Grails Database Migration plugin 
and encourage people to start using it. 

## Run the app 

### Locally
To run the app locally you will need to have JDK 8 as well as Postgresql 9.5 installed. Also you will need to make sure
that your database is configured and use the user/roles rules as they defined by ESG. To make it easier use the database 
names, schema users as they are defined in the [config/application.yml](https://bitbucket.org/university-of-york/esg-liquibase-demo/src/master/config/application.yml)

You can now start the application normally

### Run with docker
In the repo you can find a `docker-compose.yml` file with the right services for the app to work. After you install 
docker and docker compose, all you have to do is:

1. Navigate into the repo in your local directory and run `docker-compose up`. This will fire up all the services needed 
for the app(web and db). Also when you run it for first time it will create all the necessary users/roles for you
2. Then from the terminal run `docker exec -it -u grails esgliquibasedemo_web_1 bash`(esgliquibasedemo_web_1 is 
the name of the container which might be different if you are not using the same directory name as the repository). This 
will open a terminal inside the container.
3. Now you will need to navigate to `/app` directory inside the container and run the application normally as you would 
do with gradle typing `./gradlew bootRun` 

## Database migrations

This project is configured to work with [Grails Migration Plugin](http://plugins.grails.org/plugin/grails/database-migration)
It will automatically run the migrations, located in the `grails-app/migrations` directory and are registered 
in the `grails-app/migrations/changelog.groovy` file, on startup. If for any reason you would rather not to do so, 
you will need to disable them by setting `updateOnStart: false` in `config/application.yml` file

### How to use Grails Migration Plugin 
* Add a new migration comparing GORM with your DB
    ``grails dbm-gorm-diff <<filename>> --defaultSchema=workorder_csv_generator --add``
    
* Run migrations 
    ``grails dbm-update --dataSource=migrations``
    
* Add new empty migration 
    At the moment there is a bug at the `dbm-add-migration` grails command so this should be done manually.
    1. Create a groovy file into migrations folder
    2. Give an ID to the `changeSet` that you create
    3. Include the file name at the main `changelog.groovy` file

Please see [grails-commands.sh](https://bitbucket.org/university-of-york/esg-liquibase-demo/src/master/notes/grails-commands.sh)
