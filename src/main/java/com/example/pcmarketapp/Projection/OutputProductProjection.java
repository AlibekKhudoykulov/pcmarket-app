package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.OutputProduct;
import com.example.pcmarketapp.Entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();

    Double getAmount();

    Product getProduct();
}
