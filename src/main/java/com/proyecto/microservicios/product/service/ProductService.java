package com.proyecto.microservicios.product.service;

import com.proyecto.microservicios.product.dto.ProductRequest;
import com.proyecto.microservicios.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.proyecto.microservicios.product.model.Product;
import lombok.extern.slf4j.slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .id(productRequest.id())
                .nombre(productRequest.nombre())
                .descripcion(productRequest.descripcion())
                .precio(productRequest.precio())
                .build();
        productRepository.save(product);

        String avisoExito = "Producto %s creado con éxito".formatted(product.getNombre());

        log.info(avisoExito);

        return product;
    }
}