package com.vaadin.starter.skeleton.cdi;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import javax.inject.Inject;

/**
 * Simple template example.
 */
@Tag("example-template")
@HtmlImport("src/example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleTemplate.ExampleModel> {

    /**
     * Template model which defines the single "value" property.
     */
    public interface ExampleModel extends TemplateModel {

        void setValue(String name);
    }

    @Inject
    public ExampleTemplate(MessageBean bean) {
        // Set the initial value to the "value" property.
        getModel().setValue(bean.getMessage());
    }

    public void setValue(String value) {
        getModel().setValue(value);
    }
}
