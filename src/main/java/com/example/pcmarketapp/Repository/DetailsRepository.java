package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Details;
import com.example.pcmarketapp.Projection.DetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.xml.soap.Detail;

@RepositoryRestResource(path = "details",excerptProjection = DetailsProjection.class)
public interface DetailsRepository extends JpaRepository<Details,Integer> {
}
