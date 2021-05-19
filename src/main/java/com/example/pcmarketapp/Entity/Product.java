package com.example.pcmarketapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;

    private boolean active=true;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

    @OneToOne
    private Characterics characterics;
}
