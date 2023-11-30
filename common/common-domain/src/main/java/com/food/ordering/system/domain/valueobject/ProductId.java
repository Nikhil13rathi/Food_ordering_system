package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class ProductI extends BaseId<UUID>{
    protected ProductI(UUID value) {
        super(value);
    }
}
