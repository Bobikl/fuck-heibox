package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.j1;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.source.h1;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.y1;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class RtspMediaSource extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f48632q = 8000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i2 f48633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d.a f48634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f48635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Uri f48636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f48637l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f48639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48640o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f48638m = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48641p = true;

    public static final class Factory implements com.google.android.exoplayer2.source.p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f48642b = 8000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f48643c = y1.f52054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f48644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f48645e;

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            return new int[]{3};
        }

        @Override // com.google.android.exoplayer2.source.p0
        public /* synthetic */ com.google.android.exoplayer2.source.f0 d(Uri uri) {
            return com.google.android.exoplayer2.source.o0.a(this, uri);
        }

        @Override // com.google.android.exoplayer2.source.p0
        public /* synthetic */ com.google.android.exoplayer2.source.p0 f(List list) {
            return com.google.android.exoplayer2.source.o0.b(this, list);
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource g(i2 i2Var) {
            com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
            return new RtspMediaSource(i2Var, this.f48644d ? new n0(this.f48642b) : new p0(this.f48642b), this.f48643c, this.f48645e);
        }

        public Factory k(boolean z10) {
            this.f48645e = z10;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory h(@androidx.annotation.p0 HttpDataSource.b bVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory i(@androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory c(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Factory a(@androidx.annotation.p0 String str) {
            return this;
        }

        public Factory p(boolean z10) {
            this.f48644d = z10;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Factory e(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
            return this;
        }

        public Factory r(@androidx.annotation.f0(from = 1) long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0);
            this.f48642b = j10;
            return this;
        }

        public Factory s(String str) {
            this.f48643c = str;
            return this;
        }
    }

    public static final class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(String str, Throwable th2) {
            super(str, th2);
        }

        public RtspPlaybackException(Throwable th2) {
            super(th2);
        }
    }

    public class a extends com.google.android.exoplayer2.source.s {
        a(RtspMediaSource rtspMediaSource, z3 z3Var) {
            super(z3Var);
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            bVar.f52098g = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            super.v(i10, dVar, j10);
            dVar.f52123m = true;
            return dVar;
        }
    }

    static {
        y1.a("goog.exo.rtsp");
    }

    @j1
    RtspMediaSource(i2 i2Var, d.a aVar, String str, boolean z10) {
        this.f48633h = i2Var;
        this.f48634i = aVar;
        this.f48635j = str;
        this.f48636k = ((i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c)).f46345a;
        this.f48637l = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(h0 h0Var) {
        this.f48638m = u0.U0(h0Var.a());
        this.f48639n = !h0Var.c();
        this.f48640o = h0Var.c();
        this.f48641p = false;
        J();
    }

    private void J() {
        z3 h1Var = new h1(this.f48638m, this.f48639n, false, this.f48640o, (Object) null, this.f48633h);
        if (this.f48641p) {
            h1Var = new a(this, h1Var);
        }
        E(h1Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        J();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f48633h;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public com.google.android.exoplayer2.source.c0 h(com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        return new s(bVar, this.f48634i, this.f48636k, new s.c() { // from class: com.google.android.exoplayer2.source.rtsp.w
            @Override // com.google.android.exoplayer2.source.rtsp.s.c
            public final void a(h0 h0Var) {
                this.f48969a.I(h0Var);
            }
        }, this.f48635j, this.f48637l);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(com.google.android.exoplayer2.source.c0 c0Var) {
        ((s) c0Var).S();
    }
}
