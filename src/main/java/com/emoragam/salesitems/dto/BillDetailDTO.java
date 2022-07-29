package com.emoragam.salesitems.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BillDetailDTO {
    private String id;
    private Integer quantity;
    private String billHeaderId;
    private String productId;
}
