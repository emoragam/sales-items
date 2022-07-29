package com.emoragam.salesitems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "products")
@Setter
@Getter
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String code;
    private String name;
    private Double price;
    private Boolean iva;
}
