package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Ingredient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService extends CrudService<Ingredient, Integer> {

    private final IngredientRepository repository;

    @Override
    protected IngredientRepository getRepository() {
        return repository;
    }
}
