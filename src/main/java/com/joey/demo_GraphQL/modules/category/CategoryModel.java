package com.joey.demo_GraphQL.modules.category;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;


@Entity(name = "category_tb")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    public CategoryModel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryModel that = (CategoryModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
