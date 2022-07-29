package com.emoragam.salesitems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "bill_detail")
@Setter
@Getter
@NoArgsConstructor
public class BillDetail {
    @Id
    private String id;
    private Integer quantity;
    private BillHeader billHeader;
    private Product product;
}
