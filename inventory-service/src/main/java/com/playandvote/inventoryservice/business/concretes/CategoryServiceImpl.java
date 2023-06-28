package com.playandvote.inventoryservice.business.concretes;

import com.playandvote.inventoryservice.business.abstracts.CategoryService;
import com.playandvote.inventoryservice.business.dto.requests.creates.CreateCategoryRequest;
import com.playandvote.inventoryservice.business.dto.responses.creates.CreateCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetAllCategoryResponse;
import com.playandvote.inventoryservice.business.dto.responses.gets.GetCategoryResponse;
import com.playandvote.inventoryservice.entities.Category;
import com.playandvote.inventoryservice.repositories.CategoryRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
@Builder
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllCategoryResponse> getAll() {

       List<Category> list = repository.findAll();

       List<GetAllCategoryResponse> response = list
               .stream()
               .map(category -> mapper.map(category, GetAllCategoryResponse.class)).toList();

        return response;
    }

    @Override
    public GetCategoryResponse getById(UUID id) {

        //TODO We will add some logic for controlling "isIdExits" ?  later..

        Category category = repository.findById(id).orElseThrow();

        GetCategoryResponse response = mapper.map(category, GetCategoryResponse.class);

        return response;
    }

    @Override
    public CreateCategoryResponse create(CreateCategoryRequest request) {

       Category category = mapper.map(request,Category.class);

       //Todo We will create KAFKA event here later for Filter Service

        repository.save(category);

        CreateCategoryResponse response = mapper.map(category,CreateCategoryResponse.class);
        return response;

    }
}
