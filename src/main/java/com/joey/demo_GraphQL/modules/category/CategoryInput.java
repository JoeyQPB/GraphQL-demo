package com.joey.demo_GraphQL.modules.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryInput (@NotBlank String name) {
}
