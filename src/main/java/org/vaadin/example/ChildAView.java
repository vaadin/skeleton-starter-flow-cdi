package org.vaadin.example;

import java.util.UUID;

import com.vaadin.cdi.annotation.RouteScoped;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@RouteScoped
@Route(value = "A", layout = ParentView.class)
public class ChildAView extends VerticalLayout {

    public ChildAView() {
        String uuid = UUID.randomUUID().toString();
        Paragraph paragraph = new Paragraph("child A = " + uuid);
        add(paragraph);
        add(new RouterLink("Go to B", ChildBView.class));
    }
}
