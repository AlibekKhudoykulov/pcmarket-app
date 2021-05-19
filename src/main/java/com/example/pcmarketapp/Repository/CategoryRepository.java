package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Category;
import com.example.pcmarketapp.Projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.ManyToOne;

@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
