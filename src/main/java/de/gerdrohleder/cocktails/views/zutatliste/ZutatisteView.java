package de.gerdrohleder.cocktails.views.zutatliste;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import de.gerdrohleder.cocktails.data.entity.Person;
import de.gerdrohleder.cocktails.data.service.PersonService;
import de.gerdrohleder.cocktails.views.main.MainView;

@Route(value = "allZutaten", layout = MainView.class)
@PageTitle("Zutatliste")
@CssImport("./styles/views/zutatliste/zutatliste-view.css")
public class ZutatisteView extends Div {

    private Grid<Person> grid;

    public ZutatisteView() {
        setId("zutatliste-view");
        // Configure Grid
        grid = new Grid<>(Person.class);
        grid.setColumns("firstName", "lastName");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);
        grid.setHeightFull();

        add(createGridLayout());
    }

    private Div createGridLayout() {
        Div wrapper = new Div();
        wrapper.setId("grid-wrapper");
        wrapper.setWidthFull();
        wrapper.add(grid);
        return wrapper;
    }
}
