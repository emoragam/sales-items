package com.emoragam.salesitems.repositories;

import com.emoragam.salesitems.entities.BillHeader;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillHeaderRepository extends MongoRepository<BillHeader, String > {
}
