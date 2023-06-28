package com.playandvote.inventoryservice.repositories;

import com.playandvote.inventoryservice.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
