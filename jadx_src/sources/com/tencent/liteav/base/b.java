package com.tencent.liteav.base;

import android.os.StrictMode;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f99566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StrictMode.VmPolicy f99567b;

    private b(StrictMode.ThreadPolicy threadPolicy) {
        this.f99566a = threadPolicy;
        this.f99567b = null;
    }

    private b(StrictMode.ThreadPolicy threadPolicy, byte b10) {
        this(threadPolicy);
    }

    public static b a() {
        return new b(StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f99566a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f99567b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
