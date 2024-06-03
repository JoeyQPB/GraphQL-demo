package com.joey.demo_GraphQL.repositories.category;

import com.joey.demo_GraphQL.modules.category.CategoryModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<CategoryModel, UUID> {
}
