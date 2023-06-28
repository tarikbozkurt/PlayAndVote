package com.playandvote.inventoryservice.api.controller;


import com.playandvote.inventoryservice.business.abstracts.CategoryService;
import com.playandvote.inventoryservice.business.dto.requests.creates.CreateCategoryRequest;
import com.playandvote.inventoryservice.business.dto.responses.creates.CreateCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetAllCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetCategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/Category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @GetMapping("/all")
    public List<GetAllCategoryResponse> getAll(){

        return service.getAll();

    }
    @GetMapping("{id}")
    public GetCategoryResponse getById(@RequestPart("id") UUID id){
        return service.getById(id);
    }

    @PostMapping()
    public CreateCategoryResponse create(@RequestBody CreateCategoryRequest request){
        return service.create(request);
    }
}
