package com.joey.demo_GraphQL.modules.product;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductInput (@NotBlank String name,
                            @NotBlank BigDecimal price,
                            @NotBlank UUID categoryId) {
}
