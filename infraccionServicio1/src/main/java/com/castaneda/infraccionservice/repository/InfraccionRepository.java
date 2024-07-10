package com.castaneda.infraccionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castaneda.infraccionservice.entity.Infraccion;

public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{

}
