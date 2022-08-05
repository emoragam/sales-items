package com.emoragam.salesitems.controllers;

import com.emoragam.salesitems.entities.Product;
import com.emoragam.salesitems.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts() {
        //Test of branch
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Product createProduct(@RequestBody Product product){
        repository.save(product);
        return product;
    }
}
