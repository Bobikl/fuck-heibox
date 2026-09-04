package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheDataSink implements com.google.android.exoplayer2.upstream.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f50933k = 5242880;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50934l = 20480;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f50935m = 2097152;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f50936n = "CacheDataSink";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f50937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.upstream.r f50940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private File f50942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private OutputStream f50943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s f50946j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class a implements com.google.android.exoplayer2.upstream.m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f50947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f50948b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50949c = CacheDataSink.f50934l;

        @Override // com.google.android.exoplayer2.upstream.m.a
        public com.google.android.exoplayer2.upstream.m a() {
            return new CacheDataSink((Cache) com.google.android.exoplayer2.util.a.g(this.f50947a), this.f50948b, this.f50949c);
        }

        public a b(int i10) {
            this.f50949c = i10;
            return this;
        }

        public a c(Cache cache) {
            this.f50947a = cache;
            return this;
        }

        public a d(long j10) {
            this.f50948b = j10;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j10) {
        this(cache, j10, f50934l);
    }

    public CacheDataSink(Cache cache, long j10, int i10) {
        com.google.android.exoplayer2.util.a.j(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            com.google.android.exoplayer2.util.u.m(f50936n, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f50937a = (Cache) com.google.android.exoplayer2.util.a.g(cache);
        this.f50938b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f50939c = i10;
    }

    private void b() throws IOException {
        OutputStream outputStream = this.f50943g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            u0.p(this.f50943g);
            this.f50943g = null;
            File file = (File) u0.k(this.f50942f);
            this.f50942f = null;
            this.f50937a.B(file, this.f50944h);
        } catch (Throwable th2) {
            u0.p(this.f50943g);
            this.f50943g = null;
            File file2 = (File) u0.k(this.f50942f);
            this.f50942f = null;
            file2.delete();
            throw th2;
        }
    }

    private void c(com.google.android.exoplayer2.upstream.r rVar) throws IOException {
        long j10 = rVar.f51201h;
        this.f50942f = this.f50937a.v((String) u0.k(rVar.f51202i), rVar.f51200g + this.f50945i, j10 != -1 ? Math.min(j10 - this.f50945i, this.f50941e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f50942f);
        if (this.f50939c > 0) {
            s sVar = this.f50946j;
            if (sVar == null) {
                this.f50946j = new s(fileOutputStream, this.f50939c);
            } else {
                sVar.a(fileOutputStream);
            }
            this.f50943g = this.f50946j;
        } else {
            this.f50943g = fileOutputStream;
        }
        this.f50944h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void a(com.google.android.exoplayer2.upstream.r rVar) throws CacheDataSinkException {
        com.google.android.exoplayer2.util.a.g(rVar.f51202i);
        if (rVar.f51201h == -1 && rVar.d(2)) {
            this.f50940d = null;
            return;
        }
        this.f50940d = rVar;
        this.f50941e = rVar.d(4) ? this.f50938b : Long.MAX_VALUE;
        this.f50945i = 0L;
        try {
            c(rVar);
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void close() throws CacheDataSinkException {
        if (this.f50940d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void write(byte[] bArr, int i10, int i11) throws CacheDataSinkException {
        com.google.android.exoplayer2.upstream.r rVar = this.f50940d;
        if (rVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f50944h == this.f50941e) {
                    b();
                    c(rVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f50941e - this.f50944h);
                ((OutputStream) u0.k(this.f50943g)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f50944h += j10;
                this.f50945i += j10;
            } catch (IOException e10) {
                throw new CacheDataSinkException(e10);
            }
        }
    }
}
