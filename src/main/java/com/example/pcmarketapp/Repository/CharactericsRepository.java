package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Characterics;
import com.example.pcmarketapp.Projection.CharactericsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characterics",excerptProjection = CharactericsProjection.class)
public interface CharactericsRepository extends JpaRepository<Characterics,Integer> {
}
