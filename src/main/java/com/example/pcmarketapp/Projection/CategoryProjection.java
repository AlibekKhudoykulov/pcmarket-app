package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();

    String getName();

    Category getParentCategory();
}
