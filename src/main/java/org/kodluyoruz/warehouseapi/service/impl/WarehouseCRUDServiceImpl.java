package org.kodluyoruz.warehouseapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.warehouseapi.converter.WarehouseEntityToWarehouseDTOConverter;
import org.kodluyoruz.warehouseapi.dao.WarehouseCRUDRepository;
import org.kodluyoruz.warehouseapi.base.BaseIDDTO;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponse;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.kodluyoruz.warehouseapi.service.WarehouseCRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service("warehouseCRUDService")
@Slf4j
public class WarehouseCRUDServiceImpl implements WarehouseCRUDService {

    private final WarehouseCRUDRepository warehouseCRUDRepository;
    private final WarehouseEntityToWarehouseDTOConverter converter;

    @Override
    public WarehouseAPIResponse<Collection<WarehouseDTO>> list() {

        Collection<WarehouseEntity> warehouseEntities = warehouseCRUDRepository.list();
        if(CollectionUtils.isEmpty(warehouseEntities)){
            return new WarehouseAPIResponse<>(HttpStatus.NOT_FOUND);
        }
        List<WarehouseDTO> warehouseDTOList = warehouseEntities
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
        return new WarehouseAPIResponse<>(warehouseDTOList, HttpStatus.OK);
    }

    @Override
    public WarehouseAPIResponse<WarehouseDTO> create(WarehouseDTO data) {
        return null;
    }

    @Override
    public WarehouseAPIResponse<WarehouseDTO> update(WarehouseDTO data) {
        return null;
    }

    @Override
    public WarehouseAPIResponse<?> delete(BaseIDDTO id) {
        return null;
    }
}
