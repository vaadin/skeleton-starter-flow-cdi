# Project Base for Vaadin Flow 24.0 and CDI 15.0 

This project can be used as a starting point to create your own Vaadin Flow 24.0 application with CDI 15.0.
It contains all the necessary configuration and some placeholder files to get you started.

Vaadin 24.0 is based on Jakarta EE 10.0 and requires Java 17.

The best way to use it is via [vaadin.com/start](https://vaadin.com/start) - you can get only the necessary parts and choose the package naming you want to use.

## Running the Application

Import the project to the IDE of your choosing as a Maven project. 

Run application using
```
mvn wildfly:run
```

Open [http://localhost:8080/](http://localhost:8080/) in browser.

If you want to run your app locally in the production mode, run using
```
mvn clean package wildfly:run -Pproduction
```

### Running Integration Tests

Integration tests are implemented using [Vaadin TestBench](https://vaadin.com/testbench). The tests take a few minutes to run and are therefore included in a separate Maven profile. We recommend running tests with a production build to minimize the chance of development time toolchains affecting test stability. To run the tests using Google Chrome, execute

`mvn verify -Pit,production`

and make sure you have a valid TestBench license installed.

### Deployment

The project is a standard Java/Jakarta EE application, so you can deploy it as you see best, via IDE or using Maven plugins. Wildfly and TomEE plugins are pre-configured for easy testing. Wildfly plugin is used for integration tests. Currently only Wildfly properly supports Java 17.

The application can be deployed on the [Apache TomEE](http://tomee.apache.org/) server via the `tomee-maven-plugin`, which supports hot deployment of code changes (via the `reloadOnUpdate` setting).
This means that you can make changes to the code in your IDE while the server is running, recompile, and have the server automatically pick up the changes and redeploy them.
This setting is enabled by default in this project.

One known limitation with hot deployment is that after deleting a `@Route`-annotated view, the route is are still navigable after automatic redeployment.
In such case, the application must be restarted to remove the route from the registry permanently.   

For documentation on using Vaadin Flow and CDI, visit [vaadin.com/docs](https://vaadin.com/docs/v14/flow/cdi/tutorial-cdi-basic.html)

For more information on Vaadin Flow, visit https://vaadin.com/flow.
