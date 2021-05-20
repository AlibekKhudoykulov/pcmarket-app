package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.UserBasket;
import com.example.pcmarketapp.Projection.UserBasketProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "userbasket",excerptProjection = UserBasketProjection.class)
public interface UserBasketRepository extends JpaRepository<UserBasket,Integer> {
}
