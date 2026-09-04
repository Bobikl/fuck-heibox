package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.u0;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.google.android.exoplayer2.upstream.o {
    public static final int A = 0;
    public static final int B = 1;
    private static final long C = 102400;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f50950w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f50951x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f50952y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f50953z = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cache f50954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f50955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final com.google.android.exoplayer2.upstream.o f50956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f50957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f50958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final c f50959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f50960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f50961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f50962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private Uri f50963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.upstream.r f50964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.upstream.r f50965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.upstream.o f50966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f50967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f50968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f50969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private h f50970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f50973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f50974v;

    /* JADX INFO: compiled from: CacheDataSource.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface c {
        void a(int i10);

        void b(long j10, long j11);
    }

    /* JADX INFO: compiled from: CacheDataSource.java */
    public static final class d implements com.google.android.exoplayer2.upstream.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f50975a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private com.google.android.exoplayer2.upstream.m.a f50977c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private com.google.android.exoplayer2.upstream.o.a f50980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private PriorityTaskManager f50981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f50982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f50983i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private c f50984j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.o.a f50976b = new FileDataSource.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g f50978d = g.f51000a;

        private a f(@p0 com.google.android.exoplayer2.upstream.o oVar, int i10, int i11) {
            com.google.android.exoplayer2.upstream.m mVarA;
            Cache cache = (Cache) com.google.android.exoplayer2.util.a.g(this.f50975a);
            if (this.f50979e || oVar == null) {
                mVarA = null;
            } else {
                com.google.android.exoplayer2.upstream.m.a aVar = this.f50977c;
                mVarA = aVar != null ? aVar.a() : new CacheDataSink.a().c(cache).a();
            }
            return new a(cache, oVar, this.f50976b.a(), mVarA, this.f50978d, i10, this.f50981g, i11, this.f50984j);
        }

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a() {
            com.google.android.exoplayer2.upstream.o.a aVar = this.f50980f;
            return f(aVar != null ? aVar.a() : null, this.f50983i, this.f50982h);
        }

        public a d() {
            com.google.android.exoplayer2.upstream.o.a aVar = this.f50980f;
            return f(aVar != null ? aVar.a() : null, this.f50983i | 1, -1000);
        }

        public a e() {
            return f(null, this.f50983i | 1, -1000);
        }

        @p0
        public Cache g() {
            return this.f50975a;
        }

        public g h() {
            return this.f50978d;
        }

        @p0
        public PriorityTaskManager i() {
            return this.f50981g;
        }

        public d j(Cache cache) {
            this.f50975a = cache;
            return this;
        }

        public d k(g gVar) {
            this.f50978d = gVar;
            return this;
        }

        public d l(com.google.android.exoplayer2.upstream.o.a aVar) {
            this.f50976b = aVar;
            return this;
        }

        public d m(@p0 com.google.android.exoplayer2.upstream.m.a aVar) {
            this.f50977c = aVar;
            this.f50979e = aVar == null;
            return this;
        }

        public d n(@p0 c cVar) {
            this.f50984j = cVar;
            return this;
        }

        public d o(int i10) {
            this.f50983i = i10;
            return this;
        }

        public d p(@p0 com.google.android.exoplayer2.upstream.o.a aVar) {
            this.f50980f = aVar;
            return this;
        }

        public d q(int i10) {
            this.f50982h = i10;
            return this;
        }

        public d r(@p0 PriorityTaskManager priorityTaskManager) {
            this.f50981g = priorityTaskManager;
            return this;
        }
    }

    /* JADX INFO: compiled from: CacheDataSource.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public a(Cache cache, @p0 com.google.android.exoplayer2.upstream.o oVar) {
        this(cache, oVar, 0);
    }

    public a(Cache cache, @p0 com.google.android.exoplayer2.upstream.o oVar, int i10) {
        this(cache, oVar, new FileDataSource(), new CacheDataSink(cache, 5242880L), i10, null);
    }

    public a(Cache cache, @p0 com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.o oVar2, @p0 com.google.android.exoplayer2.upstream.m mVar, int i10, @p0 c cVar) {
        this(cache, oVar, oVar2, mVar, i10, cVar, null);
    }

    public a(Cache cache, @p0 com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.o oVar2, @p0 com.google.android.exoplayer2.upstream.m mVar, int i10, @p0 c cVar, @p0 g gVar) {
        this(cache, oVar, oVar2, mVar, gVar, i10, null, 0, cVar);
    }

    private a(Cache cache, @p0 com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.o oVar2, @p0 com.google.android.exoplayer2.upstream.m mVar, @p0 g gVar, int i10, @p0 PriorityTaskManager priorityTaskManager, int i11, @p0 c cVar) {
        this.f50954b = cache;
        this.f50955c = oVar2;
        this.f50958f = gVar == null ? g.f51000a : gVar;
        this.f50960h = (i10 & 1) != 0;
        this.f50961i = (i10 & 2) != 0;
        this.f50962j = (i10 & 4) != 0;
        if (oVar != null) {
            oVar = priorityTaskManager != null ? new j0(oVar, priorityTaskManager, i11) : oVar;
            this.f50957e = oVar;
            this.f50956d = mVar != null ? new s0(oVar, mVar) : null;
        } else {
            this.f50957e = a0.f50930b;
            this.f50956d = null;
        }
        this.f50959g = cVar;
    }

    private boolean A() {
        return this.f50966n == this.f50957e;
    }

    private boolean B() {
        return this.f50966n == this.f50955c;
    }

    private boolean C() {
        return !B();
    }

    private boolean D() {
        return this.f50966n == this.f50956d;
    }

    private void E() {
        c cVar = this.f50959g;
        if (cVar == null || this.f50973u <= 0) {
            return;
        }
        cVar.b(this.f50954b.z(), this.f50973u);
        this.f50973u = 0L;
    }

    private void F(int i10) {
        c cVar = this.f50959g;
        if (cVar != null) {
            cVar.a(i10);
        }
    }

    private void G(com.google.android.exoplayer2.upstream.r rVar, boolean z10) throws IOException {
        h hVarQ;
        long jMin;
        com.google.android.exoplayer2.upstream.r rVarA;
        com.google.android.exoplayer2.upstream.o oVar;
        String str = (String) u0.k(rVar.f51202i);
        if (this.f50972t) {
            hVarQ = null;
        } else if (this.f50960h) {
            try {
                hVarQ = this.f50954b.q(str, this.f50968p, this.f50969q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            hVarQ = this.f50954b.x(str, this.f50968p, this.f50969q);
        }
        if (hVarQ == null) {
            oVar = this.f50957e;
            rVarA = rVar.a().i(this.f50968p).h(this.f50969q).a();
        } else if (hVarQ.f51004e) {
            Uri uriFromFile = Uri.fromFile((File) u0.k(hVarQ.f51005f));
            long j10 = hVarQ.f51002c;
            long j11 = this.f50968p - j10;
            long jMin2 = hVarQ.f51003d - j11;
            long j12 = this.f50969q;
            if (j12 != -1) {
                jMin2 = Math.min(jMin2, j12);
            }
            rVarA = rVar.a().j(uriFromFile).l(j10).i(j11).h(jMin2).a();
            oVar = this.f50955c;
        } else {
            if (hVarQ.c()) {
                jMin = this.f50969q;
            } else {
                jMin = hVarQ.f51003d;
                long j13 = this.f50969q;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
            }
            rVarA = rVar.a().i(this.f50968p).h(jMin).a();
            oVar = this.f50956d;
            if (oVar == null) {
                oVar = this.f50957e;
                this.f50954b.A(hVarQ);
                hVarQ = null;
            }
        }
        this.f50974v = (this.f50972t || oVar != this.f50957e) ? Long.MAX_VALUE : this.f50968p + C;
        if (z10) {
            com.google.android.exoplayer2.util.a.i(A());
            if (oVar == this.f50957e) {
                return;
            }
            try {
                p();
            } catch (Throwable th2) {
                if (!((h) u0.k(hVarQ)).b()) {
                    throw th2;
                }
                this.f50954b.A(hVarQ);
                throw th2;
            }
        }
        if (hVarQ != null && hVarQ.b()) {
            this.f50970r = hVarQ;
        }
        this.f50966n = oVar;
        this.f50965m = rVarA;
        this.f50967o = 0L;
        long jA = oVar.a(rVarA);
        n nVar = new n();
        if (rVarA.f51201h == -1 && jA != -1) {
            this.f50969q = jA;
            n.h(nVar, this.f50968p + jA);
        }
        if (C()) {
            Uri uri = oVar.getUri();
            this.f50963k = uri;
            n.i(nVar, rVar.f51194a.equals(uri) ^ true ? this.f50963k : null);
        }
        if (D()) {
            this.f50954b.o(str, nVar);
        }
    }

    private void H(String str) throws IOException {
        this.f50969q = 0L;
        if (D()) {
            n nVar = new n();
            n.h(nVar, this.f50968p);
            this.f50954b.o(str, nVar);
        }
    }

    private int I(com.google.android.exoplayer2.upstream.r rVar) {
        if (this.f50961i && this.f50971s) {
            return 0;
        }
        return (this.f50962j && rVar.f51201h == -1) ? 1 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void p() throws IOException {
        com.google.android.exoplayer2.upstream.o oVar = this.f50966n;
        if (oVar == null) {
            return;
        }
        try {
            oVar.close();
        } finally {
            this.f50965m = null;
            this.f50966n = null;
            h hVar = this.f50970r;
            if (hVar != null) {
                this.f50954b.A(hVar);
                this.f50970r = null;
            }
        }
    }

    private static Uri y(Cache cache, String str, Uri uri) {
        Uri uriB = l.b(cache.n(str));
        return uriB != null ? uriB : uri;
    }

    private void z(Throwable th2) {
        if (B() || (th2 instanceof Cache.CacheException)) {
            this.f50971s = true;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(com.google.android.exoplayer2.upstream.r rVar) throws IOException {
        try {
            String strA = this.f50958f.a(rVar);
            com.google.android.exoplayer2.upstream.r rVarA = rVar.a().g(strA).a();
            this.f50964l = rVarA;
            this.f50963k = y(this.f50954b, strA, rVarA.f51194a);
            this.f50968p = rVar.f51200g;
            int I = I(rVar);
            boolean z10 = I != -1;
            this.f50972t = z10;
            if (z10) {
                F(I);
            }
            if (this.f50972t) {
                this.f50969q = -1L;
            } else {
                long jA = l.a(this.f50954b.n(strA));
                this.f50969q = jA;
                if (jA != -1) {
                    long j10 = jA - rVar.f51200g;
                    this.f50969q = j10;
                    if (j10 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = rVar.f51201h;
            if (jMin != -1) {
                long j11 = this.f50969q;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f50969q = jMin;
            }
            long j12 = this.f50969q;
            if (j12 > 0 || j12 == -1) {
                G(rVarA, false);
            }
            long j13 = rVar.f51201h;
            return j13 != -1 ? j13 : this.f50969q;
        } catch (Throwable th2) {
            z(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return C() ? this.f50957e.b() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        this.f50964l = null;
        this.f50963k = null;
        this.f50968p = 0L;
        E();
        try {
            p();
        } catch (Throwable th2) {
            z(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(com.google.android.exoplayer2.upstream.u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f50955c.e(u0Var);
        this.f50957e.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @p0
    public Uri getUri() {
        return this.f50963k;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:9:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0041, B:16:0x0047, B:17:0x004d, B:19:0x005e, B:20:0x0062, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0080, B:33:0x008e), top: B:38:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10;
        if (i11 == 0) {
            return 0;
        }
        if (this.f50969q == 0) {
            return -1;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) com.google.android.exoplayer2.util.a.g(this.f50964l);
        com.google.android.exoplayer2.upstream.r rVar2 = (com.google.android.exoplayer2.upstream.r) com.google.android.exoplayer2.util.a.g(this.f50965m);
        try {
            if (this.f50968p >= this.f50974v) {
                G(rVar, true);
            }
            int i12 = ((com.google.android.exoplayer2.upstream.o) com.google.android.exoplayer2.util.a.g(this.f50966n)).read(bArr, i10, i11);
            if (i12 != -1) {
                if (B()) {
                    this.f50973u += (long) i12;
                }
                long j11 = i12;
                this.f50968p += j11;
                this.f50967o += j11;
                long j12 = this.f50969q;
                if (j12 != -1) {
                    this.f50969q = j12 - j11;
                }
            } else {
                if (!C()) {
                    j10 = this.f50969q;
                    if (j10 <= 0) {
                        if (j10 == -1) {
                        }
                    }
                    p();
                    G(rVar, false);
                    return read(bArr, i10, i11);
                }
                long j13 = rVar2.f51201h;
                if (j13 != -1 && this.f50967o >= j13) {
                    j10 = this.f50969q;
                    if (j10 <= 0) {
                        if (j10 == -1) {
                        }
                    }
                    p();
                    G(rVar, false);
                    return read(bArr, i10, i11);
                }
                H((String) u0.k(rVar.f51202i));
            }
            return i12;
        } catch (Throwable th2) {
            z(th2);
            throw th2;
        }
    }

    public Cache w() {
        return this.f50954b;
    }

    public g x() {
        return this.f50958f;
    }
}
