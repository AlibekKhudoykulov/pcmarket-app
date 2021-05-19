package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Details;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Details.class)
public interface DetailsProjection {
     Integer getId();

     String getName();
}
