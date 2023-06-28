package com.playandvote.inventoryservice.business.abstracts;

import com.playandvote.inventoryservice.business.dto.requests.creates.CreateCategoryRequest;
import com.playandvote.inventoryservice.business.dto.responses.creates.CreateCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetAllCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetAllGameResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetCategoryResponse;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    List<GetAllCategoryResponse> getAll();
    GetCategoryResponse getById(UUID id);
    CreateCategoryResponse create(CreateCategoryRequest request);

    //TODO Add delete later.

}
