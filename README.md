# Project Base for Vaadin Flow and CDI

This project can be used as a starting point to create your own Vaadin Flow application with CDI.
It contains all the necessary configuration and some placeholder files to get you started.

The best way to use it is via [vaadin.com/start](https://vaadin.com/start) - you can get only the necessary parts and choose the package naming you want to use.

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

For documentation on using Vaadin Flow and CDI, visit [vaadin.com/docs](https://vaadin.com/docs/v14/flow/cdi/tutorial-cdi-basic.html)

For more information on Vaadin Flow, visit https://vaadin.com/flow.
