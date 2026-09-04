package com.google.android.exoplayer2;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f49341l = "MediaSourceList";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f49345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.n0.a f49346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.s.a f49347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<c, b> f49348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<c> f49349h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.upstream.u0 f49352k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.source.f1 f49350i = new com.google.android.exoplayer2.source.f1.a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<com.google.android.exoplayer2.source.c0, c> f49343b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Object, c> f49344c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f49342a = new ArrayList();

    /* JADX INFO: compiled from: MediaSourceList.java */
    public final class a implements com.google.android.exoplayer2.source.n0, com.google.android.exoplayer2.drm.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f49353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.exoplayer2.source.n0.a f49354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.s.a f49355d;

        public a(c cVar) {
            this.f49354c = t2.this.f49346e;
            this.f49355d = t2.this.f49347f;
            this.f49353b = cVar;
        }

        private boolean a(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            com.google.android.exoplayer2.source.f0.a aVarO;
            if (aVar != null) {
                aVarO = t2.o(this.f49353b, aVar);
                if (aVarO == null) {
                    return false;
                }
            } else {
                aVarO = null;
            }
            int iS = t2.s(this.f49353b, i10);
            com.google.android.exoplayer2.source.n0.a aVar2 = this.f49354c;
            if (aVar2.f48590a != iS || !com.google.android.exoplayer2.util.u0.c(aVar2.f48591b, aVarO)) {
                this.f49354c = t2.this.f49346e.F(iS, aVarO, 0L);
            }
            com.google.android.exoplayer2.drm.s.a aVar3 = this.f49355d;
            if (aVar3.f44752a == iS && com.google.android.exoplayer2.util.u0.c(aVar3.f44753b, aVarO)) {
                return true;
            }
            this.f49355d = t2.this.f49347f.u(iS, aVarO);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void A(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
            if (a(i10, aVar)) {
                this.f49354c.s(uVar, yVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void G(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.y yVar) {
            if (a(i10, aVar)) {
                this.f49354c.E(yVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void L(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (a(i10, aVar)) {
                this.f49355d.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void N(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f49355d.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void O(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f49354c.y(uVar, yVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void Q(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (a(i10, aVar)) {
                this.f49355d.j();
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void T(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.y yVar) {
            if (a(i10, aVar)) {
                this.f49354c.j(yVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void U(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
            if (a(i10, aVar)) {
                this.f49354c.B(uVar, yVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void W(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (a(i10, aVar)) {
                this.f49355d.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public /* synthetic */ void Y(int i10, com.google.android.exoplayer2.source.f0.a aVar) {
            com.google.android.exoplayer2.drm.l.d(this, i10, aVar);
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void j0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f49355d.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void q0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
            if (a(i10, aVar)) {
                this.f49354c.v(uVar, yVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void r0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            if (a(i10, aVar)) {
                this.f49355d.m();
            }
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.f0 f49357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.f0.b f49358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f49359c;

        public b(com.google.android.exoplayer2.source.f0 f0Var, com.google.android.exoplayer2.source.f0.b bVar, a aVar) {
            this.f49357a = f0Var;
            this.f49358b = bVar;
            this.f49359c = aVar;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class c implements r2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.x f49360a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f49364e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.google.android.exoplayer2.source.f0.a> f49362c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f49361b = new Object();

        public c(com.google.android.exoplayer2.source.f0 f0Var, boolean z10) {
            this.f49360a = new com.google.android.exoplayer2.source.x(f0Var, z10);
        }

        @Override // com.google.android.exoplayer2.r2
        public z3 a() {
            return this.f49360a.d0();
        }

        public void b(int i10) {
            this.f49363d = i10;
            this.f49364e = false;
            this.f49362c.clear();
        }

        @Override // com.google.android.exoplayer2.r2
        public Object getUid() {
            return this.f49361b;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public interface d {
        void d();
    }

    public t2(d dVar, @androidx.annotation.p0 com.google.android.exoplayer2.analytics.n1 n1Var, Handler handler) {
        this.f49345d = dVar;
        com.google.android.exoplayer2.source.n0.a aVar = new com.google.android.exoplayer2.source.n0.a();
        this.f49346e = aVar;
        com.google.android.exoplayer2.drm.s.a aVar2 = new com.google.android.exoplayer2.drm.s.a();
        this.f49347f = aVar2;
        this.f49348g = new HashMap<>();
        this.f49349h = new HashSet();
        if (n1Var != null) {
            aVar.g(handler, n1Var);
            aVar2.g(handler, n1Var);
        }
    }

    private void D(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f49342a.remove(i12);
            this.f49344c.remove(cVarRemove.f49361b);
            h(i12, -cVarRemove.f49360a.d0().w());
            cVarRemove.f49364e = true;
            if (this.f49351j) {
                v(cVarRemove);
            }
        }
    }

    private void h(int i10, int i11) {
        while (i10 < this.f49342a.size()) {
            this.f49342a.get(i10).f49363d += i11;
            i10++;
        }
    }

    private void k(c cVar) {
        b bVar = this.f49348g.get(cVar);
        if (bVar != null) {
            bVar.f49357a.m(bVar.f49358b);
        }
    }

    private void l() {
        Iterator<c> it = this.f49349h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f49362c.isEmpty()) {
                k(next);
                it.remove();
            }
        }
    }

    private void m(c cVar) {
        this.f49349h.add(cVar);
        b bVar = this.f49348g.get(cVar);
        if (bVar != null) {
            bVar.f49357a.l(bVar.f49358b);
        }
    }

    private static Object n(Object obj) {
        return com.google.android.exoplayer2.a.E(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public static com.google.android.exoplayer2.source.f0.a o(c cVar, com.google.android.exoplayer2.source.f0.a aVar) {
        for (int i10 = 0; i10 < cVar.f49362c.size(); i10++) {
            if (cVar.f49362c.get(i10).f47722d == aVar.f47722d) {
                return aVar.a(q(cVar, aVar.f47719a));
            }
        }
        return null;
    }

    private static Object p(Object obj) {
        return com.google.android.exoplayer2.a.F(obj);
    }

    private static Object q(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.H(cVar.f49361b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f49363d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(com.google.android.exoplayer2.source.f0 f0Var, z3 z3Var) {
        this.f49345d.d();
    }

    private void v(c cVar) {
        if (cVar.f49364e && cVar.f49362c.isEmpty()) {
            b bVar = (b) com.google.android.exoplayer2.util.a.g(this.f49348g.remove(cVar));
            bVar.f49357a.a(bVar.f49358b);
            bVar.f49357a.b(bVar.f49359c);
            bVar.f49357a.r(bVar.f49359c);
            this.f49349h.remove(cVar);
        }
    }

    private void z(c cVar) {
        com.google.android.exoplayer2.source.x xVar = cVar.f49360a;
        com.google.android.exoplayer2.source.f0.b bVar = new com.google.android.exoplayer2.source.f0.b() { // from class: com.google.android.exoplayer2.s2
            @Override // com.google.android.exoplayer2.source.f0.b
            public final void e(com.google.android.exoplayer2.source.f0 f0Var, z3 z3Var) {
                this.f47351b.u(f0Var, z3Var);
            }
        };
        a aVar = new a(cVar);
        this.f49348g.put(cVar, new b(xVar, bVar, aVar));
        xVar.j(com.google.android.exoplayer2.util.u0.A(), aVar);
        xVar.o(com.google.android.exoplayer2.util.u0.A(), aVar);
        xVar.d(bVar, this.f49352k);
    }

    public void A() {
        for (b bVar : this.f49348g.values()) {
            try {
                bVar.f49357a.a(bVar.f49358b);
            } catch (RuntimeException e10) {
                com.google.android.exoplayer2.util.u.e(f49341l, "Failed to release child source.", e10);
            }
            bVar.f49357a.b(bVar.f49359c);
            bVar.f49357a.r(bVar.f49359c);
        }
        this.f49348g.clear();
        this.f49349h.clear();
        this.f49351j = false;
    }

    public void B(com.google.android.exoplayer2.source.c0 c0Var) {
        c cVar = (c) com.google.android.exoplayer2.util.a.g(this.f49343b.remove(c0Var));
        cVar.f49360a.k(c0Var);
        cVar.f49362c.remove(((com.google.android.exoplayer2.source.w) c0Var).f49238b);
        if (!this.f49343b.isEmpty()) {
            l();
        }
        v(cVar);
    }

    public z3 C(int i10, int i11, com.google.android.exoplayer2.source.f1 f1Var) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f49350i = f1Var;
        D(i10, i11);
        return j();
    }

    public z3 E(List<c> list, com.google.android.exoplayer2.source.f1 f1Var) {
        D(0, this.f49342a.size());
        return f(this.f49342a.size(), list, f1Var);
    }

    public z3 F(com.google.android.exoplayer2.source.f1 f1Var) {
        int iR = r();
        if (f1Var.getLength() != iR) {
            f1Var = f1Var.d().g(0, iR);
        }
        this.f49350i = f1Var;
        return j();
    }

    public z3 f(int i10, List<c> list, com.google.android.exoplayer2.source.f1 f1Var) {
        if (!list.isEmpty()) {
            this.f49350i = f1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f49342a.get(i11 - 1);
                    cVar.b(cVar2.f49363d + cVar2.f49360a.d0().w());
                } else {
                    cVar.b(0);
                }
                h(i11, cVar.f49360a.d0().w());
                this.f49342a.add(i11, cVar);
                this.f49344c.put(cVar.f49361b, cVar);
                if (this.f49351j) {
                    z(cVar);
                    if (this.f49343b.isEmpty()) {
                        this.f49349h.add(cVar);
                    } else {
                        k(cVar);
                    }
                }
            }
        }
        return j();
    }

    public z3 g(@androidx.annotation.p0 com.google.android.exoplayer2.source.f1 f1Var) {
        if (f1Var == null) {
            f1Var = this.f49350i.d();
        }
        this.f49350i = f1Var;
        D(0, r());
        return j();
    }

    public com.google.android.exoplayer2.source.c0 i(com.google.android.exoplayer2.source.f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        Object objP = p(aVar.f47719a);
        com.google.android.exoplayer2.source.f0.a aVarA = aVar.a(n(aVar.f47719a));
        c cVar = (c) com.google.android.exoplayer2.util.a.g(this.f49344c.get(objP));
        m(cVar);
        cVar.f49362c.add(aVarA);
        com.google.android.exoplayer2.source.w wVarH = cVar.f49360a.h(aVarA, bVar, j10);
        this.f49343b.put(wVarH, cVar);
        l();
        return wVarH;
    }

    public z3 j() {
        if (this.f49342a.isEmpty()) {
            return z3.f52082b;
        }
        int iW = 0;
        for (int i10 = 0; i10 < this.f49342a.size(); i10++) {
            c cVar = this.f49342a.get(i10);
            cVar.f49363d = iW;
            iW += cVar.f49360a.d0().w();
        }
        return new i3(this.f49342a, this.f49350i);
    }

    public int r() {
        return this.f49342a.size();
    }

    public boolean t() {
        return this.f49351j;
    }

    public z3 w(int i10, int i11, com.google.android.exoplayer2.source.f1 f1Var) {
        return x(i10, i10 + 1, i11, f1Var);
    }

    public z3 x(int i10, int i11, int i12, com.google.android.exoplayer2.source.f1 f1Var) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f49350i = f1Var;
        if (i10 == i11 || i10 == i12) {
            return j();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iW = this.f49342a.get(iMin).f49363d;
        com.google.android.exoplayer2.util.u0.T0(this.f49342a, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f49342a.get(iMin);
            cVar.f49363d = iW;
            iW += cVar.f49360a.d0().w();
            iMin++;
        }
        return j();
    }

    public void y(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        com.google.android.exoplayer2.util.a.i(!this.f49351j);
        this.f49352k = u0Var;
        for (int i10 = 0; i10 < this.f49342a.size(); i10++) {
            c cVar = this.f49342a.get(i10);
            z(cVar);
            this.f49349h.add(cVar);
        }
        this.f49351j = true;
    }
}
