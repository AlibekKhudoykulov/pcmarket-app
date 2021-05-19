package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Product;
import com.example.pcmarketapp.Projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
