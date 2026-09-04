package com.alibaba.fastjson.support.spring;

/* JADX INFO: loaded from: classes6.dex */
public class FastJsonContainer {
    private PropertyPreFilters filters;
    private Object value;

    FastJsonContainer(Object obj) {
        this.value = obj;
    }

    public PropertyPreFilters getFilters() {
        return this.filters;
    }

    public Object getValue() {
        return this.value;
    }

    public void setFilters(PropertyPreFilters propertyPreFilters) {
        this.filters = propertyPreFilters;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }
}
