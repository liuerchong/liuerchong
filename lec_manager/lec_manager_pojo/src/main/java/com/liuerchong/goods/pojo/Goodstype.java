package com.liuerchong.goods.pojo;

import java.math.BigDecimal;

public class Goodstype {
    private BigDecimal uuid;

    private String name;

    public BigDecimal getUuid() {
        return uuid;
    }

    public void setUuid(BigDecimal uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}