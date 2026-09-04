package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes7.dex */
public class y implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51318d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51319e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f51320f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final long f51321g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f51322h = 300000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51323i = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51324c;

    public y() {
        this(-1);
    }

    public y(int i10) {
        this.f51324c = i10;
    }

    @Override // com.google.android.exoplayer2.upstream.g0
    public long a(g0.d dVar) {
        IOException iOException = dVar.f51121c;
        return ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) ? com.google.android.exoplayer2.j.f46377b : Math.min((dVar.f51122d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.g0
    @androidx.annotation.p0
    public g0.b b(g0.a aVar, g0.d dVar) {
        if (!e(dVar.f51121c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new g0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new g0.b(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.g0
    public /* synthetic */ void c(long j10) {
        f0.a(this, j10);
    }

    @Override // com.google.android.exoplayer2.upstream.g0
    public int d(int i10) {
        int i11 = this.f51324c;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) iOException).f50871i;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }
}
