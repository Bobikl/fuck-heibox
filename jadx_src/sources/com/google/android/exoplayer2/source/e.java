package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e<T> extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f47995h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Handler f47996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.upstream.u0 f47997j;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements n0, com.google.android.exoplayer2.drm.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.google.android.exoplayer2.util.p0
        private final T f47998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n0.a f47999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.s.a f48000d;

        public a(T t10) {
            this.f47999c = e.this.x(null);
            this.f48000d = e.this.v(null);
            this.f47998b = t10;
        }

        private boolean a(int i10, @androidx.annotation.p0 f0.a aVar) {
            f0.a aVarK;
            if (aVar != null) {
                aVarK = e.this.K(this.f47998b, aVar);
                if (aVarK == null) {
                    return false;
                }
            } else {
                aVarK = null;
            }
            int iP = e.this.P(this.f47998b, i10);
            n0.a aVar2 = this.f47999c;
            if (aVar2.f48590a != iP || !com.google.android.exoplayer2.util.u0.c(aVar2.f48591b, aVarK)) {
                this.f47999c = e.this.w(iP, aVarK, 0L);
            }
            com.google.android.exoplayer2.drm.s.a aVar3 = this.f48000d;
            if (aVar3.f44752a == iP && com.google.android.exoplayer2.util.u0.c(aVar3.f44753b, aVarK)) {
                return true;
            }
            this.f48000d = e.this.u(iP, aVarK);
            return true;
        }

        private y b(y yVar) {
            long jM = e.this.M(this.f47998b, yVar.f49287f);
            long jM2 = e.this.M(this.f47998b, yVar.f49288g);
            return (jM == yVar.f49287f && jM2 == yVar.f49288g) ? yVar : new y(yVar.f49282a, yVar.f49283b, yVar.f49284c, yVar.f49285d, yVar.f49286e, jM, jM2);
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void A(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar) {
            if (a(i10, aVar)) {
                this.f47999c.s(uVar, b(yVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void G(int i10, @androidx.annotation.p0 f0.a aVar, y yVar) {
            if (a(i10, aVar)) {
                this.f47999c.E(b(yVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void L(int i10, @androidx.annotation.p0 f0.a aVar) {
            if (a(i10, aVar)) {
                this.f48000d.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void N(int i10, @androidx.annotation.p0 f0.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f48000d.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void O(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f47999c.y(uVar, b(yVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void Q(int i10, @androidx.annotation.p0 f0.a aVar) {
            if (a(i10, aVar)) {
                this.f48000d.j();
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void T(int i10, @androidx.annotation.p0 f0.a aVar, y yVar) {
            if (a(i10, aVar)) {
                this.f47999c.j(b(yVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void U(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar) {
            if (a(i10, aVar)) {
                this.f47999c.B(uVar, b(yVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void W(int i10, @androidx.annotation.p0 f0.a aVar) {
            if (a(i10, aVar)) {
                this.f48000d.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public /* synthetic */ void Y(int i10, f0.a aVar) {
            com.google.android.exoplayer2.drm.l.d(this, i10, aVar);
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void j0(int i10, @androidx.annotation.p0 f0.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f48000d.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.n0
        public void q0(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar) {
            if (a(i10, aVar)) {
                this.f47999c.v(uVar, b(yVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void r0(int i10, @androidx.annotation.p0 f0.a aVar) {
            if (a(i10, aVar)) {
                this.f48000d.m();
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f48002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.b f48003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<T>.a f48004c;

        public b(f0 f0Var, f0.b bVar, e<T>.a aVar) {
            this.f48002a = f0Var;
            this.f48003b = bVar;
            this.f48004c = aVar;
        }
    }

    protected e() {
    }

    @Override // com.google.android.exoplayer2.source.a
    @androidx.annotation.i
    protected void B() {
        for (b<T> bVar : this.f47995h.values()) {
            bVar.f48002a.l(bVar.f48003b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    @androidx.annotation.i
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        this.f47997j = u0Var;
        this.f47996i = com.google.android.exoplayer2.util.u0.y();
    }

    @Override // com.google.android.exoplayer2.source.a
    @androidx.annotation.i
    protected void F() {
        for (b<T> bVar : this.f47995h.values()) {
            bVar.f48002a.a(bVar.f48003b);
            bVar.f48002a.b(bVar.f48004c);
            bVar.f48002a.r(bVar.f48004c);
        }
        this.f47995h.clear();
    }

    protected final void I(@com.google.android.exoplayer2.util.p0 T t10) {
        b bVar = (b) com.google.android.exoplayer2.util.a.g(this.f47995h.get(t10));
        bVar.f48002a.m(bVar.f48003b);
    }

    protected final void J(@com.google.android.exoplayer2.util.p0 T t10) {
        b bVar = (b) com.google.android.exoplayer2.util.a.g(this.f47995h.get(t10));
        bVar.f48002a.l(bVar.f48003b);
    }

    @androidx.annotation.p0
    protected f0.a K(@com.google.android.exoplayer2.util.p0 T t10, f0.a aVar) {
        return aVar;
    }

    protected long M(@com.google.android.exoplayer2.util.p0 T t10, long j10) {
        return j10;
    }

    protected int P(@com.google.android.exoplayer2.util.p0 T t10, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public abstract void R(@com.google.android.exoplayer2.util.p0 T t10, f0 f0Var, z3 z3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V(@com.google.android.exoplayer2.util.p0 final T t10, f0 f0Var) {
        com.google.android.exoplayer2.util.a.a(!this.f47995h.containsKey(t10));
        f0.b bVar = new f0.b() { // from class: com.google.android.exoplayer2.source.d
            @Override // com.google.android.exoplayer2.source.f0.b
            public final void e(f0 f0Var2, z3 z3Var) {
                this.f47717b.R(t10, f0Var2, z3Var);
            }
        };
        a aVar = new a(t10);
        this.f47995h.put(t10, new b<>(f0Var, bVar, aVar));
        f0Var.j((Handler) com.google.android.exoplayer2.util.a.g(this.f47996i), aVar);
        f0Var.o((Handler) com.google.android.exoplayer2.util.a.g(this.f47996i), aVar);
        f0Var.d(bVar, this.f47997j);
        if (C()) {
            return;
        }
        f0Var.m(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(@com.google.android.exoplayer2.util.p0 T t10) {
        b bVar = (b) com.google.android.exoplayer2.util.a.g(this.f47995h.remove(t10));
        bVar.f48002a.a(bVar.f48003b);
        bVar.f48002a.b(bVar.f48004c);
        bVar.f48002a.r(bVar.f48004c);
    }

    @Override // com.google.android.exoplayer2.source.f0
    @androidx.annotation.i
    public void f() throws IOException {
        Iterator<b<T>> it = this.f47995h.values().iterator();
        while (it.hasNext()) {
            it.next().f48002a.f();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    @androidx.annotation.i
    protected void z() {
        for (b<T> bVar : this.f47995h.values()) {
            bVar.f48002a.m(bVar.f48003b);
        }
    }
}
