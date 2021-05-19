package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Attachment;
import com.example.pcmarketapp.Entity.Category;
import com.example.pcmarketapp.Entity.Characterics;
import com.example.pcmarketapp.Entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface ProductProjection {
     Integer getId();

     String getName();

     Double getPrice();

     boolean getActive=true;

     Category getCategory();

     Attachment getAttachment();

     Characterics getCharacterics();
}
