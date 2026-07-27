package com.proyecto.microservicios.product.controller;


@RestController
@RequestMapping("/api/product")
public class ProductController{

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
         
    }

}