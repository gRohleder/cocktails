package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Assembly;
import de.gerdrohleder.cocktails.data.entity.Cocktail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
@RequiredArgsConstructor
public class CocktailService extends CrudService<Cocktail, Integer> {

    private final CocktailRepository repository;

    @Override
    protected CocktailRepository getRepository() {
        return repository;
    }

}
