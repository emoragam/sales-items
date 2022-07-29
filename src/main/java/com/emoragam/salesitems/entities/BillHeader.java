package com.emoragam.salesitems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "bill_header")
@Setter
@Getter
@NoArgsConstructor
public class BillHeader {
    @Id
    private String id;
    private String date;
    private String codeBill;
    private User user;
}
