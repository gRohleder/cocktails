package de.gerdrohleder.cocktails.data.generator;

import com.vaadin.flow.spring.annotation.SpringComponent;

import de.gerdrohleder.cocktails.data.entity.Ingredient;
import de.gerdrohleder.cocktails.data.service.IngredientRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.vaadin.artur.exampledata.DataType;
import org.vaadin.artur.exampledata.ExampleDataGenerator;

@SpringComponent
public class DataGenerator {

    @Bean
    public CommandLineRunner loadIngredientData(IngredientRepository repository) {
        return args -> {
            Logger logger = LoggerFactory.getLogger(getClass());
            if (repository.count() != 0L) {
                logger.info("Using existing ingredients");
                return;
            }
            int seed = 123;

            logger.info("Generating demo ingredients data");

            logger.info("... generating basic ingredients entities...");
            repository.save(Ingredient.builder().name("Gin").build());
            repository.save(Ingredient.builder().name("Blue Curacao").build());
            repository.save(Ingredient.builder().name("Zitronenlimonade").build());


            logger.info("Generated demo data");
        };
    }

    @Bean
    public CommandLineRunner loadData(IngredientRepository repository) {
        return args -> {
            Logger logger = LoggerFactory.getLogger(getClass());
            if (repository.count() != 0L) {
                logger.info("Using existing ingredients");
                return;
            }
            int seed = 123;

            logger.info("Generating demo ingredients data");

            logger.info("... generating 5 ingredients entities...");
//            ExampleDataGenerator<Person> personRepositoryGenerator = new ExampleDataGenerator<>(Person.class);
//            personRepositoryGenerator.setData(Person::setId, DataType.ID);
//            personRepositoryGenerator.setData(Person::setFirstName, DataType.FIRST_NAME);
//            personRepositoryGenerator.setData(Person::setLastName, DataType.LAST_NAME);
//            personRepositoryGenerator.setData(Person::setEmail, DataType.EMAIL);
//            personRepositoryGenerator.setData(Person::setPhone, DataType.PHONE_NUMBER);
//            personRepositoryGenerator.setData(Person::setDateOfBirth, DataType.DATE_OF_BIRTH);
//            personRepositoryGenerator.setData(Person::setOccupation, DataType.OCCUPATION);
//            repository.saveAll(personRepositoryGenerator.create(100, seed));



            logger.info("Generated demo data");
        };
    }

}