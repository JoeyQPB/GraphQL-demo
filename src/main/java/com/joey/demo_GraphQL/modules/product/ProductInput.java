package com.joey.demo_GraphQL.modules.product;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductInput (String name, BigDecimal price, UUID categoryId) {
}
