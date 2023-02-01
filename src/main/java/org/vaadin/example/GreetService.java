package org.vaadin.example;

import jakarta.enterprise.context.ApplicationScoped;

import com.vaadin.cdi.annotation.CdiComponent;

@ApplicationScoped
// bean discovery more is "annotated" by default in CDI 4.0
// to make it work with current impl of Vaadin CDI
// we need to place the annotation or add "bean-discovery-mode="all"" to
// beans.xml
//@CdiComponent
public class GreetService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }
}
