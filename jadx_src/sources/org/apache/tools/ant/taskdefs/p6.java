package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: SubAnt.java */
/* JADX INFO: loaded from: classes5.dex */
public class p6 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Ant f135540l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135541m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135542n = x2();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135543o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135544p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135545q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f135546r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f135547s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f135548t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<b5> f135549u = new Vector();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<Ant.b> f135550v = new Vector();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<org.apache.tools.ant.types.j1> f135551w = new Vector();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<Ant.c> f135552x = new Vector();

    private static void r2(b5 b5Var, b5 b5Var2) {
        b5Var.P2(b5Var2.r2());
        if (b5Var2.y2() != null) {
            b5Var.Z2(b5Var2.y2());
        }
        if (b5Var2.l0() != null) {
            b5Var.N2(b5Var2.l0());
        }
        if (b5Var2.v2() != null) {
            b5Var.U2(b5Var2.v2());
        }
        if (b5Var2.s2() != null) {
            b5Var.Q2(b5Var2.s2());
        }
        if (b5Var2.u2() != null) {
            b5Var.S2(b5Var2.u2());
        }
        if (b5Var2.q2() != null) {
            b5Var.M2(b5Var2.q2());
        }
        if (b5Var2.p2() != null) {
            b5Var.K2(b5Var2.p2());
        }
    }

    private Ant s2(File file) {
        final Ant ant = new Ant(this);
        ant.V1();
        String str = this.f135541m;
        if (str != null && !str.isEmpty()) {
            ant.H2(this.f135541m);
        }
        String str2 = this.f135548t;
        if (str2 != null) {
            ant.G2(str2);
        }
        if (file != null) {
            ant.D2(file);
        } else {
            ant.I2(true);
        }
        ant.E2(this.f135545q);
        this.f135549u.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.m6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p6.z2(ant, (b5) obj);
            }
        });
        this.f135551w.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.n6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ant.o2((org.apache.tools.ant.types.j1) obj);
            }
        });
        ant.F2(this.f135546r);
        this.f135550v.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.o6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ant.p2((Ant.b) obj);
            }
        });
        return ant;
    }

    private void v2(File file, File file2) throws BuildException {
        if (!file.exists() || file.isDirectory() || !file.canRead()) {
            String str = "Invalid file: " + file;
            if (this.f135547s) {
                throw new BuildException(str);
            }
            x1(str, 1);
            return;
        }
        this.f135540l = s2(file2);
        String absolutePath = file.getAbsolutePath();
        this.f135540l.C2(absolutePath);
        List<Ant.c> list = this.f135552x;
        final Ant ant = this.f135540l;
        Objects.requireNonNull(ant);
        list.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.l6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ant.n2((Ant.c) obj);
            }
        });
        try {
            try {
                if (this.f135544p) {
                    x1("Executing: " + absolutePath, 2);
                }
                this.f135540l.D1();
            } catch (Throwable th2) {
                this.f135540l = null;
                throw th2;
            }
        } catch (BuildException e10) {
            if (this.f135547s || y2(e10)) {
                throw e10;
            }
            x1("Failure for target '" + this.f135541m + "' of: " + absolutePath + "\n" + e10.getMessage(), 1);
        } catch (Throwable th3) {
            if (this.f135547s || y2(th3)) {
                throw new BuildException(th3);
            }
            x1("Failure for target '" + this.f135541m + "' of: " + absolutePath + "\n" + th3.toString(), 1);
        }
        this.f135540l = null;
    }

    private org.apache.tools.ant.types.o0 w2() {
        if (this.f135539k == null) {
            this.f135539k = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135539k;
    }

    private boolean y2(Throwable th2) {
        if (th2 instanceof BuildException) {
            return y2(th2.getCause());
        }
        return (th2 instanceof OutOfMemoryError) || (th2 instanceof ThreadDeath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z2(Ant ant, b5 b5Var) {
        r2(ant.s2(), b5Var);
    }

    public void A2(String str) {
        this.f135542n = str;
    }

    public void B2(org.apache.tools.ant.types.o0 o0Var) {
        w2().n2(o0Var);
    }

    public void C2(org.apache.tools.ant.types.q1 q1Var) {
        t2().c2(q1Var);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0113, please report this as an issue */
    @Override // org.apache.tools.ant.u2
    public void D1() {
        File file;
        String path;
        File file2;
        org.apache.tools.ant.types.o0 o0Var = this.f135539k;
        if (o0Var == null) {
            throw new BuildException("No buildpath specified");
        }
        String[] strArrZ2 = o0Var.z2();
        if (strArrZ2.length < 1) {
            x1("No sub-builds to iterate on", 1);
            return;
        }
        BuildException buildException = null;
        for (String str : strArrZ2) {
            try {
                file = new File(str);
                try {
                    if (file.isDirectory()) {
                        if (this.f135544p) {
                            path = file.getPath();
                            try {
                                x1("Entering directory: " + path + "\n", 2);
                            } catch (RuntimeException e10) {
                                e = e10;
                                if (!b().I0()) {
                                    if (this.f135544p && path != null) {
                                        x1("Leaving directory: " + path + "\n", 2);
                                    }
                                    throw e;
                                }
                            } catch (Throwable th2) {
                                e = th2;
                                if (!b().I0()) {
                                    if (this.f135544p && path != null) {
                                        x1("Leaving directory: " + path + "\n", 2);
                                    }
                                    throw new BuildException(e);
                                }
                            }
                        } else {
                            path = null;
                        }
                        File file3 = this.f135543o;
                        if (file3 != null) {
                            file = file3;
                            file2 = file;
                        } else {
                            file = new File(file, this.f135542n);
                            file2 = null;
                        }
                    } else {
                        file2 = null;
                        path = null;
                    }
                    v2(file, file2);
                    if (this.f135544p && path != null) {
                        x1("Leaving directory: " + path + "\n", 2);
                    }
                    e = null;
                } catch (RuntimeException e11) {
                    e = e11;
                    path = null;
                    if (!b().I0()) {
                        if (this.f135544p) {
                            x1("Leaving directory: " + path + "\n", 2);
                        }
                        throw e;
                    }
                    if (e != null) {
                        if (e instanceof BuildException) {
                            x1("File '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                            if (buildException == null) {
                                buildException = (BuildException) e;
                            }
                        } else {
                            x1("Target '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                            x1(org.apache.tools.ant.util.j2.b(e), 0);
                            if (buildException == null) {
                                buildException = new BuildException(e);
                            }
                        }
                        if (!this.f135544p) {
                        }
                    }
                } catch (Throwable th3) {
                    e = th3;
                    path = null;
                    if (!b().I0()) {
                        if (this.f135544p) {
                            x1("Leaving directory: " + path + "\n", 2);
                        }
                        throw new BuildException(e);
                    }
                    if (e != null) {
                        if (e instanceof BuildException) {
                            x1("File '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                            if (buildException == null) {
                                buildException = (BuildException) e;
                            }
                        } else {
                            x1("Target '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                            x1(org.apache.tools.ant.util.j2.b(e), 0);
                            if (buildException == null) {
                                buildException = new BuildException(e);
                            }
                        }
                        if (!this.f135544p) {
                        }
                    }
                }
            } catch (RuntimeException e12) {
                e = e12;
                file = null;
            } catch (Throwable th4) {
                e = th4;
                file = null;
            }
            if (e != null) {
                if (e instanceof BuildException) {
                    x1("File '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                    if (buildException == null) {
                        buildException = (BuildException) e;
                    }
                } else {
                    x1("Target '" + file + "' failed with message '" + e.getMessage() + "'.", 0);
                    x1(org.apache.tools.ant.util.j2.b(e), 0);
                    if (buildException == null) {
                        buildException = new BuildException(e);
                    }
                }
                if (!this.f135544p && path != null) {
                    x1("Leaving directory: " + path + "\n", 2);
                }
            }
        }
        if (buildException != null) {
            throw buildException;
        }
    }

    public void D2(boolean z10) {
        this.f135547s = z10;
    }

    public void E2(File file) {
        this.f135543o = file;
    }

    public void F2(boolean z10) {
        this.f135545q = z10;
    }

    public void G2(boolean z10) {
        this.f135546r = z10;
    }

    public void H2(String str) {
        this.f135548t = str;
    }

    public void I2(String str) {
        this.f135541m = str;
    }

    public void J2(boolean z10) {
        this.f135544p = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void O1(String str) {
        Ant ant = this.f135540l;
        if (ant != null) {
            ant.O1(str);
        } else {
            super.O1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void Q1(String str) {
        Ant ant = this.f135540l;
        if (ant != null) {
            ant.Q1(str);
        } else {
            super.Q1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void R1(String str) {
        Ant ant = this.f135540l;
        if (ant != null) {
            ant.R1(str);
        } else {
            super.R1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public int S1(byte[] bArr, int i10, int i11) throws IOException {
        Ant ant = this.f135540l;
        return ant != null ? ant.S1(bArr, i10, i11) : super.S1(bArr, i10, i11);
    }

    @Override // org.apache.tools.ant.u2
    public void U1(String str) {
        Ant ant = this.f135540l;
        if (ant != null) {
            ant.U1(str);
        } else {
            super.U1(str);
        }
    }

    public void j2(org.apache.tools.ant.types.u1 u1Var) {
        w2().f2(u1Var);
    }

    public void k2(Ant.c cVar) {
        if (cVar.a().isEmpty()) {
            throw new BuildException("target name must not be empty");
        }
        this.f135552x.add(cVar);
    }

    public void l2(org.apache.tools.ant.types.v vVar) {
        j2(vVar);
    }

    public void m2(org.apache.tools.ant.types.a0 a0Var) {
        j2(a0Var);
    }

    public void n2(org.apache.tools.ant.types.b0 b0Var) {
        j2(b0Var);
    }

    public void o2(b5 b5Var) {
        this.f135549u.add(b5Var);
    }

    public void p2(org.apache.tools.ant.types.j1 j1Var) {
        this.f135551w.add(j1Var);
    }

    public void q2(Ant.b bVar) {
        this.f135550v.add(bVar);
    }

    public org.apache.tools.ant.types.o0 t2() {
        return w2().u2();
    }

    public org.apache.tools.ant.types.o0.a u2() {
        return w2().v2();
    }

    protected String x2() {
        return org.apache.tools.ant.v1.f137078v;
    }
}
