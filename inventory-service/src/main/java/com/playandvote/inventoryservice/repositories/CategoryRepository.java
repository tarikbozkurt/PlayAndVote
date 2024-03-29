package com.playandvote.inventoryservice.repositories;

import com.playandvote.inventoryservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
