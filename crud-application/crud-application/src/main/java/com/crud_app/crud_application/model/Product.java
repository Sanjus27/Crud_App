package com.crud_app.crud_application.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Products")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Float price;

}
