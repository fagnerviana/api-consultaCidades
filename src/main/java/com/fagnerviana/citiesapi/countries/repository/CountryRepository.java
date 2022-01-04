package com.fagnerviana.citiesapi.countries.repository;

import com.fagnerviana.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
