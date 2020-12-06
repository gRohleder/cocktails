package de.gerdrohleder.cocktails.data.entity;

import de.gerdrohleder.cocktails.data.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Assembly extends AbstractEntity {
    private int amount;
    private Unit unit;
    private Ingredient ingredient;
}
