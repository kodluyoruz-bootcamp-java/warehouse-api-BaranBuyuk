package org.kodluyoruz.warehouseapi.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * Data Container
 */
@Getter
@Setter
public class WarehouseAPIResponse<T> {

    private T responseData;
    private HttpStatus httpStatus;
    private WarehouseAPIResponseError error;

    public WarehouseAPIResponse(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public WarehouseAPIResponse(T responseData, HttpStatus httpStatus) {
        this.responseData = responseData;
        this.httpStatus = httpStatus;
    }

    public WarehouseAPIResponse(HttpStatus httpStatus,
                                WarehouseAPIResponseError error) {
        this.httpStatus = httpStatus;
        this.error = error;
    }

}
