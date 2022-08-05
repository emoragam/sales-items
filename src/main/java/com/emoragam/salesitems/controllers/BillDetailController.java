package com.emoragam.salesitems.controllers;

import com.emoragam.salesitems.repositories.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billDetail")
public class BillDetailController {

    @Autowired
    private BillDetailRepository repository;
}
