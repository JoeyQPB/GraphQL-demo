package com.joey.demo_GraphQL.modules.product;

import com.joey.demo_GraphQL.modules.category.CategoryModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;


@Entity(name = "product_tb")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryModel category;

    @Column(name = "category_id")
    private UUID categoryId;

    public ProductModel (String name, BigDecimal price, UUID categoryId) {
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel that = (ProductModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
