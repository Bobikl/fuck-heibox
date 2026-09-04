package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.z3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r1 implements s1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.common.base.c0<String> f43807h = new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.analytics.q1
        @Override // com.google.common.base.c0
        public final Object get() {
            return r1.l();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Random f43808i = new Random();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f43809j = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z3.d f43810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z3.b f43811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f43812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.base.c0<String> f43813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s1.a f43814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z3 f43815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private String f43816g;

    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f43819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.f0.a f43820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f43821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f43822f;

        public a(String str, @androidx.annotation.p0 int i10, com.google.android.exoplayer2.source.f0.a aVar) {
            this.f43817a = str;
            this.f43818b = i10;
            this.f43819c = aVar == null ? -1L : aVar.f47722d;
            if (aVar == null || !aVar.c()) {
                return;
            }
            this.f43820d = aVar;
        }

        private int l(z3 z3Var, z3 z3Var2, int i10) {
            if (i10 >= z3Var.w()) {
                if (i10 < z3Var2.w()) {
                    return i10;
                }
                return -1;
            }
            z3Var.u(i10, r1.this.f43810a);
            for (int i11 = r1.this.f43810a.f52126p; i11 <= r1.this.f43810a.f52127q; i11++) {
                int iG = z3Var2.g(z3Var.t(i11));
                if (iG != -1) {
                    return z3Var2.k(iG, r1.this.f43811b).f52095d;
                }
            }
            return -1;
        }

        public boolean i(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (aVar == null) {
                return i10 == this.f43818b;
            }
            com.google.android.exoplayer2.source.f0.a aVar2 = this.f43820d;
            if (aVar2 == null) {
                return !aVar.c() && aVar.f47722d == this.f43819c;
            }
            return aVar.f47722d == aVar2.f47722d && aVar.f47720b == aVar2.f47720b && aVar.f47721c == aVar2.f47721c;
        }

        public boolean j(p1.b bVar) {
            long j10 = this.f43819c;
            if (j10 == -1) {
                return false;
            }
            com.google.android.exoplayer2.source.f0.a aVar = bVar.f43784d;
            if (aVar == null) {
                return this.f43818b != bVar.f43783c;
            }
            if (aVar.f47722d > j10) {
                return true;
            }
            if (this.f43820d == null) {
                return false;
            }
            int iG = bVar.f43782b.g(aVar.f47719a);
            int iG2 = bVar.f43782b.g(this.f43820d.f47719a);
            com.google.android.exoplayer2.source.f0.a aVar2 = bVar.f43784d;
            if (aVar2.f47722d < this.f43820d.f47722d || iG < iG2) {
                return false;
            }
            if (iG > iG2) {
                return true;
            }
            if (!aVar2.c()) {
                int i10 = bVar.f43784d.f47723e;
                return i10 == -1 || i10 > this.f43820d.f47720b;
            }
            com.google.android.exoplayer2.source.f0.a aVar3 = bVar.f43784d;
            int i11 = aVar3.f47720b;
            int i12 = aVar3.f47721c;
            com.google.android.exoplayer2.source.f0.a aVar4 = this.f43820d;
            int i13 = aVar4.f47720b;
            return i11 > i13 || (i11 == i13 && i12 > aVar4.f47721c);
        }

        public void k(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (this.f43819c == -1 && i10 == this.f43818b && aVar != null) {
                this.f43819c = aVar.f47722d;
            }
        }

        public boolean m(z3 z3Var, z3 z3Var2) {
            int iL = l(z3Var, z3Var2, this.f43818b);
            this.f43818b = iL;
            if (iL == -1) {
                return false;
            }
            com.google.android.exoplayer2.source.f0.a aVar = this.f43820d;
            return aVar == null || z3Var2.g(aVar.f47719a) != -1;
        }
    }

    public r1() {
        this(f43807h);
    }

    public r1(com.google.common.base.c0<String> c0Var) {
        this.f43813d = c0Var;
        this.f43810a = new z3.d();
        this.f43811b = new z3.b();
        this.f43812c = new HashMap<>();
        this.f43815f = z3.f52082b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l() {
        byte[] bArr = new byte[12];
        f43808i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a m(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
        a aVar2 = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar3 : this.f43812c.values()) {
            aVar3.k(i10, aVar);
            if (aVar3.i(i10, aVar)) {
                long j11 = aVar3.f43819c;
                if (j11 == -1 || j11 < j10) {
                    aVar2 = aVar3;
                    j10 = j11;
                } else if (j11 == j10 && ((a) com.google.android.exoplayer2.util.u0.k(aVar2)).f43820d != null && aVar3.f43820d != null) {
                    aVar2 = aVar3;
                }
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        String str = this.f43813d.get();
        a aVar4 = new a(str, i10, aVar);
        this.f43812c.put(str, aVar4);
        return aVar4;
    }

    @mk.m({com.google.android.gms.common.internal.s.a.f52543a})
    private void n(p1.b bVar) {
        if (bVar.f43782b.x()) {
            this.f43816g = null;
            return;
        }
        a aVar = this.f43812c.get(this.f43816g);
        a aVarM = m(bVar.f43783c, bVar.f43784d);
        this.f43816g = aVarM.f43817a;
        f(bVar);
        com.google.android.exoplayer2.source.f0.a aVar2 = bVar.f43784d;
        if (aVar2 == null || !aVar2.c()) {
            return;
        }
        if (aVar != null && aVar.f43819c == bVar.f43784d.f47722d && aVar.f43820d != null && aVar.f43820d.f47720b == bVar.f43784d.f47720b && aVar.f43820d.f47721c == bVar.f43784d.f47721c) {
            return;
        }
        com.google.android.exoplayer2.source.f0.a aVar3 = bVar.f43784d;
        this.f43814e.z0(bVar, m(bVar.f43783c, new com.google.android.exoplayer2.source.f0.a(aVar3.f47719a, aVar3.f47722d)).f43817a, aVarM.f43817a);
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized void a(p1.b bVar) {
        s1.a aVar;
        this.f43816g = null;
        Iterator<a> it = this.f43812c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f43821e && (aVar = this.f43814e) != null) {
                aVar.n0(bVar, next.f43817a, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized void b(p1.b bVar, int i10) {
        com.google.android.exoplayer2.util.a.g(this.f43814e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f43812c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(bVar)) {
                it.remove();
                if (next.f43821e) {
                    boolean zEquals = next.f43817a.equals(this.f43816g);
                    boolean z11 = z10 && zEquals && next.f43822f;
                    if (zEquals) {
                        this.f43816g = null;
                    }
                    this.f43814e.n0(bVar, next.f43817a, z11);
                }
            }
        }
        n(bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized void c(p1.b bVar) {
        com.google.android.exoplayer2.util.a.g(this.f43814e);
        z3 z3Var = this.f43815f;
        this.f43815f = bVar.f43782b;
        Iterator<a> it = this.f43812c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(z3Var, this.f43815f)) {
                it.remove();
                if (next.f43821e) {
                    if (next.f43817a.equals(this.f43816g)) {
                        this.f43816g = null;
                    }
                    this.f43814e.n0(bVar, next.f43817a, false);
                }
            }
        }
        n(bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    @androidx.annotation.p0
    public synchronized String d() {
        return this.f43816g;
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public void e(s1.a aVar) {
        this.f43814e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized void f(p1.b bVar) {
        p1.b bVar2;
        a aVar;
        com.google.android.exoplayer2.util.a.g(this.f43814e);
        if (bVar.f43782b.x()) {
            return;
        }
        a aVar2 = this.f43812c.get(this.f43816g);
        if (bVar.f43784d != null && aVar2 != null) {
            boolean z10 = false;
            if (aVar2.f43819c != -1 ? bVar.f43784d.f47722d < aVar2.f43819c : aVar2.f43818b != bVar.f43783c) {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        a aVarM = m(bVar.f43783c, bVar.f43784d);
        if (this.f43816g == null) {
            this.f43816g = aVarM.f43817a;
        }
        com.google.android.exoplayer2.source.f0.a aVar3 = bVar.f43784d;
        if (aVar3 != null && aVar3.c()) {
            com.google.android.exoplayer2.source.f0.a aVar4 = bVar.f43784d;
            com.google.android.exoplayer2.source.f0.a aVar5 = new com.google.android.exoplayer2.source.f0.a(aVar4.f47719a, aVar4.f47722d, aVar4.f47720b);
            a aVarM2 = m(bVar.f43783c, aVar5);
            if (!aVarM2.f43821e) {
                aVarM2.f43821e = true;
                bVar.f43782b.m(bVar.f43784d.f47719a, this.f43811b);
                this.f43814e.u0(new p1.b(bVar.f43781a, bVar.f43782b, bVar.f43783c, aVar5, Math.max(0L, com.google.android.exoplayer2.util.u0.B1(this.f43811b.j(bVar.f43784d.f47720b)) + this.f43811b.r()), bVar.f43786f, bVar.f43787g, bVar.f43788h, bVar.f43789i, bVar.f43790j), aVarM2.f43817a);
            }
        }
        if (aVarM.f43821e) {
            bVar2 = bVar;
            aVar = aVarM;
        } else {
            aVar = aVarM;
            aVar.f43821e = true;
            bVar2 = bVar;
            this.f43814e.u0(bVar2, aVar.f43817a);
        }
        if (aVar.f43817a.equals(this.f43816g) && !aVar.f43822f) {
            aVar.f43822f = true;
            this.f43814e.o0(bVar2, aVar.f43817a);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized boolean g(p1.b bVar, String str) {
        a aVar = this.f43812c.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.k(bVar.f43783c, bVar.f43784d);
        return aVar.i(bVar.f43783c, bVar.f43784d);
    }

    @Override // com.google.android.exoplayer2.analytics.s1
    public synchronized String h(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar) {
        return m(z3Var.m(aVar.f47719a, this.f43811b).f52095d, aVar).f43817a;
    }
}
