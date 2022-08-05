package com.emoragam.salesitems.controllers;

import com.emoragam.salesitems.dto.BillHeaderDTO;
import com.emoragam.salesitems.entities.BillHeader;
import com.emoragam.salesitems.repositories.BillHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/billHeader")
public class BillHeaderController {

    @Autowired
    private BillHeaderRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BillHeader> getAllBillHeader() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public BillHeader createBillHeader(@RequestBody BillHeaderDTO headerDTO) {
        BillHeader header = new BillHeader();
        header.setDate(new Date());
        header.setCodeBill(headerDTO.getCodeBill());
        header.setId(headerDTO.getId());
        repository.save(header);
        return header;
    }

}
