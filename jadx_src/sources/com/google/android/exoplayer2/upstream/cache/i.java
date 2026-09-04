package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.k1;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: CacheWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51007k = 131072;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.a f51008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cache f51009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.r f51010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f51012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final a f51013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f51015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f51016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f51017j;

    /* JADX INFO: compiled from: CacheWriter.java */
    public interface a {
        void a(long j10, long j11, long j12);
    }

    public i(com.google.android.exoplayer2.upstream.cache.a aVar, com.google.android.exoplayer2.upstream.r rVar, @p0 byte[] bArr, @p0 a aVar2) {
        this.f51008a = aVar;
        this.f51009b = aVar.w();
        this.f51010c = rVar;
        this.f51012e = bArr == null ? new byte[131072] : bArr;
        this.f51013f = aVar2;
        this.f51011d = aVar.x().a(rVar);
        this.f51014g = rVar.f51200g;
    }

    private long c() {
        long j10 = this.f51015h;
        if (j10 == -1) {
            return -1L;
        }
        return j10 - this.f51010c.f51200g;
    }

    private void d(long j10) {
        this.f51016i += j10;
        a aVar = this.f51013f;
        if (aVar != null) {
            aVar.a(c(), this.f51016i, j10);
        }
    }

    private void e(long j10) {
        if (this.f51015h == j10) {
            return;
        }
        this.f51015h = j10;
        a aVar = this.f51013f;
        if (aVar != null) {
            aVar.a(c(), this.f51016i, 0L);
        }
    }

    private long f(long j10, long j11) throws IOException {
        long jA;
        boolean z10 = true;
        boolean z11 = j10 + j11 == this.f51015h || j11 == -1;
        if (j11 != -1) {
            try {
                jA = this.f51008a.a(this.f51010c.a().i(j10).h(j11).a());
            } catch (IOException unused) {
                com.google.android.exoplayer2.upstream.q.a(this.f51008a);
                z10 = false;
                jA = -1;
            }
        } else {
            z10 = false;
            jA = -1;
        }
        if (!z10) {
            g();
            try {
                jA = this.f51008a.a(this.f51010c.a().i(j10).h(-1L).a());
            } catch (IOException e10) {
                com.google.android.exoplayer2.upstream.q.a(this.f51008a);
                throw e10;
            }
        }
        if (z11 && jA != -1) {
            try {
                e(jA + j10);
            } catch (IOException e11) {
                com.google.android.exoplayer2.upstream.q.a(this.f51008a);
                throw e11;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            g();
            com.google.android.exoplayer2.upstream.cache.a aVar = this.f51008a;
            byte[] bArr = this.f51012e;
            i10 = aVar.read(bArr, 0, bArr.length);
            if (i10 != -1) {
                d(i10);
                i11 += i10;
            }
        }
        if (z11) {
            e(j10 + ((long) i11));
        }
        this.f51008a.close();
        return i11;
    }

    private void g() throws InterruptedIOException {
        if (this.f51017j) {
            throw new InterruptedIOException();
        }
    }

    @k1
    public void a() throws IOException {
        g();
        Cache cache = this.f51009b;
        String str = this.f51011d;
        com.google.android.exoplayer2.upstream.r rVar = this.f51010c;
        this.f51016i = cache.w(str, rVar.f51200g, rVar.f51201h);
        com.google.android.exoplayer2.upstream.r rVar2 = this.f51010c;
        long j10 = rVar2.f51201h;
        if (j10 != -1) {
            this.f51015h = rVar2.f51200g + j10;
        } else {
            long jA = l.a(this.f51009b.n(this.f51011d));
            if (jA == -1) {
                jA = -1;
            }
            this.f51015h = jA;
        }
        a aVar = this.f51013f;
        if (aVar != null) {
            aVar.a(c(), this.f51016i, 0L);
        }
        while (true) {
            long j11 = this.f51015h;
            if (j11 != -1 && this.f51014g >= j11) {
                return;
            }
            g();
            long j12 = this.f51015h;
            long jY = this.f51009b.y(this.f51011d, this.f51014g, j12 == -1 ? Long.MAX_VALUE : j12 - this.f51014g);
            if (jY > 0) {
                this.f51014g += jY;
            } else {
                long j13 = -jY;
                if (j13 == Long.MAX_VALUE) {
                    j13 = -1;
                }
                long j14 = this.f51014g;
                this.f51014g = j14 + f(j14, j13);
            }
        }
    }

    public void b() {
        this.f51017j = true;
    }
}
