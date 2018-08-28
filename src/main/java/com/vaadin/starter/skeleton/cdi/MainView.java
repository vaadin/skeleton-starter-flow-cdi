package com.vaadin.starter.skeleton.cdi;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.inject.Inject;

/**
 * The main view contains a simple label element and a template element.
 */
@Route("")
public class MainView extends VerticalLayout {

    @Inject
    private MessageBean messageBean;

    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show(messageBean.getMessage()));
        add(button);
    }

}
