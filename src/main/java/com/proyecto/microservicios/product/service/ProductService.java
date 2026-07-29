package com.proyecto.microservicios.product.service;

import com.proyecto.microservicios.product.dto.ProductRequest;
import com.proyecto.microservicios.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.proyecto.microservicios.product.model.Producto;
import lombok.extern.slf4j.Slf4j;
import com.proyecto.microservicios.product.dto.ProductResponse;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {
        Producto product = Producto.builder()
                .id(productRequest.id())
                .nombre(productRequest.nombre())
                .descripcion(productRequest.descripcion())
                .precio(productRequest.precio())
                .build();
        productRepository.save(product);

        String avisoExito = "Producto %s creado con éxito".formatted(product.getNombre());

        log.info(avisoExito);

        return new ProductResponse(product.getId(), product.getNombre(), product.getDescripcion(), product.getPrecio());
    }

    public List<ProductResponse> getAllProducts(){
        return productRepository.findAll()
            .stream()
            .map(product -> new ProductResponse(product.getId(), product.getNombre(), product.getDescripcion(), product.getPrecio()))
            .toList();
    }
}