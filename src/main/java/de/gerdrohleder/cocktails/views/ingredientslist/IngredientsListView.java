package de.gerdrohleder.cocktails.views.ingredientslist;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.gerdrohleder.cocktails.data.entity.Ingredient;
import de.gerdrohleder.cocktails.data.service.IngredientService;
import de.gerdrohleder.cocktails.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.artur.helpers.CrudServiceDataProvider;

import java.util.List;

@Route(value = "allIngredients", layout = MainView.class)
@PageTitle("Zutatliste")
@CssImport("./styles/views/ingredientslist/ingredientslist-view.css")
public class IngredientsListView extends Div {

//    private IngredientService ingredientService;
    private Grid<Ingredient> grid = new Grid<>(Ingredient.class);

    public IngredientsListView(@Autowired IngredientService ingredientService) {
        setId("ingredientlist-view");
        // Configure Grid

        grid.setColumns("id", "zname");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);
        grid.setHeightFull();
        grid.setDataProvider(new CrudServiceDataProvider<Ingredient, Void>(ingredientService));
        SplitLayout splitLayout = new SplitLayout();
        splitLayout.setSizeFull();

        createGridLayout(splitLayout);

        add(splitLayout);
        setSizeFull();
    }


    private void createGridLayout(SplitLayout splitLayout) {
        Div wrapper = new Div();
        wrapper.setId("grid-wrapper");
        wrapper.setWidthFull();
        splitLayout.addToPrimary(wrapper);
        wrapper.add(grid);
    }
}
