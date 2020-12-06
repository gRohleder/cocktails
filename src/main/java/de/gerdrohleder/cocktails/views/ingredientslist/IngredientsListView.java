package de.gerdrohleder.cocktails.views.ingredientslist;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.gerdrohleder.cocktails.data.entity.Ingredient;
import de.gerdrohleder.cocktails.views.main.MainView;

@Route(value = "allIngredients", layout = MainView.class)
@PageTitle("Zutatliste")
@CssImport("./styles/views/ingredientslist/ingredientslist-view.css")
public class IngredientsListView extends Div {

    private Grid<Ingredient> grid;

    public IngredientsListView() {
        setId("ingredientlist-view");
        // Configure Grid
        grid = new Grid<>(Ingredient.class);
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
