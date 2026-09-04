package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;

/* JADX INFO: loaded from: classes6.dex */
public class V8Thread extends Thread {
    private V8 runtime;
    private final V8Runnable target;

    public V8Thread(V8Runnable v8Runnable) {
        this.target = v8Runnable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        V8 v8CreateV8Runtime = V8.createV8Runtime();
        this.runtime = v8CreateV8Runtime;
        try {
            this.target.run(v8CreateV8Runtime);
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.close();
                    this.runtime = null;
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.close();
                    this.runtime = null;
                }
                throw th2;
            }
        }
    }
}
