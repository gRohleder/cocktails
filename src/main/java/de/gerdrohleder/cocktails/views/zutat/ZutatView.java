package de.gerdrohleder.cocktails.views.zutat;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.gerdrohleder.cocktails.views.main.MainView;

@Route(value = "zutat", layout = MainView.class)
@PageTitle("Zutat")
@CssImport("./styles/views/zutat/zutat-view.css")

public class ZutatView extends Div {
    public ZutatView(){
        setId("zutat-view");
        add(createTitle());
    }

    private Component createTitle() {
        return new H3("Zutat");
    }
}
