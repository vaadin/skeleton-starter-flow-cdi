package org.vaadin.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }
}
