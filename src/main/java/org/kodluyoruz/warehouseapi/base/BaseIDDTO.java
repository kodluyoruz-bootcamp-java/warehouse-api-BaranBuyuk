package org.kodluyoruz.warehouseapi.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseIDDTO implements Serializable {

    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
