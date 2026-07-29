package com.proyecto.microservicios.product.repository;

import com.proyecto.microservicios.product.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Producto, String> {
}