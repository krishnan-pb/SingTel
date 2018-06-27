package com.section.bonus;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {


    @RequestMapping(value = "/getAllAnimals", method=RequestMethod.GET)
    public List<Animal> getAllAnimals() {
        return TestSecE.animals;
    }
}
