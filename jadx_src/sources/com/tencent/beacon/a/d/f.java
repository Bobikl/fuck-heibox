package com.tencent.beacon.a.d;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f98836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f98837b;

    f(g gVar, Runnable runnable) {
        this.f98837b = gVar;
        this.f98836a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f98837b) {
            FileLock fileLockLock = null;
            try {
                try {
                    fileLockLock = this.f98837b.f98839b.lock();
                    this.f98836a.run();
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception e10) {
                    Object[] objArr = new Object[1];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("file get lock error:");
                    sb2.append(e10.getMessage());
                    objArr[0] = sb2.toString();
                    com.tencent.beacon.base.util.c.b("[properties]", objArr);
                    com.tencent.beacon.a.b.g.e().a("504", "[properties] File get lock error!", e10);
                    if (fileLockLock != null) {
                    }
                }
            } catch (Throwable th2) {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }
    }
}
