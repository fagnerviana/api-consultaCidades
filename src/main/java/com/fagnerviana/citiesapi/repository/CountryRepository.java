package com.fagnerviana.citiesapi.repository;

import com.fagnerviana.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
