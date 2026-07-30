package com.proyecto.microservicios.product.dto;

import java.math.BigDecimal;

public record ProductResponse(String id, String nombre, String descripcion, BigDecimal precio){

}