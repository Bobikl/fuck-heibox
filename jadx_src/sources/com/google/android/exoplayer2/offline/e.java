package com.google.android.exoplayer2.offline;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Download.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f47225i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f47226j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47227k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47228l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47229m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f47230n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f47231o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f47232p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f47233q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47234r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f47235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final u f47242h;

    /* JADX INFO: compiled from: Download.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: Download.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public e(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new u());
    }

    public e(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, u uVar) {
        com.google.android.exoplayer2.util.a.g(uVar);
        com.google.android.exoplayer2.util.a.a((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            com.google.android.exoplayer2.util.a.a((i10 == 2 || i10 == 0) ? false : true);
        }
        this.f47235a = downloadRequest;
        this.f47236b = i10;
        this.f47237c = j10;
        this.f47238d = j11;
        this.f47239e = j12;
        this.f47240f = i11;
        this.f47241g = i12;
        this.f47242h = uVar;
    }

    public long a() {
        return this.f47242h.f47303a;
    }

    public float b() {
        return this.f47242h.f47304b;
    }

    public boolean c() {
        int i10 = this.f47236b;
        return i10 == 3 || i10 == 4;
    }
}
