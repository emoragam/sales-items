package com.emoragam.salesitems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(value = "bill_header")
@Setter
@Getter
@NoArgsConstructor
public class BillHeader {
    @Id
    private String id;
    private Date date;
    private String codeBill;
    private User user;
    private List<BillDetail> details;
}
