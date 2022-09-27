package org.vaadin.example;

import java.util.UUID;

import com.vaadin.cdi.annotation.RouteScoped;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RoutePrefix;
import com.vaadin.flow.router.RouterLayout;

@Route("")
@RoutePrefix("parent")
@RouteScoped
public class ParentView extends VerticalLayout implements RouterLayout {

    public ParentView() {
        String uuid = UUID.randomUUID().toString();
        Paragraph paragraph = new Paragraph("parent layout = " + uuid);
        add(paragraph);
    }
}
