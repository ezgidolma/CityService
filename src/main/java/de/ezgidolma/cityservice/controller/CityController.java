package de.ezgidolma.cityservice.controller;

import de.ezgidolma.cityservice.model.City;
import de.ezgidolma.cityservice.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping //bilgiyi verdirmek için yazılır
    public ResponseEntity<List<City>> getCountries(@RequestParam(required = false) String name){
        return new ResponseEntity<>(cityService.getCities(name), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable String id){
        return new ResponseEntity<>(getCityById(id),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<City> createCity(@RequestBody City newCity){
        return new ResponseEntity<>(cityService.createCity(newCity), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> getCity(@PathVariable String id, @RequestBody City newCity){
        cityService.updateCity(id,newCity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable String id){
        cityService.deleteCity(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    private City getCityById(String id){
        return cityService.getCityById(id);


    }
}
