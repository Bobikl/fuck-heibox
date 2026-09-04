package com.tencent.liteav.base.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class HandlerThreadHolder {
    private final HandlerThread mHandlerThread;

    public HandlerThreadHolder(String str) {
        this.mHandlerThread = new HandlerThread(str);
    }

    public Looper getLooper() {
        return this.mHandlerThread.getLooper();
    }

    public void start() {
        this.mHandlerThread.start();
    }
}
