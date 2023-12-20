package com.example.market.infrastructure.persistence.category.mappers;

import org.mapstruct.*;

import com.example.market.domain.category.classes.Category;
import com.example.market.infrastructure.persistence.category.entities.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
