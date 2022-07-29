package com.emoragam.salesitems.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BillHeaderDTO {
    private String id;
    private String date;
    private String codeBill;
    private String userId;
}
