package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DependSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class c1 extends h4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final org.apache.tools.ant.types.resources.selectors.n f133815o = new org.apache.tools.ant.types.resources.selectors.k(new org.apache.tools.ant.types.resources.selectors.e());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final org.apache.tools.ant.types.resources.comparators.m f133816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final org.apache.tools.ant.types.resources.comparators.m f133817q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f133818l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f133819m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f133820n;

    /* JADX INFO: compiled from: DependSet.java */
    public static final class b implements org.apache.tools.ant.types.u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.apache.tools.ant.types.b0 f133821b;

        private b(org.apache.tools.ant.types.b0 b0Var) {
            this.f133821b = b0Var;
        }

        private boolean a() {
            File fileY2 = this.f133821b.y2();
            return fileY2 == null || fileY2.exists();
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return org.apache.tools.ant.types.t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            return a() ? this.f133821b.iterator() : org.apache.tools.ant.types.resources.f1.f136357k;
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            if (a()) {
                return this.f133821b.size();
            }
            return 0;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return org.apache.tools.ant.types.t1.b(this);
        }
    }

    /* JADX INFO: compiled from: DependSet.java */
    public static final class c extends org.apache.tools.ant.types.resources.i1 {
        private c(org.apache.tools.ant.types.u1 u1Var) {
            super.i2(u1Var);
            super.e2(c1.f133815o);
        }
    }

    static {
        org.apache.tools.ant.types.resources.comparators.d dVar = new org.apache.tools.ant.types.resources.comparators.d();
        f133816p = dVar;
        f133817q = new org.apache.tools.ant.types.resources.comparators.o(dVar);
    }

    private org.apache.tools.ant.types.s1 F2(org.apache.tools.ant.types.u1 u1Var) {
        return H2(u1Var, f133816p);
    }

    private org.apache.tools.ant.types.s1 G2(org.apache.tools.ant.types.u1 u1Var) {
        return H2(u1Var, f133817q);
    }

    private org.apache.tools.ant.types.s1 H2(org.apache.tools.ant.types.u1 u1Var, org.apache.tools.ant.types.resources.comparators.m mVar) {
        return (org.apache.tools.ant.types.s1) org.apache.tools.ant.util.h2.b(u1Var.iterator()).max(mVar).orElse(null);
    }

    private void I2(org.apache.tools.ant.types.u1 u1Var, org.apache.tools.ant.types.resources.selectors.n nVar) {
        org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
        i1Var.e2(nVar);
        i1Var.i2(u1Var);
        Iterator<org.apache.tools.ant.types.s1> it = i1Var.iterator();
        while (it.hasNext()) {
            x1("Warning: " + it.next() + " modified in the future.", 1);
        }
    }

    private void J2(org.apache.tools.ant.types.u1 u1Var, String str) {
        if (this.f133820n) {
            Iterator<org.apache.tools.ant.types.s1> it = u1Var.iterator();
            while (it.hasNext()) {
                log("Expected " + str + " " + it.next().v2() + " is missing.");
            }
        }
    }

    private void K2(org.apache.tools.ant.types.s1 s1Var, String str) {
        x1(s1Var.v2() + " is " + str + ", modified at " + new Date(s1Var.i2()), this.f133820n ? 2 : 3);
    }

    private boolean M2(org.apache.tools.ant.types.u1 u1Var, org.apache.tools.ant.types.u1 u1Var2) {
        org.apache.tools.ant.types.resources.selectors.d dVar = new org.apache.tools.ant.types.resources.selectors.d();
        dVar.i(System.currentTimeMillis());
        dVar.k(org.apache.tools.ant.types.a2.f136102f);
        dVar.h(0L);
        I2(this.f133819m, dVar);
        org.apache.tools.ant.types.u1 cVar = new c(this.f133819m);
        int size = cVar.size();
        if (size > 0) {
            x1(size + " nonexistent targets", 3);
            J2(cVar, "target");
            return false;
        }
        org.apache.tools.ant.types.s1 s1VarG2 = G2(this.f133819m);
        K2(s1VarG2, "oldest target file");
        I2(this.f133818l, dVar);
        org.apache.tools.ant.types.u1 cVar2 = new c(this.f133818l);
        int size2 = cVar2.size();
        if (size2 <= 0) {
            org.apache.tools.ant.types.s1 s1VarF2 = F2(this.f133818l);
            K2(s1VarF2, "newest source");
            return s1VarG2.i2() >= s1VarF2.i2();
        }
        x1(size2 + " nonexistent sources", 3);
        J2(cVar2, "source");
        return false;
    }

    public void A2(org.apache.tools.ant.types.b0 b0Var) {
        D2().f2(b0Var);
    }

    public void B2(org.apache.tools.ant.types.a0 a0Var) {
        E2().f2(a0Var);
    }

    public void C2(org.apache.tools.ant.types.b0 b0Var) {
        E2().f2(new b(b0Var));
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        org.apache.tools.ant.types.resources.w1 w1Var = this.f133818l;
        if (w1Var == null) {
            throw new BuildException("At least one set of source resources must be specified");
        }
        if (this.f133819m == null) {
            throw new BuildException("At least one set of target files must be specified");
        }
        if (w1Var.isEmpty() || this.f133819m.isEmpty() || M2(this.f133818l, this.f133819m)) {
            return;
        }
        x1("Deleting all target files.", 3);
        if (this.f133820n) {
            for (String str : this.f133819m.z2()) {
                log("Deleting " + str);
            }
        }
        a1 a1Var = new a1();
        a1Var.B1(this);
        a1Var.y2(this.f133819m);
        a1Var.b2();
    }

    public synchronized org.apache.tools.ant.types.resources.w1 D2() {
        org.apache.tools.ant.types.resources.w1 w1Var;
        w1Var = this.f133818l;
        if (w1Var == null) {
            w1Var = new org.apache.tools.ant.types.resources.w1();
        }
        this.f133818l = w1Var;
        return w1Var;
    }

    public synchronized org.apache.tools.ant.types.o0 E2() {
        org.apache.tools.ant.types.o0 o0Var;
        o0Var = this.f133819m;
        if (o0Var == null) {
            o0Var = new org.apache.tools.ant.types.o0(b());
        }
        this.f133819m = o0Var;
        return o0Var;
    }

    public void L2(boolean z10) {
        this.f133820n = z10;
    }

    public void z2(org.apache.tools.ant.types.a0 a0Var) {
        D2().f2(a0Var);
    }
}
