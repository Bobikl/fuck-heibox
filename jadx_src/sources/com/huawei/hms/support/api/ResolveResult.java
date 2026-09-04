package com.huawei.hms.support.api;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes7.dex */
public class ResolveResult<T> extends Result {
    private T entity;

    public ResolveResult() {
        this.entity = null;
    }

    public ResolveResult(T t10) {
        this.entity = t10;
    }

    public T getValue() {
        return this.entity;
    }
}
