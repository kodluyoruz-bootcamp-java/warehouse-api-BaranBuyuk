package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.BaseIDDTO;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponse;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.service.WarehouseCRUDService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/warehouses")
public class WarehouseCRUDController {

    private final WarehouseCRUDService warehouseCRUDService;

    @GetMapping( )
    public WarehouseAPIResponse<Collection<WarehouseDTO>> getAllWarehouses() {
        return warehouseCRUDService.list();
    }

    @PostMapping()
    public WarehouseAPIResponse<WarehouseDTO> create(WarehouseDTO warehouseDTO) {
        return warehouseCRUDService.create(warehouseDTO);
    }

    @PutMapping()
    public WarehouseAPIResponse<WarehouseDTO> update(WarehouseDTO warehouseDTO) {
        return warehouseCRUDService.update(warehouseDTO);
    }

    @DeleteMapping()
    public WarehouseAPIResponse<?> update(BaseIDDTO id) {
        return warehouseCRUDService.delete(id);
    }

}

