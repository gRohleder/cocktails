package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Assembly;
import de.gerdrohleder.cocktails.data.entity.Ingredient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
@RequiredArgsConstructor
public class AssemblyService extends CrudService<Assembly, Integer> {

    private final AssemblyRepository repository;

    @Override
    protected AssemblyRepository getRepository() {
        return repository;
    }

}
