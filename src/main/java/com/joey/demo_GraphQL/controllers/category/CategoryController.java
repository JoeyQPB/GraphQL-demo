package com.joey.demo_GraphQL.controllers.category;

import com.joey.demo_GraphQL.modules.category.CategoryInput;
import com.joey.demo_GraphQL.modules.category.CategoryModel;
import com.joey.demo_GraphQL.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @MutationMapping()
    public CategoryModel addCategory (@Argument CategoryInput categoryInput) {
        return this.categoryService.create(categoryInput);
    }

    @QueryMapping(name = "categoryById")
    Optional<CategoryModel> categoryById(@Argument UUID id) {
        return this.categoryService.getById(id);
    }

    @QueryMapping(name = "allCategories")
    public Iterable<CategoryModel> allCategories () {
        return this.categoryService.getAll();
    }
}
