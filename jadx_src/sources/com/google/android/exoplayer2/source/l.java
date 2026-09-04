package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l implements p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f48511m = "DefaultMediaSourceFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o.a f48512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private a f48514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.ui.c f48515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.upstream.g0 f48516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f48517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f48518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f48519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f48520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f48521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48522l;

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public interface a {
        @androidx.annotation.p0
        com.google.android.exoplayer2.source.ads.e a(i2.b bVar);
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.o.a f48523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.q f48524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, com.google.common.base.c0<p0>> f48525c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<Integer> f48526d = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<Integer, p0> f48527e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private HttpDataSource.b f48528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.drm.u f48530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.drm.x f48531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.upstream.g0 f48532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private List<StreamKey> f48533k;

        public b(com.google.android.exoplayer2.upstream.o.a aVar, com.google.android.exoplayer2.extractor.q qVar) {
            this.f48523a = aVar;
            this.f48524b = qVar;
        }

        private void f() {
            n(0);
            n(1);
            n(2);
            n(3);
            n(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ p0 i(Class cls) {
            return l.r(cls, this.f48523a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ p0 j(Class cls) {
            return l.r(cls, this.f48523a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ p0 k(Class cls) {
            return l.r(cls, this.f48523a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ p0 m() {
            return new w0.b(this.f48523a, this.f48524b);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006d  */
        @androidx.annotation.p0
        private com.google.common.base.c0<p0> n(int i10) {
            com.google.common.base.c0<p0> c0Var;
            if (this.f48525c.containsKey(Integer.valueOf(i10))) {
                return this.f48525c.get(Integer.valueOf(i10));
            }
            com.google.common.base.c0<p0> c0Var2 = null;
            try {
                if (i10 == 0) {
                    final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(p0.class);
                    c0Var = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.source.m
                        @Override // com.google.common.base.c0
                        public final Object get() {
                            return this.f48542b.i(clsAsSubclass);
                        }
                    };
                } else if (i10 == 1) {
                    final Class clsAsSubclass2 = SsMediaSource.Factory.class.asSubclass(p0.class);
                    c0Var = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.source.n
                        @Override // com.google.common.base.c0
                        public final Object get() {
                            return this.f48588b.j(clsAsSubclass2);
                        }
                    };
                } else {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            final Class clsAsSubclass3 = RtspMediaSource.Factory.class.asSubclass(p0.class);
                            c0Var = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.source.p
                                @Override // com.google.common.base.c0
                                public final Object get() {
                                    return l.k(clsAsSubclass3);
                                }
                            };
                        } else if (i10 == 4) {
                            c0Var2 = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.source.q
                                @Override // com.google.common.base.c0
                                public final Object get() {
                                    return this.f48612b.m();
                                }
                            };
                        }
                        this.f48525c.put(Integer.valueOf(i10), c0Var2);
                        if (c0Var2 != null) {
                            this.f48526d.add(Integer.valueOf(i10));
                        }
                        return c0Var2;
                    }
                    final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(p0.class);
                    c0Var = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.source.o
                        @Override // com.google.common.base.c0
                        public final Object get() {
                            return this.f48602b.k(clsAsSubclass4);
                        }
                    };
                }
                c0Var2 = c0Var;
            } catch (ClassNotFoundException unused) {
            }
            this.f48525c.put(Integer.valueOf(i10), c0Var2);
            if (c0Var2 != null) {
                this.f48526d.add(Integer.valueOf(i10));
            }
            return c0Var2;
        }

        @androidx.annotation.p0
        public p0 g(int i10) {
            p0 p0Var = this.f48527e.get(Integer.valueOf(i10));
            if (p0Var != null) {
                return p0Var;
            }
            com.google.common.base.c0<p0> c0VarN = n(i10);
            if (c0VarN == null) {
                return null;
            }
            p0 p0Var2 = c0VarN.get();
            HttpDataSource.b bVar = this.f48528f;
            if (bVar != null) {
                p0Var2.h(bVar);
            }
            String str = this.f48529g;
            if (str != null) {
                p0Var2.a(str);
            }
            com.google.android.exoplayer2.drm.u uVar = this.f48530h;
            if (uVar != null) {
                p0Var2.i(uVar);
            }
            com.google.android.exoplayer2.drm.x xVar = this.f48531i;
            if (xVar != null) {
                p0Var2.c(xVar);
            }
            com.google.android.exoplayer2.upstream.g0 g0Var = this.f48532j;
            if (g0Var != null) {
                p0Var2.e(g0Var);
            }
            List<StreamKey> list = this.f48533k;
            if (list != null) {
                p0Var2.f(list);
            }
            this.f48527e.put(Integer.valueOf(i10), p0Var2);
            return p0Var2;
        }

        public int[] h() {
            f();
            return Ints.B(this.f48526d);
        }

        public void o(@androidx.annotation.p0 HttpDataSource.b bVar) {
            this.f48528f = bVar;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().h(bVar);
            }
        }

        public void p(@androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar) {
            this.f48530h = uVar;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().i(uVar);
            }
        }

        public void q(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar) {
            this.f48531i = xVar;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().c(xVar);
            }
        }

        public void r(@androidx.annotation.p0 String str) {
            this.f48529g = str;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().a(str);
            }
        }

        public void s(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
            this.f48532j = g0Var;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().e(g0Var);
            }
        }

        public void t(@androidx.annotation.p0 List<StreamKey> list) {
            this.f48533k = list;
            Iterator<p0> it = this.f48527e.values().iterator();
            while (it.hasNext()) {
                it.next().f(list);
            }
        }
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class c implements com.google.android.exoplayer2.extractor.k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a2 f48534d;

        public c(a2 a2Var) {
            this.f48534d = a2Var;
        }

        @Override // com.google.android.exoplayer2.extractor.k
        public void a(long j10, long j11) {
        }

        @Override // com.google.android.exoplayer2.extractor.k
        public void b(com.google.android.exoplayer2.extractor.m mVar) {
            com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(0, 3);
            mVar.t(new com.google.android.exoplayer2.extractor.b0.b(com.google.android.exoplayer2.j.f46377b));
            mVar.n();
            e0VarB.d(this.f48534d.c().e0(com.google.android.exoplayer2.util.y.f51577i0).I(this.f48534d.f43593m).E());
        }

        @Override // com.google.android.exoplayer2.extractor.k
        public boolean f(com.google.android.exoplayer2.extractor.l lVar) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.k
        public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
            return lVar.c(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.k
        public void release() {
        }
    }

    public l(Context context) {
        this(new com.google.android.exoplayer2.upstream.v.a(context));
    }

    public l(Context context, com.google.android.exoplayer2.extractor.q qVar) {
        this(new com.google.android.exoplayer2.upstream.v.a(context), qVar);
    }

    public l(com.google.android.exoplayer2.upstream.o.a aVar) {
        this(aVar, new com.google.android.exoplayer2.extractor.h());
    }

    public l(com.google.android.exoplayer2.upstream.o.a aVar, com.google.android.exoplayer2.extractor.q qVar) {
        this.f48512b = aVar;
        this.f48513c = new b(aVar, qVar);
        this.f48517g = com.google.android.exoplayer2.j.f46377b;
        this.f48518h = com.google.android.exoplayer2.j.f46377b;
        this.f48519i = com.google.android.exoplayer2.j.f46377b;
        this.f48520j = -3.4028235E38f;
        this.f48521k = -3.4028235E38f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ p0 k(Class cls) {
        return q(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] n(a2 a2Var) {
        com.google.android.exoplayer2.extractor.k[] kVarArr = new com.google.android.exoplayer2.extractor.k[1];
        com.google.android.exoplayer2.text.i iVar = com.google.android.exoplayer2.text.i.f49631a;
        kVarArr[0] = iVar.a(a2Var) ? new com.google.android.exoplayer2.text.j(iVar.b(a2Var), a2Var) : new c(a2Var);
        return kVarArr;
    }

    private static f0 o(i2 i2Var, f0 f0Var) {
        i2.d dVar = i2Var.f46273g;
        long j10 = dVar.f46298b;
        if (j10 == 0 && dVar.f46299c == Long.MIN_VALUE && !dVar.f46301e) {
            return f0Var;
        }
        long jU0 = com.google.android.exoplayer2.util.u0.U0(j10);
        long jU1 = com.google.android.exoplayer2.util.u0.U0(i2Var.f46273g.f46299c);
        i2.d dVar2 = i2Var.f46273g;
        return new ClippingMediaSource(f0Var, jU0, jU1, !dVar2.f46302f, dVar2.f46300d, dVar2.f46301e);
    }

    private f0 p(i2 i2Var, f0 f0Var) {
        com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        i2.b bVar = i2Var.f46269c.f46348d;
        if (bVar == null) {
            return f0Var;
        }
        a aVar = this.f48514d;
        com.google.android.exoplayer2.ui.c cVar = this.f48515e;
        if (aVar == null || cVar == null) {
            com.google.android.exoplayer2.util.u.m(f48511m, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return f0Var;
        }
        com.google.android.exoplayer2.source.ads.e eVarA = aVar.a(bVar);
        if (eVarA == null) {
            com.google.android.exoplayer2.util.u.m(f48511m, "Playing media without ads, as no AdsLoader was provided.");
            return f0Var;
        }
        com.google.android.exoplayer2.upstream.r rVar = new com.google.android.exoplayer2.upstream.r(bVar.f46275a);
        Object obj = bVar.f46276b;
        return new AdsMediaSource(f0Var, rVar, obj != null ? obj : ImmutableList.F(i2Var.f46268b, i2Var.f46269c.f46345a, bVar.f46275a), this, eVarA, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p0 q(Class<? extends p0> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p0 r(Class<? extends p0> cls, com.google.android.exoplayer2.upstream.o.a aVar) {
        try {
            return cls.getConstructor(com.google.android.exoplayer2.upstream.o.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public l A(long j10) {
        this.f48518h = j10;
        return this;
    }

    public l B(float f10) {
        this.f48520j = f10;
        return this;
    }

    public l C(long j10) {
        this.f48517g = j10;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public l e(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
        this.f48516f = g0Var;
        this.f48513c.s(g0Var);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    @Deprecated
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public l f(@androidx.annotation.p0 List<StreamKey> list) {
        this.f48513c.t(list);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    public int[] b() {
        return this.f48513c.h();
    }

    @Override // com.google.android.exoplayer2.source.p0
    public /* synthetic */ f0 d(Uri uri) {
        return o0.a(this, uri);
    }

    @Override // com.google.android.exoplayer2.source.p0
    public f0 g(i2 i2Var) {
        com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        i2.h hVar = i2Var.f46269c;
        int iD0 = com.google.android.exoplayer2.util.u0.D0(hVar.f46345a, hVar.f46346b);
        p0 p0VarG = this.f48513c.g(iD0);
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("No suitable media source factory found for content type: ");
        sb2.append(iD0);
        com.google.android.exoplayer2.util.a.l(p0VarG, sb2.toString());
        i2.g.a aVarC = i2Var.f46271e.c();
        if (i2Var.f46271e.f46335b == com.google.android.exoplayer2.j.f46377b) {
            aVarC.k(this.f48517g);
        }
        if (i2Var.f46271e.f46338e == -3.4028235E38f) {
            aVarC.j(this.f48520j);
        }
        if (i2Var.f46271e.f46339f == -3.4028235E38f) {
            aVarC.h(this.f48521k);
        }
        if (i2Var.f46271e.f46336c == com.google.android.exoplayer2.j.f46377b) {
            aVarC.i(this.f48518h);
        }
        if (i2Var.f46271e.f46337d == com.google.android.exoplayer2.j.f46377b) {
            aVarC.g(this.f48519i);
        }
        i2.g gVarF = aVarC.f();
        if (!gVarF.equals(i2Var.f46271e)) {
            i2Var = i2Var.c().x(gVarF).a();
        }
        f0 f0VarG = p0VarG.g(i2Var);
        ImmutableList<i2.k> immutableList = ((i2.h) com.google.android.exoplayer2.util.u0.k(i2Var.f46269c)).f46351g;
        if (!immutableList.isEmpty()) {
            f0[] f0VarArr = new f0[immutableList.size() + 1];
            f0VarArr[0] = f0VarG;
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                if (this.f48522l) {
                    final a2 a2VarE = new a2.b().e0(immutableList.get(i10).f46355b).V(immutableList.get(i10).f46356c).g0(immutableList.get(i10).f46357d).c0(immutableList.get(i10).f46358e).U(immutableList.get(i10).f46359f).E();
                    f0VarArr[i10 + 1] = new w0.b(this.f48512b, new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.source.k
                        @Override // com.google.android.exoplayer2.extractor.q
                        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
                            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
                        }

                        @Override // com.google.android.exoplayer2.extractor.q
                        public final com.google.android.exoplayer2.extractor.k[] b() {
                            return l.n(a2VarE);
                        }
                    }).g(i2.f(immutableList.get(i10).f46354a.toString()));
                } else {
                    f0VarArr[i10 + 1] = new j1.b(this.f48512b).b(this.f48516f).a(immutableList.get(i10), com.google.android.exoplayer2.j.f46377b);
                }
            }
            f0VarG = new MergingMediaSource(f0VarArr);
        }
        return p(i2Var, o(i2Var, f0VarG));
    }

    public l m(boolean z10) {
        this.f48522l = z10;
        return this;
    }

    public l s(@androidx.annotation.p0 com.google.android.exoplayer2.ui.c cVar) {
        this.f48515e = cVar;
        return this;
    }

    public l t(@androidx.annotation.p0 a aVar) {
        this.f48514d = aVar;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public l h(@androidx.annotation.p0 HttpDataSource.b bVar) {
        this.f48513c.o(bVar);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public l i(@androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar) {
        this.f48513c.p(uVar);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public l c(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar) {
        this.f48513c.q(xVar);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public l a(@androidx.annotation.p0 String str) {
        this.f48513c.r(str);
        return this;
    }

    public l y(long j10) {
        this.f48519i = j10;
        return this;
    }

    public l z(float f10) {
        this.f48521k = f10;
        return this;
    }
}
