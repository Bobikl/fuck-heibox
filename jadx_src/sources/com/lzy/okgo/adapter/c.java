package com.lzy.okgo.adapter;

import com.lzy.okgo.request.base.Request;

/* JADX INFO: compiled from: Call.java */
/* JADX INFO: loaded from: classes.dex */
public interface c<T> {
    void a(ia.c<T> cVar);

    void cancel();

    c<T> clone();

    com.lzy.okgo.model.b<T> execute() throws Exception;

    Request getRequest();

    boolean isCanceled();

    boolean isExecuted();
}
