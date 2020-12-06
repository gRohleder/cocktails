package de.gerdrohleder.cocktails.data.service;

import de.gerdrohleder.cocktails.data.entity.Assembly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssemblyRepository extends JpaRepository<Assembly, Integer> {

}