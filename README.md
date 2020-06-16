# Project Base for Vaadin Flow and CDI

This project can be used as a starting point to create your own Vaadin Flow application with CDI.
It contains all the necessary configuration and some placeholder files to get you started.

The best way to use it is via [vaadin.com/start](https://vaadin.com/start) - you can get only the necessary parts and choose the package naming you want to use.

## Running the Application

Import the project to the IDE of your choosing as a Maven project. 

Run application using
```
mvn clean package tomee:run
```

Open [http://localhost:8080/](http://localhost:8080/) in browser.

If you want to run your app locally in the production mode, run using
```
mvn clean package tomee:run -Pproduction
```

### Running Integration Tests

Integration tests are implemented using [Vaadin TestBench](https://vaadin.com/testbench). The tests take a few minutes to run and are therefore included in a separate Maven profile. We recommend running tests with a production build to minimize the chance of development time toolchains affecting test stability. To run the tests using Google Chrome, execute

`mvn verify -Pit,production`

and make sure you have a valid TestBench license installed.

### Deployment

The application is deployed on the [Apache TomEE](http://tomee.apache.org/) server via the `tomee-maven-plugin`, which supports hot deployment of code changes (via the `reloadOnUpdate` setting).
This means that you can make changes to the code in your IDE while the server is running, recompile, and have the server automatically pick up the changes and redeploy them.
This setting is enabled by default in this project.

One known limitation with hot deployment is that after deleting a `@Route`-annotated view, the route is are still navigable after automatic redeployment.
In such case, the application must be restarted to remove the route from the registry permanently.   

For documentation on using Vaadin Flow and CDI, visit [vaadin.com/docs](https://vaadin.com/docs/v14/flow/cdi/tutorial-cdi-basic.html)

For more information on Vaadin Flow, visit https://vaadin.com/flow.
