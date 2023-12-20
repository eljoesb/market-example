package com.example.market.infrastructure.persistence.product.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.market.infrastructure.persistence.product.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
