package org.vaadin.example;

import java.util.UUID;

import com.vaadin.cdi.annotation.RouteScoped;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@RouteScoped
@Route(value = "B", layout = ParentView.class)
public class ChildBView extends VerticalLayout {

    public ChildBView() {
        String uuid = UUID.randomUUID().toString();
        Paragraph paragraph = new Paragraph("child B = " + uuid);
        add(paragraph);
        add(new RouterLink("Go to A", ChildAView.class));
    }
}
