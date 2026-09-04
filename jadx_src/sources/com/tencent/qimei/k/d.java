package com.tencent.qimei.k;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f101266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f101267b;

    public d(e eVar, Runnable runnable) {
        this.f101267b = eVar;
        this.f101266a = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003c A[EXC_TOP_SPLITTER, PHI: r1
  0x003c: PHI (r1v4 java.nio.channels.FileLock) = (r1v3 java.nio.channels.FileLock), (r1v6 java.nio.channels.FileLock) binds: [B:16:0x003a, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f101267b) {
            FileLock fileLockLock = null;
            try {
                try {
                    fileLockLock = this.f101267b.f101268a.lock();
                    this.f101266a.run();
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
                    com.tencent.qimei.n.a.b("[properties]", objArr);
                    if (fileLockLock != null) {
                        fileLockLock.release();
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
