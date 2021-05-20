package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.OutputProduct;
import com.example.pcmarketapp.Entity.UserBasket;
import com.example.pcmarketapp.Entity.Users;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = UserBasket.class)
public interface UserBasketProjection {
    Integer getId();

     Double getAllSum();

     Users getUsers();

     OutputProduct getOutputProduct();
}

