package com.bytedance.realx.video.memory;

import androidx.annotation.p0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class RefObject {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @p0
    private final Runnable releaseCallback;

    public RefObject(@p0 Runnable runnable) {
        this.releaseCallback = runnable;
    }

    public boolean hasReleaseCallback() {
        return this.releaseCallback != null;
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }
}
