package com.lausn.grid.cdi.grid.page;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.lausn.grid.cdi.MainView;
import com.vaadin.cdi.annotation.UIScoped;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "page1", layout = MainView.class)
public class GridPage extends VerticalLayout {
	
	private static final long serialVersionUID = 7678026580145800891L;
	
	@Inject GridScreen gridScreen;
	
	
	public GridPage(){
		
	}
	
	@PostConstruct
	private void init(){
		add(gridScreen);
	}
}
