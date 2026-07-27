package com.proyecto.microservicios.product.model;

import org.springframework.data.mongodb.core.mapping.Document;

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