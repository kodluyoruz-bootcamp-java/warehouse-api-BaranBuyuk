package org.kodluyoruz.warehouseapi.base;

import java.util.Collection;

public interface WarehouseAPICRUDBaseService<T extends BaseIDDTO> {

    WarehouseAPIResponse<Collection<T>> list();

    WarehouseAPIResponse<T> create(T data);

    WarehouseAPIResponse<T> update(T data);

    WarehouseAPIResponse<?> delete(BaseIDDTO data);
}
