package com.joey.demo_GraphQL.repositories.product;

import com.joey.demo_GraphQL.modules.product.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<ProductModel, UUID> {
}
