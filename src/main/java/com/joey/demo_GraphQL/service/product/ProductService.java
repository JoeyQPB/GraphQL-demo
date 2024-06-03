package com.joey.demo_GraphQL.service.product;

import com.joey.demo_GraphQL.modules.product.ProductInput;
import com.joey.demo_GraphQL.modules.product.ProductModel;
import com.joey.demo_GraphQL.repositories.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel create (ProductInput productInput) {
        return this.productRepository.save(new ProductModel(productInput.name(), productInput.price(), productInput.categoryId()));
    }

    public Optional<ProductModel> getById (UUID id) {
        return this.productRepository.findById(id);
    }

    public Iterable<ProductModel> getAll () {
        return this.productRepository.findAll();
    }
}
