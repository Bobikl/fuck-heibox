package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes7.dex */
public class Response<T extends Result> {
    protected T result;

    public Response() {
    }

    protected Response(T t10) {
        this.result = t10;
    }

    protected T getResult() {
        return this.result;
    }

    public void setResult(T t10) {
        this.result = t10;
    }
}
