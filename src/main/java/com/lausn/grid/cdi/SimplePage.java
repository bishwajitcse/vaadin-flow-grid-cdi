package com.lausn.grid.cdi;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.cdi.annotation.UIScoped;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the simple-page.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("simple-page")
@HtmlImport("simple-page.html")
@Route(value = "page2", layout = MainView.class)
@UIScoped
public class SimplePage extends PolymerTemplate<SimplePage.SimplePageModel> {


	/**
     * Creates a new SimplePage.
     */
    public SimplePage() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between SimplePage and simple-page.html
     */
    public interface SimplePageModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
