package com.max.xiaoheihe.base.mvvm.repository;

import dl.d;

/* JADX INFO: compiled from: DataCallBack.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface a<T> {
    void onComplete();

    void onError(@d Throwable th2);

    void onNext(T t10);
}
