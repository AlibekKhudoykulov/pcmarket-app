package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.OutputProduct;
import com.example.pcmarketapp.Projection.OutputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
