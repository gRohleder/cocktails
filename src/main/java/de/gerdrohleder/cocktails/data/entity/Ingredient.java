package de.gerdrohleder.cocktails.data.entity;

import de.gerdrohleder.cocktails.data.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient extends AbstractEntity {
    private String name;
}
