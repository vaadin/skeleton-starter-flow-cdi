package org.vaadin.example;

import com.vaadin.cdi.annotation.RouteScopeOwner;
import com.vaadin.cdi.annotation.RouteScoped;

/**
 * Data provider bean scoped for each user session.
 */
@RouteScoped
@RouteScopeOwner(AnotherRoute.class)
public class GreetService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }
}
