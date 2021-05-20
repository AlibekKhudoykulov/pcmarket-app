package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Order;
import com.example.pcmarketapp.Projection.OrderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order",excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
