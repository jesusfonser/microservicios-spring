package com.proyecto.microservicios.product.dto;

import java.math.BigDecimal;

public record ProductRequest(String id, String nombre, String descripcion, BigDecimal precio) {

}