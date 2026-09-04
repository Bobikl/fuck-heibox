package com.billy.android.swipe;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: SwipeConsumerExclusiveGroup.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<f> f40435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f40436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r6.a f40439e;

    /* JADX INFO: compiled from: SwipeConsumerExclusiveGroup.java */
    public class a extends r6.a {
        a() {
        }

        @Override // r6.a, r6.b
        public void d(SmartSwipeWrapper smartSwipeWrapper, f fVar, int i10) {
            g.this.g(fVar);
        }

        @Override // r6.a, r6.b
        public void e(SmartSwipeWrapper smartSwipeWrapper, f fVar, int i10) {
            if (fVar == g.this.f40436b) {
                g.this.i();
            }
        }
    }

    public g() {
        this.f40435a = new LinkedList();
        this.f40438d = false;
        this.f40439e = new a();
        this.f40437c = true;
    }

    public g(boolean z10) {
        this.f40435a = new LinkedList();
        this.f40438d = false;
        this.f40439e = new a();
        this.f40437c = z10;
    }

    public void b(f fVar) {
        if (this.f40435a.contains(fVar)) {
            return;
        }
        this.f40435a.add(fVar);
        fVar.b(this.f40439e);
    }

    public void c() {
        while (!this.f40435a.isEmpty()) {
            f fVarRemove = this.f40435a.remove(0);
            if (fVarRemove != null) {
                fVarRemove.s1(this.f40439e);
            }
        }
    }

    public f d() {
        return this.f40436b;
    }

    public boolean e() {
        return this.f40438d;
    }

    public boolean f() {
        return this.f40437c;
    }

    public void g(f fVar) {
        h(fVar, this.f40437c);
    }

    public void h(f fVar, boolean z10) {
        if (this.f40436b == fVar) {
            return;
        }
        this.f40436b = fVar;
        for (f fVar2 : this.f40435a) {
            if (fVar2 != this.f40436b) {
                if (this.f40438d && !fVar2.o0()) {
                    fVar2.N0();
                }
                fVar2.j(z10);
            }
        }
    }

    public void i() {
        f fVar = this.f40436b;
        if (fVar != null) {
            fVar.j(this.f40437c);
            this.f40436b = null;
        }
        if (this.f40438d) {
            for (f fVar2 : this.f40435a) {
                if (fVar2.o0()) {
                    fVar2.X1();
                }
            }
        }
    }

    public void j(f fVar) {
        if (fVar != null) {
            this.f40435a.remove(fVar);
            fVar.s1(this.f40439e);
        }
    }

    public void k(boolean z10) {
        this.f40438d = z10;
    }

    public void l(boolean z10) {
        this.f40437c = z10;
    }
}
