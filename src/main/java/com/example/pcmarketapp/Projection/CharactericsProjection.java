package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Characterics;
import com.example.pcmarketapp.Entity.Details;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = Characterics.class)
public interface CharactericsProjection {
     Integer getId();

     String getValue();

     Details getDetails();
}
