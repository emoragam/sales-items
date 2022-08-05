package com.emoragam.salesitems.repositories;

import com.emoragam.salesitems.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
