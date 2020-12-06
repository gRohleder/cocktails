package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Assembly;
import de.gerdrohleder.cocktails.data.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}