package com.bytedance.realx.base;

import androidx.annotation.p0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @p0
    private final Runnable releaseCallback;

    public RefCountDelegate(@p0 Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
