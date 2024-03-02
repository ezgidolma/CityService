package de.ezgidolma.cityservice.repository;

import de.ezgidolma.cityservice.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityRepository extends MongoRepository<City , String> {
    List<City> findByName(String name);
}
