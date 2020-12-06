package de.gerdrohleder.cocktails.data.entity;

import de.gerdrohleder.cocktails.data.AbstractEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Cocktail extends AbstractEntity {
    @ManyToMany(targetEntity = Assembly.class)
    @JoinTable(name="Cocktail_Assembly")
    private List<Assembly> assemblies;
}
