package com.lausn.grid.cdi.grid.page;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.lausn.grid.cdi.dto.PersonBean;
import com.vaadin.cdi.annotation.UIScoped;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the grid-screen.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("grid-screen")
@HtmlImport("grid-screen.html")
@UIScoped
public class GridScreen extends PolymerTemplate<GridScreen.GridScreenModel> {

	private Grid<PersonBean> grid=new Grid<PersonBean>();
	
	@Id("load")
	private Button load;
	
	@Id("mainLayout")
	private VerticalLayout layout;
	
	@Inject
	private PersonService service;
	


	/**
     * Creates a new GridScreen.
     */
    public GridScreen() {
        // You can initialise any data required for the connected UI components here.
    }
    
    
    private void createGridColumns(){
    	grid.addColumn(PersonBean::getId).setHeader("Id");
    	grid.addColumn(PersonBean::getName).setHeader("Name");
    }
    
    @PostConstruct
    private void init(){
    	
    	createGridColumns();
    	layout.add(grid);
    	load.addClickListener(e->{
    			loadData();
    	});
    	
    }
    
    private void loadData(){
    	
    	// lazy loading data set
    	 DataProvider<PersonBean, Void> dataProvider = DataProvider.fromCallbacks(
                 query -> {
                     int offset = query.getOffset();
                     int limit = query.getLimit();
                     List<PersonBean> logs= service.findPerson(offset, limit);;
                     return logs.stream();
                 },
                 query -> service.count()
                 );
         grid.setDataProvider(dataProvider);
    	
    }
    

    /**
     * This model binds properties between GridScreen and grid-screen.html
     */
    public interface GridScreenModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
