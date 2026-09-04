package com.tencent.ugc.beauty.decoder;

/* JADX INFO: loaded from: classes4.dex */
public interface Provider<T> {
    T dequeueOutputBuffer();

    void enqueueOutputBuffer(T t10);
}
