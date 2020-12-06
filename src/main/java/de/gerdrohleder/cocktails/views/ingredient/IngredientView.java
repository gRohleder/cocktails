package de.gerdrohleder.cocktails.views.ingredient;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.gerdrohleder.cocktails.views.main.MainView;

@Route(value = "ingredient", layout = MainView.class)
@PageTitle("ingredient")
@CssImport("./styles/views/ingredient/ingredient-view.css")

public class IngredientView extends Div {
    public IngredientView(){
        setId("ingredient-view");
        add(createTitle());
    }

    private Component createTitle() {
        return new H3("Zutat");
    }
}
