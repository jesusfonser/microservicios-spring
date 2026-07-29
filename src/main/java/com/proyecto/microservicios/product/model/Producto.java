package com.proyecto.microservicios.product.model;

import java.math.BigDecimal;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Producto{
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
}