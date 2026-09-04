package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c1;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RtspMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements com.google.android.exoplayer2.source.c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f48932v = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f48933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f48934c = u0.y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f48935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f48936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<e> f48937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<d> f48938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f48939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.d.a f48940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.source.c0.a f48941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImmutableList<n1> f48942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private IOException f48943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private RtspMediaSource.RtspPlaybackException f48944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f48945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f48946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f48948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f48949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f48950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f48951t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f48952u;

    /* JADX INFO: compiled from: RtspMediaPeriod.java */
    public final class b implements com.google.android.exoplayer2.extractor.m, Loader.b<com.google.android.exoplayer2.source.rtsp.f>, c1.d, n.g, n.e {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.g
        public void a(String str, @androidx.annotation.p0 Throwable th2) {
            s.this.f48943l = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public com.google.android.exoplayer2.extractor.e0 b(int i10, int i11) {
            return ((e) com.google.android.exoplayer2.util.a.g((e) s.this.f48937f.get(i10))).f48960c;
        }

        @Override // com.google.android.exoplayer2.source.c1.d
        public void c(a2 a2Var) {
            Handler handler = s.this.f48934c;
            final s sVar = s.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.y(sVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.e
        public void d() {
            s.this.f48936e.g0(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.e
        public void e(long j10, ImmutableList<j0> immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                arrayList.add((String) com.google.android.exoplayer2.util.a.g(immutableList.get(i10).f48790c.getPath()));
            }
            for (int i11 = 0; i11 < s.this.f48938g.size(); i11++) {
                d dVar = (d) s.this.f48938g.get(i11);
                if (!arrayList.contains(dVar.c().getPath())) {
                    s sVar = s.this;
                    String strValueOf = String.valueOf(dVar.c());
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 40);
                    sb2.append("Server did not provide timing for track ");
                    sb2.append(strValueOf);
                    sVar.f48944m = new RtspMediaSource.RtspPlaybackException(sb2.toString());
                    return;
                }
            }
            for (int i12 = 0; i12 < immutableList.size(); i12++) {
                j0 j0Var = immutableList.get(i12);
                com.google.android.exoplayer2.source.rtsp.f fVarL = s.this.L(j0Var.f48790c);
                if (fVarL != null) {
                    fVarL.h(j0Var.f48788a);
                    fVarL.g(j0Var.f48789b);
                    if (s.this.O()) {
                        fVarL.f(j10, j0Var.f48788a);
                    }
                }
            }
            if (s.this.O()) {
                s.this.f48946o = com.google.android.exoplayer2.j.f46377b;
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.e
        public void f(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            s.this.f48944m = rtspPlaybackException;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.g
        public void g(h0 h0Var, ImmutableList<x> immutableList) {
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                x xVar = immutableList.get(i10);
                s sVar = s.this;
                e eVar = sVar.new e(xVar, i10, sVar.f48940i);
                s.this.f48937f.add(eVar);
                eVar.i();
            }
            s.this.f48939h.a(h0Var);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void p(com.google.android.exoplayer2.source.rtsp.f fVar, long j10, long j11, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void q(com.google.android.exoplayer2.source.rtsp.f fVar, long j10, long j11) {
            if (s.this.e() == 0) {
                if (s.this.f48952u) {
                    return;
                }
                s.this.T();
                s.this.f48952u = true;
                return;
            }
            for (int i10 = 0; i10 < s.this.f48937f.size(); i10++) {
                e eVar = (e) s.this.f48937f.get(i10);
                if (eVar.f48958a.f48955b == fVar) {
                    eVar.c();
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public void n() {
            Handler handler = s.this.f48934c;
            final s sVar = s.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.u
                @Override // java.lang.Runnable
                public final void run() {
                    s.y(sVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Loader.c s(com.google.android.exoplayer2.source.rtsp.f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!s.this.f48949r) {
                s.this.f48943l = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                s.this.f48944m = new RtspMediaSource.RtspPlaybackException(fVar.f48702b.f48976b.toString(), iOException);
            } else if (s.b(s.this) < 3) {
                return Loader.f50883i;
            }
            return Loader.f50885k;
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public void t(com.google.android.exoplayer2.extractor.b0 b0Var) {
        }
    }

    /* JADX INFO: compiled from: RtspMediaPeriod.java */
    public interface c {
        void a(h0 h0Var);
    }

    /* JADX INFO: compiled from: RtspMediaPeriod.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f48954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.rtsp.f f48955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48956c;

        public d(x xVar, int i10, com.google.android.exoplayer2.source.rtsp.d.a aVar) {
            this.f48954a = xVar;
            this.f48955b = new com.google.android.exoplayer2.source.rtsp.f(i10, xVar, new com.google.android.exoplayer2.source.rtsp.f.a() { // from class: com.google.android.exoplayer2.source.rtsp.v
                @Override // com.google.android.exoplayer2.source.rtsp.f.a
                public final void a(String str, d dVar) {
                    this.f48968a.f(str, dVar);
                }
            }, s.this.f48935d, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, com.google.android.exoplayer2.source.rtsp.d dVar) {
            this.f48956c = str;
            y.b bVarR = dVar.r();
            if (bVarR != null) {
                s.this.f48936e.Y(dVar.getLocalPort(), bVarR);
                s.this.f48952u = true;
            }
            s.this.Q();
        }

        public Uri c() {
            return this.f48955b.f48702b.f48976b;
        }

        public String d() {
            com.google.android.exoplayer2.util.a.k(this.f48956c);
            return this.f48956c;
        }

        public boolean e() {
            return this.f48956c != null;
        }
    }

    /* JADX INFO: compiled from: RtspMediaPeriod.java */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f48958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Loader f48959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c1 f48960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f48961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f48962e;

        public e(x xVar, int i10, com.google.android.exoplayer2.source.rtsp.d.a aVar) {
            this.f48958a = s.this.new d(xVar, i10, aVar);
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb2.append(i10);
            this.f48959b = new Loader(sb2.toString());
            c1 c1VarL = c1.l(s.this.f48933b);
            this.f48960c = c1VarL;
            c1VarL.e0(s.this.f48935d);
        }

        public void c() {
            if (this.f48961d) {
                return;
            }
            this.f48958a.f48955b.c();
            this.f48961d = true;
            s.this.V();
        }

        public long d() {
            return this.f48960c.A();
        }

        public boolean e() {
            return this.f48960c.L(this.f48961d);
        }

        public int f(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            return this.f48960c.T(b2Var, decoderInputBuffer, i10, this.f48961d);
        }

        public void g() {
            if (this.f48962e) {
                return;
            }
            this.f48959b.l();
            this.f48960c.U();
            this.f48962e = true;
        }

        public void h(long j10) {
            if (this.f48961d) {
                return;
            }
            this.f48958a.f48955b.e();
            this.f48960c.W();
            this.f48960c.c0(j10);
        }

        public void i() {
            this.f48959b.n(this.f48958a.f48955b, s.this.f48935d, 0);
        }
    }

    /* JADX INFO: compiled from: RtspMediaPeriod.java */
    public final class f implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48964b;

        public f(int i10) {
            this.f48964b = i10;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws RtspMediaSource.RtspPlaybackException {
            if (s.this.f48944m != null) {
                throw s.this.f48944m;
            }
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            return s.this.R(this.f48964b, b2Var, decoderInputBuffer, i10);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return s.this.N(this.f48964b);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            return 0;
        }
    }

    public s(com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.source.rtsp.d.a aVar, Uri uri, c cVar, String str, boolean z10) {
        this.f48933b = bVar;
        this.f48940i = aVar;
        this.f48939h = cVar;
        b bVar2 = new b();
        this.f48935d = bVar2;
        this.f48936e = new n(bVar2, bVar2, str, uri, z10);
        this.f48937f = new ArrayList();
        this.f48938g = new ArrayList();
        this.f48946o = com.google.android.exoplayer2.j.f46377b;
    }

    private static ImmutableList<n1> K(ImmutableList<e> immutableList) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            aVar.a(new n1((a2) com.google.android.exoplayer2.util.a.g(immutableList.get(i10).f48960c.G())));
        }
        return aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public com.google.android.exoplayer2.source.rtsp.f L(Uri uri) {
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            if (!this.f48937f.get(i10).f48961d) {
                d dVar = this.f48937f.get(i10).f48958a;
                if (dVar.c().equals(uri)) {
                    return dVar.f48955b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O() {
        return this.f48946o != com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.f48948q || this.f48949r) {
            return;
        }
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            if (this.f48937f.get(i10).f48960c.G() == null) {
                return;
            }
        }
        this.f48949r = true;
        this.f48942k = K(ImmutableList.v(this.f48937f));
        ((com.google.android.exoplayer2.source.c0.a) com.google.android.exoplayer2.util.a.g(this.f48941j)).q(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        boolean zE = true;
        for (int i10 = 0; i10 < this.f48938g.size(); i10++) {
            zE &= this.f48938g.get(i10).e();
        }
        if (zE && this.f48950s) {
            this.f48936e.e0(this.f48938g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void T() {
        this.f48936e.Z();
        com.google.android.exoplayer2.source.rtsp.d.a aVarA = this.f48940i.a();
        if (aVarA == null) {
            this.f48944m = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f48937f.size());
        ArrayList arrayList2 = new ArrayList(this.f48938g.size());
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            e eVar = this.f48937f.get(i10);
            if (eVar.f48961d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f48958a.f48954a, i10, aVarA);
                arrayList.add(eVar2);
                eVar2.i();
                if (this.f48938g.contains(eVar.f48958a)) {
                    arrayList2.add(eVar2.f48958a);
                }
            }
        }
        ImmutableList immutableListV = ImmutableList.v(this.f48937f);
        this.f48937f.clear();
        this.f48937f.addAll(arrayList);
        this.f48938g.clear();
        this.f48938g.addAll(arrayList2);
        for (int i11 = 0; i11 < immutableListV.size(); i11++) {
            ((e) immutableListV.get(i11)).c();
        }
    }

    private boolean U(long j10) {
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            if (!this.f48937f.get(i10).f48960c.a0(j10, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f48947p = true;
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            this.f48947p &= this.f48937f.get(i10).f48961d;
        }
    }

    static /* synthetic */ int b(s sVar) {
        int i10 = sVar.f48951t;
        sVar.f48951t = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void y(s sVar) {
        sVar.P();
    }

    @Override // com.google.android.exoplayer2.source.c0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ImmutableList<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list) {
        return ImmutableList.B();
    }

    boolean N(int i10) {
        return this.f48937f.get(i10).e();
    }

    int R(int i10, b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i11) {
        return this.f48937f.get(i10).f(b2Var, decoderInputBuffer, i11);
    }

    public void S() {
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            this.f48937f.get(i10).g();
        }
        u0.p(this.f48936e);
        this.f48948q = true;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return !this.f48947p;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        return a();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        if (this.f48947p || this.f48937f.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.f48946o;
        }
        long jMin = Long.MAX_VALUE;
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            e eVar = this.f48937f.get(i10);
            if (!eVar.f48961d) {
                jMin = Math.min(jMin, eVar.d());
                z10 = false;
            }
        }
        return (z10 || jMin == Long.MIN_VALUE) ? this.f48945n : jMin;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return e();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        if (O()) {
            return this.f48946o;
        }
        if (U(j10)) {
            return j10;
        }
        this.f48945n = j10;
        this.f48946o = j10;
        this.f48936e.a0(j10);
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            this.f48937f.get(i10).h(j10);
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            if (d1VarArr[i10] != null && (jVarArr[i10] == null || !zArr[i10])) {
                d1VarArr[i10] = null;
            }
        }
        this.f48938g.clear();
        for (int i11 = 0; i11 < jVarArr.length; i11++) {
            com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i11];
            if (jVar != null) {
                n1 n1VarH = jVar.h();
                int iIndexOf = ((ImmutableList) com.google.android.exoplayer2.util.a.g(this.f48942k)).indexOf(n1VarH);
                this.f48938g.add(((e) com.google.android.exoplayer2.util.a.g(this.f48937f.get(iIndexOf))).f48958a);
                if (this.f48942k.contains(n1VarH) && d1VarArr[i11] == null) {
                    d1VarArr[i11] = new f(iIndexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f48937f.size(); i12++) {
            e eVar = this.f48937f.get(i12);
            if (!this.f48938g.contains(eVar.f48958a)) {
                eVar.c();
            }
        }
        this.f48950s = true;
        Q();
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        com.google.android.exoplayer2.util.a.i(this.f48949r);
        return new p1((n1[]) ((ImmutableList) com.google.android.exoplayer2.util.a.g(this.f48942k)).toArray(new n1[0]));
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(com.google.android.exoplayer2.source.c0.a aVar, long j10) {
        this.f48941j = aVar;
        try {
            this.f48936e.f0();
        } catch (IOException e10) {
            this.f48943l = e10;
            u0.p(this.f48936e);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        IOException iOException = this.f48943l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        if (O()) {
            return;
        }
        for (int i10 = 0; i10 < this.f48937f.size(); i10++) {
            e eVar = this.f48937f.get(i10);
            if (!eVar.f48961d) {
                eVar.f48960c.q(j10, z10, true);
            }
        }
    }
}
