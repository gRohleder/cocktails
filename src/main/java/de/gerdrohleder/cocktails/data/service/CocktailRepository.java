package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Assembly;
import de.gerdrohleder.cocktails.data.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {

}