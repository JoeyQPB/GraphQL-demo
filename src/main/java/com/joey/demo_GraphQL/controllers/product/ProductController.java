package com.joey.demo_GraphQL.controllers.product;

import com.joey.demo_GraphQL.modules.product.ProductInput;
import com.joey.demo_GraphQL.modules.product.ProductModel;
import com.joey.demo_GraphQL.service.product.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @MutationMapping()
    public ProductModel addProduct (@Argument @Valid ProductInput productInput) {
        return this.productService.create(productInput);
    }

    @QueryMapping(name = "productById")
    public Optional<ProductModel> productById (@Argument @Valid UUID id) {
        return this.productService.getById(id);
    }

    @QueryMapping(name = "allProducts")
    public Iterable<ProductModel> allProducts () {
        return this.productService.getAll();
    }
}
