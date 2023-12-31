package com.spring.restaurant.controller;

import com.spring.restaurant.model.Category;
import com.spring.restaurant.model.Country;
import com.spring.restaurant.model.State;
import com.spring.restaurant.service.CategoryService;
import com.spring.restaurant.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {
    private CountryService countryService;
    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    @GetMapping("/countries")
    public List<Country> getCountries(){
        return   countryService.getAllCountry();
    }


}
