package com.yuliana.catalog.repositories;

import com.yuliana.catalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
