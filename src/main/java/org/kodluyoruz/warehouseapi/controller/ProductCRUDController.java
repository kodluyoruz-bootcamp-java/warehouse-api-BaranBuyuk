package org.kodluyoruz.warehouseapi.controller;


import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.base.BaseIDDTO;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponse;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;
import org.kodluyoruz.warehouseapi.service.ProductCRUDService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@SwaggerClient
public class ProductCRUDController {

    private final ProductCRUDService productCRUDService;

    @GetMapping
    public WarehouseAPIResponse<Collection<ProductDTO>> getAllWarehouses() {
        return productCRUDService.list();
    }

    @PostMapping()
    public WarehouseAPIResponse<ProductDTO> create(ProductDTO productDTO) {
        return productCRUDService.create(productDTO);
    }

    @PutMapping
    public WarehouseAPIResponse<ProductDTO> update(ProductDTO productDTO) {
        return productCRUDService.update(productDTO);
    }

    @DeleteMapping
    public WarehouseAPIResponse<?> update(BaseIDDTO id) {
        return productCRUDService.delete(id);
    }
}
