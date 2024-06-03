package com.joey.demo_GraphQL.service.category;

import com.joey.demo_GraphQL.modules.category.CategoryInput;
import com.joey.demo_GraphQL.modules.category.CategoryModel;
import com.joey.demo_GraphQL.repositories.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryModel create (CategoryInput categoryInput) {
        return this.categoryRepository.save(new CategoryModel(categoryInput.name()));
    }

    public Optional<CategoryModel> getById (UUID id) {
        return this.categoryRepository.findById(id);
    }

    public Iterable<CategoryModel> getAll () {
        return this.categoryRepository.findAll();
    }
}
