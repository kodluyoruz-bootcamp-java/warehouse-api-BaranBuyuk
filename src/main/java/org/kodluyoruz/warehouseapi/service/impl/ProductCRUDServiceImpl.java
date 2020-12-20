package org.kodluyoruz.warehouseapi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.warehouseapi.base.BaseIDDTO;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponse;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;
import org.kodluyoruz.warehouseapi.service.ProductCRUDService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class ProductCRUDServiceImpl implements ProductCRUDService {

    @Override
    public WarehouseAPIResponse<Collection<ProductDTO>> list() {
        return null;
    }

    @Override
    public WarehouseAPIResponse<ProductDTO> create(ProductDTO data) {
        return null;
    }

    @Override
    public WarehouseAPIResponse<ProductDTO> update(ProductDTO data) {
        return null;
    }

    @Override
    public WarehouseAPIResponse<?> delete(BaseIDDTO data) {
        return null;
    }
}
