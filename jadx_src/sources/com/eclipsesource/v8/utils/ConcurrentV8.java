package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcurrentV8 {

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    private V8 f42407v8;

    public ConcurrentV8() {
        this.f42407v8 = null;
        V8 v8CreateV8Runtime = V8.createV8Runtime();
        this.f42407v8 = v8CreateV8Runtime;
        v8CreateV8Runtime.getLocker().release();
    }

    public V8 getV8() {
        return this.f42407v8;
    }

    public void release() {
        V8 v10 = this.f42407v8;
        if (v10 == null || v10.isReleased()) {
            return;
        }
        run(new V8Runnable() { // from class: com.eclipsesource.v8.utils.ConcurrentV8.1
            @Override // com.eclipsesource.v8.utils.V8Runnable
            public void run(V8 v11) {
                if (v11 == null || v11.isReleased()) {
                    return;
                }
                v11.close();
            }
        });
    }

    public synchronized void run(V8Runnable v8Runnable) {
        try {
            this.f42407v8.getLocker().acquire();
            v8Runnable.run(this.f42407v8);
            V8 v10 = this.f42407v8;
            if (v10 != null && v10.getLocker() != null && this.f42407v8.getLocker().hasLock()) {
                this.f42407v8.getLocker().release();
            }
        } catch (Throwable th2) {
            V8 v11 = this.f42407v8;
            if (v11 != null && v11.getLocker() != null && this.f42407v8.getLocker().hasLock()) {
                this.f42407v8.getLocker().release();
            }
            throw th2;
        }
    }
}
