package com.emoragam.salesitems.repositories;

import com.emoragam.salesitems.entities.BillDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillDetailRepository extends MongoRepository<BillDetail, String > {
}
