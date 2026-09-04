package com.tencent.custom.customcapture.render;

/* JADX INFO: loaded from: classes4.dex */
public interface EGLHelper<T> {
    void destroy();

    T getContext();

    void makeCurrent();

    boolean swapBuffers();

    void unmakeCurrent();
}
