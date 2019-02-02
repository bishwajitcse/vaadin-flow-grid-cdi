package com.lausn.grid.cdi;

import javax.inject.Inject;

import com.lausn.grid.cdi.grid.page.GridPage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a simple label element and a template element.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow with CDI", shortName = "Project Base")
public class MainView extends VerticalLayout implements RouterLayout {

	
    public MainView() {
    	HorizontalLayout menu = new HorizontalLayout();
    	menu.setSpacing(true);
        menu.add(new RouterLink("Page 1", GridPage.class));
        menu.add(new RouterLink("Page 2", SimplePage.class));
    
    	add(menu);
    }

}
