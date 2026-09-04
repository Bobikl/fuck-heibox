package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41047f = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41048g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f41049h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static e f41050i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f41052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41053c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.disklrucache.b f41055e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f41054d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f41051a = new m();

    @Deprecated
    protected e(File file, long j10) {
        this.f41052b = file;
        this.f41053c = j10;
    }

    public static a d(File file, long j10) {
        return new e(file, j10);
    }

    @Deprecated
    public static synchronized a e(File file, long j10) {
        if (f41050i == null) {
            f41050i = new e(file, j10);
        }
        return f41050i;
    }

    private synchronized com.bumptech.glide.disklrucache.b f() throws IOException {
        if (this.f41055e == null) {
            this.f41055e = com.bumptech.glide.disklrucache.b.K(this.f41052b, 1, 1, this.f41053c);
        }
        return this.f41055e;
    }

    private synchronized void g() {
        this.f41055e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.c cVar, a.b bVar) {
        String strB = this.f41051a.b(cVar);
        this.f41054d.a(strB);
        try {
            if (Log.isLoggable(f41047f, 2)) {
                Log.v(f41047f, "Put: Obtained: " + strB + " for for Key: " + cVar);
            }
            try {
                com.bumptech.glide.disklrucache.b bVarF = f();
                if (bVarF.z(strB) != null) {
                    this.f41054d.b(strB);
                    return;
                }
                com.bumptech.glide.disklrucache.b.c cVarS = bVarF.s(strB);
                if (cVarS == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                }
                try {
                    if (bVar.a(cVarS.f(0))) {
                        cVarS.e();
                    }
                    cVarS.b();
                    this.f41054d.b(strB);
                } catch (Throwable th2) {
                    cVarS.b();
                    throw th2;
                }
            } catch (IOException e10) {
                if (Log.isLoggable(f41047f, 5)) {
                    Log.w(f41047f, "Unable to put to disk cache", e10);
                }
            }
        } catch (Throwable th3) {
            this.f41054d.b(strB);
            throw th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.c cVar) {
        String strB = this.f41051a.b(cVar);
        if (Log.isLoggable(f41047f, 2)) {
            Log.v(f41047f, "Get: Obtained: " + strB + " for for Key: " + cVar);
        }
        try {
            com.bumptech.glide.disklrucache.b.e eVarZ = f().z(strB);
            if (eVarZ != null) {
                return eVarZ.b(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable(f41047f, 5)) {
                return null;
            }
            Log.w(f41047f, "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(com.bumptech.glide.load.c cVar) {
        try {
            f().P(this.f41051a.b(cVar));
        } catch (IOException e10) {
            if (Log.isLoggable(f41047f, 5)) {
                Log.w(f41047f, "Unable to delete from disk cache", e10);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().q();
            } catch (IOException e10) {
                if (Log.isLoggable(f41047f, 5)) {
                    Log.w(f41047f, "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }
}
