package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v implements o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f51264m = "DefaultDataSource";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f51265n = "asset";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f51266o = "content";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f51267p = "rtmp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f51268q = "udp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f51269r = "data";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f51270s = "rawresource";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f51271t = "android.resource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f51272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<u0> f51273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f51274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private o f51282l;

    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f51283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o.a f51284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private u0 f51285c;

        public a(Context context) {
            this(context, new x.b());
        }

        public a(Context context, o.a aVar) {
            this.f51283a = context.getApplicationContext();
            this.f51284b = aVar;
        }

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a() {
            v vVar = new v(this.f51283a, this.f51284b.a());
            u0 u0Var = this.f51285c;
            if (u0Var != null) {
                vVar.e(u0Var);
            }
            return vVar;
        }

        public a d(@androidx.annotation.p0 u0 u0Var) {
            this.f51285c = u0Var;
            return this;
        }
    }

    public v(Context context, o oVar) {
        this.f51272b = context.getApplicationContext();
        this.f51274d = (o) com.google.android.exoplayer2.util.a.g(oVar);
        this.f51273c = new ArrayList();
    }

    public v(Context context, @androidx.annotation.p0 String str, int i10, int i11, boolean z10) {
        this(context, new x.b().k(str).e(i10).i(i11).d(z10).a());
    }

    public v(Context context, @androidx.annotation.p0 String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    public v(Context context, boolean z10) {
        this(context, null, 8000, 8000, z10);
    }

    private o A() {
        if (this.f51281k == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f51272b);
            this.f51281k = rawResourceDataSource;
            p(rawResourceDataSource);
        }
        return this.f51281k;
    }

    private o B() {
        if (this.f51278h == null) {
            try {
                o oVar = (o) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f51278h = oVar;
                p(oVar);
            } catch (ClassNotFoundException unused) {
                com.google.android.exoplayer2.util.u.m(f51264m, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f51278h == null) {
                this.f51278h = this.f51274d;
            }
        }
        return this.f51278h;
    }

    private o C() {
        if (this.f51279i == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f51279i = udpDataSource;
            p(udpDataSource);
        }
        return this.f51279i;
    }

    private void D(@androidx.annotation.p0 o oVar, u0 u0Var) {
        if (oVar != null) {
            oVar.e(u0Var);
        }
    }

    private void p(o oVar) {
        for (int i10 = 0; i10 < this.f51273c.size(); i10++) {
            oVar.e(this.f51273c.get(i10));
        }
    }

    private o w() {
        if (this.f51276f == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f51272b);
            this.f51276f = assetDataSource;
            p(assetDataSource);
        }
        return this.f51276f;
    }

    private o x() {
        if (this.f51277g == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f51272b);
            this.f51277g = contentDataSource;
            p(contentDataSource);
        }
        return this.f51277g;
    }

    private o y() {
        if (this.f51280j == null) {
            l lVar = new l();
            this.f51280j = lVar;
            p(lVar);
        }
        return this.f51280j;
    }

    private o z() {
        if (this.f51275e == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f51275e = fileDataSource;
            p(fileDataSource);
        }
        return this.f51275e;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        com.google.android.exoplayer2.util.a.i(this.f51282l == null);
        String scheme = rVar.f51194a.getScheme();
        if (com.google.android.exoplayer2.util.u0.J0(rVar.f51194a)) {
            String path = rVar.f51194a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f51282l = z();
            } else {
                this.f51282l = w();
            }
        } else if (f51265n.equals(scheme)) {
            this.f51282l = w();
        } else if ("content".equals(scheme)) {
            this.f51282l = x();
        } else if (f51267p.equals(scheme)) {
            this.f51282l = B();
        } else if (f51268q.equals(scheme)) {
            this.f51282l = C();
        } else if ("data".equals(scheme)) {
            this.f51282l = y();
        } else if ("rawresource".equals(scheme) || f51271t.equals(scheme)) {
            this.f51282l = A();
        } else {
            this.f51282l = this.f51274d;
        }
        return this.f51282l.a(rVar);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        o oVar = this.f51282l;
        return oVar == null ? Collections.emptyMap() : oVar.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        o oVar = this.f51282l;
        if (oVar != null) {
            try {
                oVar.close();
            } finally {
                this.f51282l = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f51274d.e(u0Var);
        this.f51273c.add(u0Var);
        D(this.f51275e, u0Var);
        D(this.f51276f, u0Var);
        D(this.f51277g, u0Var);
        D(this.f51278h, u0Var);
        D(this.f51279i, u0Var);
        D(this.f51280j, u0Var);
        D(this.f51281k, u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        o oVar = this.f51282l;
        if (oVar == null) {
            return null;
        }
        return oVar.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((o) com.google.android.exoplayer2.util.a.g(this.f51282l)).read(bArr, i10, i11);
    }
}
