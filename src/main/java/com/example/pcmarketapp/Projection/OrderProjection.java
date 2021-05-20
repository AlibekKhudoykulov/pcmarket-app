package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Order;
import com.example.pcmarketapp.Entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;
import java.util.Date;

@Projection(types = Order.class)
public interface OrderProjection {
     Integer getId();

     Date getDate();

     String getDetails();

     UserBasket getUserBasket();
}
