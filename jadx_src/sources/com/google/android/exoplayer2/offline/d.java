package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.util.u0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DefaultDownloaderFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends x>> f47195c = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.a.d f47196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f47197b;

    @Deprecated
    public d(com.google.android.exoplayer2.upstream.cache.a.d dVar) {
        this(dVar, new androidx.profileinstaller.f());
    }

    public d(com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        this.f47196a = (com.google.android.exoplayer2.upstream.cache.a.d) com.google.android.exoplayer2.util.a.g(dVar);
        this.f47197b = (Executor) com.google.android.exoplayer2.util.a.g(executor);
    }

    private x b(DownloadRequest downloadRequest, int i10) {
        Constructor<? extends x> constructor = f47195c.get(i10);
        if (constructor == null) {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Module missing for content type ");
            sb2.append(i10);
            throw new IllegalStateException(sb2.toString());
        }
        try {
            return constructor.newInstance(new i2.c().K(downloadRequest.f47095c).G(downloadRequest.f47097e).l(downloadRequest.f47099g).a(), this.f47196a, this.f47197b);
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder(61);
            sb3.append("Failed to instantiate downloader for content type ");
            sb3.append(i10);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private static SparseArray<Constructor<? extends x>> c() {
        SparseArray<Constructor<? extends x>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, d(com.google.android.exoplayer2.source.dash.offline.a.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, d(com.google.android.exoplayer2.source.hls.offline.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, d(com.google.android.exoplayer2.source.smoothstreaming.offline.a.class));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends x> d(Class<?> cls) {
        try {
            return cls.asSubclass(x.class).getConstructor(i2.class, com.google.android.exoplayer2.upstream.cache.a.d.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.y
    public x a(DownloadRequest downloadRequest) {
        int iD0 = u0.D0(downloadRequest.f47095c, downloadRequest.f47096d);
        if (iD0 == 0 || iD0 == 1 || iD0 == 2) {
            return b(downloadRequest, iD0);
        }
        if (iD0 == 4) {
            return new c0(new i2.c().K(downloadRequest.f47095c).l(downloadRequest.f47099g).a(), this.f47196a, this.f47197b);
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Unsupported type: ");
        sb2.append(iD0);
        throw new IllegalArgumentException(sb2.toString());
    }
}
