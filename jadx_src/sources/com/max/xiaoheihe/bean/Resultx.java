package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class Resultx<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private T response;

    public T getResponse() {
        return this.response;
    }

    public Resultx setResponse(T t10) {
        this.response = t10;
        return this;
    }
}
